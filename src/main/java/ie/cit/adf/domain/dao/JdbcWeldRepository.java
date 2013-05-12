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
		return jdbcTemplate.queryForObject("SELECT * FROM WELD WHERE ID=?",
				weldMapper, id);
	}
	
	@Secured({"ROLE_USER", "ROLE_GUEST"})
	public List<Weld> getAll() {
		return jdbcTemplate.query("SELECT * FROM WELD", weldMapper);
	}

	public void add(Weld weld) {
		System.out.println("About to create weld in DB with isonum: "
				+ weld.getIsonum());
		jdbcTemplate.update("INSERT INTO WELD VALUES(?,?,?,?,?,?,?,?,?,?,?)",
				weld.getId(), weld.getType(), weld.getWeldnum(),
				weld.getSpoolnum(), weld.getIsonum(), weld.getSize(),
				weld.isFw() ? 1 : 0, weld.getWeldernum(),
				weld.getDate_welded(), weld.getFitting1(), weld.getFitting2());
	}

	/*
	 * private String getCurrentUser() { return
	 * SecurityContextHolder.getContext().getAuthentication().getName(); }
	 */

	public void delete(String weldId) {
		jdbcTemplate.update("DELETE FROM WELD WHERE ID=?", weldId);
	}

	public void update(Weld weld) {
		jdbcTemplate
				.update("UPDATE WELD SET WELDTYPE=?, WELDNUM=?, SPOOLNUM=?,"
						+ " ISONUM=?, SIZE=?, FW=?, WELDERNUM=?, DATE_WELDED=?, FITTING1=?, FITTING2=? WHERE ID=?",
						weld.getType(), weld.getWeldnum(), weld.getSpoolnum(),
						weld.getIsonum(), weld.getSize(), weld.isFw() ? 1 : 0,
						weld.getWeldernum(), weld.getDate_welded(),
						weld.getFitting1(), weld.getFitting2(), weld.getId());
	}

}

class WeldMapper implements RowMapper<Weld> {
	public Weld mapRow(ResultSet rs, int rowNum) throws SQLException {
		Weld weld = new Weld();
		weld.setId(rs.getString("ID"));
		weld.setType(rs.getString("WELDTYPE"));
		weld.setWeldnum(rs.getString("WELDNUM"));
		weld.setSpoolnum(rs.getString("SPOOLNUM"));
		weld.setIsonum(rs.getString("ISONUM"));
		weld.setSize(rs.getInt("SIZE"));
		weld.setFw(rs.getInt("FW") != 0);
		weld.setWeldernum(rs.getString("WELDERNUM"));
		weld.setDate_welded(rs.getDate("DATE_WELDED"));
		weld.setFitting1(rs.getString("FITTING1"));
		weld.setFitting2(rs.getString("FITTING2"));
		return weld;
	}
}
