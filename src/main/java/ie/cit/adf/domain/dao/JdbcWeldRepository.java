package ie.cit.adf.domain.dao;

import ie.cit.adf.domain.Weld;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.security.access.annotation.Secured;
//import org.springframework.security.access.annotation.Secured;
//import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.context.SecurityContextHolder;

@Secured("ROLE_USER")//Secures all of the methods in the class.
public class JdbcWeldRepository implements WeldRepository {

	private JdbcTemplate jdbcTemplate;
	private WeldMapper weldMapper = new WeldMapper();

	public JdbcWeldRepository(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	private String getCurrentUser() {
		return SecurityContextHolder.getContext().getAuthentication().getName();
	}
	
	@Secured({"ROLE_USER", "ROLE_GUEST"})
	public Weld findById(String id) {
		return jdbcTemplate.queryForObject("SELECT * FROM fb_weld WHERE ID=?",
				weldMapper, id);
	}
	
	@Secured({"ROLE_USER", "ROLE_GUEST"})
	public List<Weld> getAll() {
		return jdbcTemplate.query("SELECT * FROM fb_weld", weldMapper);
	}

	public void add(Weld weld) {
		System.out.println("About to create weld in DB with isonum: "
				+ weld.getIsonum());
		jdbcTemplate.update("INSERT INTO fb_weld VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
				weld.getId(), weld.getKtn(), weld.getKco(), 
				weld.getType(), weld.getWeldnum(), weld.getSpoolnum(),
				weld.getIsonum(), weld.getSize(), weld.isFw() ? 1 : 0,
				weld.getWeldernum(), weld.getDate_welded(),
				weld.getFitting1(), weld.getFitting2(), weld.getWld_heat1(),
				weld.getWld_heat2();
	}

	/*
	 * private String getCurrentUser() { return
	 * SecurityContextHolder.getContext().getAuthentication().getName(); }
	 */

	public void delete(String weldId) {
		jdbcTemplate.update("DELETE FROM fb_weld WHERE ID=?", weldId);
	}

	public void update(Weld weld) {
		jdbcTemplate
				.update("UPDATE fb_weld SET ktn=?, kco=?, wty_code=?, wld_num=?, spl_num=?,"
						+ " iso_num=?, pdr_size=?, wld_fw=?, wdr_num=?, wld_wdate=?, fit_fitting1=?, fit_fitting2=?, wld_heat1=?, wld_heat2=? WHERE id=?",
						weld.getKtn(), weld.getKco(), 
						weld.getType(), weld.getWeldnum(), weld.getSpoolnum(),
						weld.getIsonum(), weld.getSize(), weld.isFw() ? 1 : 0,
						weld.getWeldernum(), weld.getDate_welded(),
						weld.getFitting1(), weld.getFitting2(), weld.getWld_heat1(),
						weld.getWld_heat2(), weld.getId());
	}

}

class WeldMapper implements RowMapper<Weld> {
	public Weld mapRow(ResultSet rs, int rowNum) throws SQLException {

		Weld weld = new Weld();
		weld.setId(rs.getString("ID"));
		weld.setFw(rs.getInt("ktn") != 0);
		weld.setFw(rs.getInt("kco") != 0);
		weld.setType(rs.getString("wty_code"));
		weld.setWeldnum(rs.getString("wld_num"));
		weld.setSpoolnum(rs.getString("spl_num"));
		weld.setIsonum(rs.getString("iso_num"));
		weld.setSize(rs.getString("pdr_size"));
		weld.setFw(rs.getInt("wld_fw") != 0);
		weld.setWeldernum(rs.getString("wdr_num"));
		weld.setDate_welded(rs.getDate("wld_wdate"));
		weld.setFitting1(rs.getString("fit_fitting1"));
		weld.setFitting2(rs.getString("fit_fitting2"));
		weld.setFitting1(rs.getString("wld_heat1"));
		weld.setFitting2(rs.getString("wld_heat2"));
		return weld;
	}
}
