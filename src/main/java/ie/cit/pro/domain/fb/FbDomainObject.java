package ie.cit.pro.domain.fb;

import java.util.UUID;

public class FbDomainObject {

	private String fbDomainObjectName;
	private String id;

	public FbDomainObject()
	{
		id = UUID.randomUUID().toString();
	}
	public String getFbDomainObjectName() {
		return fbDomainObjectName;
	}

	public void setFbDomainObjectName(String fbDomainObjectName) {
		this.fbDomainObjectName = fbDomainObjectName;
	}
	
	
}
