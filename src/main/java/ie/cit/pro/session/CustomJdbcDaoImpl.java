package ie.cit.pro.session;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;
import org.springframework.security.core.userdetails.UserDetails;

public class CustomJdbcDaoImpl extends JdbcDaoImpl {

@Override
protected List<UserDetails> loadUsersByUsername(String username) {
    return getJdbcTemplate().query(getUsersByUsernameQuery(), new String[] {username}, new RowMapper<UserDetails>() {
        public UserDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
        	
            String username = rs.getString(1);
            String password = rs.getString(2);
            boolean enabled = rs.getBoolean(3);
            Integer ktn = rs.getInt(4);
            System.out.println("HERE>>>LOGGING IN...**********username: " + username + " password: " + password + " ktn: " + ktn.toString());
            
            return new CustomUser(ktn, username, password, enabled, true, true, true, AuthorityUtils.NO_AUTHORITIES);
        }

    });
}

protected UserDetails createUserDetails(String username, UserDetails userFromUserQuery, List<GrantedAuthority> combinedAuthorities) {
    String returnUsername = userFromUserQuery.getUsername();

    if (!isUsernameBasedPrimaryKey()) {
        returnUsername = username;
    }
    System.out.println("HERE2>>>LOGGING IN...**********username: " + username + " userFromUserQuery.getPassword(): " + userFromUserQuery.getPassword() + " (CustomUser)userFromUserQuery).getKtn(): " + ((CustomUser)userFromUserQuery).getKtn().toString());

    return new CustomUser(((CustomUser)userFromUserQuery).getKtn(), returnUsername, userFromUserQuery.getPassword(), userFromUserQuery.isEnabled(), true, true, true, combinedAuthorities);
}

}