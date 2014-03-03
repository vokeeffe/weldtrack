package ie.cit.pro.session;


import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class CustomUser extends User{
	

	private static final long serialVersionUID = 1L;
	private Integer ktn;


	public CustomUser(Integer ktn, String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) throws IllegalArgumentException{
		
		super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
		this.setKtn(ktn);
	}


	public Integer getKtn() {
		return ktn;
	}

	public void setKtn(Integer ktn) {
		this.ktn = ktn;
	}
	
	public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(super.toString()).append(": ");
        sb.append("ktn: ").append(this.ktn).append("; ");
        return sb.toString();
    }

}
