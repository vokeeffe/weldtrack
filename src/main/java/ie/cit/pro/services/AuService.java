package ie.cit.pro.services;

import java.util.List;

import ie.cit.pro.domain.au.AuAuthority;
import ie.cit.pro.domain.au.AuGroup;
import ie.cit.pro.domain.au.AuGroupAuthority;
import ie.cit.pro.domain.au.AuGroupMember;
import ie.cit.pro.domain.au.AuUser;

public interface AuService {

	/***************************AU_USER***************************/
	AuUser getAuUser(String id);
	List<AuUser> getAllAuUsers();
	AuUser createAuUser(AuUser auUser);
	void deleteAuUser(String id);
	void updateAuUser(AuUser auUser);
	/***************************AU_AUTHORITY***************************/
	AuAuthority getAuAuthority(String id);
	List<AuAuthority> getAllAuAuthoritys();
	AuAuthority createAuAuthority(AuAuthority auAuthority);
	void deleteAuAuthority(String id);
	void updateAuAuthority(AuAuthority auAuthority);
	/***************************AU_GROUP***************************/
	AuGroup getAuGroup(String id);
	List<AuGroup> getAllAuGroups();
	AuGroup createAuGroup(AuGroup auGroup);
	void deleteAuGroup(String id);
	void updateAuGroup(AuGroup auGroup);
	/***************************AU_GROUP_AUTHORITY***************************/
	AuGroupAuthority getAuGroupAuthority(String id);
	List<AuGroupAuthority> getAllAuGroupAuthoritys();
	AuGroupAuthority createAuGroupAuthority(AuGroupAuthority auGroupAuthority);
	void deleteAuGroupAuthority(String id);
	void updateAuGroupAuthority(AuGroupAuthority auGroupAuthority);
	/***************************AU_GROUP_MEMBER***************************/
	AuGroupMember getAuGroupMember(String id);
	List<AuGroupMember> getAllAuGroupMembers();
	AuGroupMember createAuGroupMember(AuGroupMember auGroupMember);
	void deleteAuGroupMember(String id);
	void updateAuGroupMember(AuGroupMember auGroupMember);
	
}
