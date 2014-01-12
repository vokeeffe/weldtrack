package ie.cit.pro.services;

import java.util.ArrayList;
import java.util.List;

import ie.cit.pro.domain.au.AuAuthority;
import ie.cit.pro.domain.au.AuGroup;
import ie.cit.pro.domain.au.AuGroupAuthority;
import ie.cit.pro.domain.au.AuGroupMember;
import ie.cit.pro.domain.au.AuUser;
import ie.cit.pro.domain.dao.DataRepository;

import org.springframework.transaction.annotation.Transactional;

public class AuServiceImpl implements AuService {

	private final DataRepository repo;
	
	// Constructor
	public AuServiceImpl(DataRepository repo) {
		this.repo = repo;
	}
	
	/***************************AU_USER***************************/
	public AuUser getAuUser(String id) {
		AuUser auUser = new AuUser();
		auUser.setId(id);
		return repo.findById(auUser);
	}

	public List<AuUser> getAllAuUsers() {
		return repo.getAllAuUsers();
	}

	public AuUser createAuUser(AuUser auUser) {
		repo.add(auUser);
		return auUser;
	}

	@Transactional
	public void deleteAuUser(String id) {
		AuUser auUser = new AuUser();
		auUser.setId(id);
		auUser = repo.findById(auUser);
		if (auUser != null) {
			repo.delete(auUser);
		}
	}

	@Transactional
	public void updateAuUser(AuUser auUser) {
		if (repo.findById(auUser) != null) {
			repo.update(auUser);
		}
	}


	/***************************AU_AUTHORITY***************************/
	public AuAuthority getAuAuthority(String id) {
		AuAuthority auAuthority = new AuAuthority();
		auAuthority.setId(id);
		return repo.findById(auAuthority);
	}

	public List<AuAuthority> getAllAuAuthoritys() {
		return repo.getAllAuAuthoritys();
	}

	public AuAuthority createAuAuthority(AuAuthority auAuthority) {
		repo.add(auAuthority);
		return auAuthority;
	}

	@Transactional
	public void deleteAuAuthority(String id) {
		AuAuthority auAuthority = new AuAuthority();
		auAuthority.setId(id);
		auAuthority = repo.findById(auAuthority);
		if (auAuthority != null) {
			repo.delete(auAuthority);
		}
	}

	@Transactional
	public void updateAuAuthority(AuAuthority auAuthority) {
		if (repo.findById(auAuthority) != null) {
			repo.update(auAuthority);
		}
	}


	/***************************AU_GROUP***************************/
	public AuGroup getAuGroup(String id) {
		AuGroup auGroup = new AuGroup();
		auGroup.setId(id);
		return repo.findById(auGroup);
	}

	public List<AuGroup> getAllAuGroups() {
		return repo.getAllAuGroups();
	}

	public AuGroup createAuGroup(AuGroup auGroup) {
		repo.add(auGroup);
		return auGroup;
	}

	@Transactional
	public void deleteAuGroup(String id) {
		AuGroup auGroup = new AuGroup();
		auGroup.setId(id);
		auGroup = repo.findById(auGroup);
		if (auGroup != null) {
			repo.delete(auGroup);
		}
	}

	@Transactional
	public void updateAuGroup(AuGroup auGroup) {
		if (repo.findById(auGroup) != null) {
			repo.update(auGroup);
		}
	}


	/***************************AU_GROUP_AUTHORITY***************************/
	public AuGroupAuthority getAuGroupAuthority(String id) {
		AuGroupAuthority auGroupAuthority = new AuGroupAuthority();
		auGroupAuthority.setId(id);
		return repo.findById(auGroupAuthority);
	}

	public List<AuGroupAuthority> getAllAuGroupAuthoritys() {
		return repo.getAllAuGroupAuthoritys();
	}

	public AuGroupAuthority createAuGroupAuthority(AuGroupAuthority auGroupAuthority) {
		repo.add(auGroupAuthority);
		return auGroupAuthority;
	}

	@Transactional
	public void deleteAuGroupAuthority(String id) {
		AuGroupAuthority auGroupAuthority = new AuGroupAuthority();
		auGroupAuthority.setId(id);
		auGroupAuthority = repo.findById(auGroupAuthority);
		if (auGroupAuthority != null) {
			repo.delete(auGroupAuthority);
		}
	}

	@Transactional
	public void updateAuGroupAuthority(AuGroupAuthority auGroupAuthority) {
		if (repo.findById(auGroupAuthority) != null) {
			repo.update(auGroupAuthority);
		}
	}


	/***************************AU_GROUP_MEMBER***************************/
	public AuGroupMember getAuGroupMember(String id) {
		AuGroupMember auGroupMember = new AuGroupMember();
		auGroupMember.setId(id);
		return repo.findById(auGroupMember);
	}

	public List<AuGroupMember> getAllAuGroupMembers() {
		return repo.getAllAuGroupMembers();
	}

	public AuGroupMember createAuGroupMember(AuGroupMember auGroupMember) {
		repo.add(auGroupMember);
		return auGroupMember;
	}

	@Transactional
	public void deleteAuGroupMember(String id) {
		AuGroupMember auGroupMember = new AuGroupMember();
		auGroupMember.setId(id);
		auGroupMember = repo.findById(auGroupMember);
		if (auGroupMember != null) {
			repo.delete(auGroupMember);
		}
	}

	@Transactional
	public void updateAuGroupMember(AuGroupMember auGroupMember) {
		if (repo.findById(auGroupMember) != null) {
			repo.update(auGroupMember);
		}
	}



}
