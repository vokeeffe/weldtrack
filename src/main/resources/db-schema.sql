CREATE TABLE  fb_weldtype  (id VARCHAR NOT NULL UNIQUE, wty_a_createdby VARCHAR, wty_a_createddate DATETIME, wty_a_modifiedby VARCHAR, wty_a_modifieddate DATETIME, ktn INT NOT NULL, wty_code VARCHAR, wty_name VARCHAR, wty_sort INT,  PRIMARY KEY (id))
CREATE TABLE  fb_weld  (id VARCHAR NOT NULL UNIQUE, wld_a_createdby VARCHAR, wld_a_createddate DATETIME, wld_a_modifiedby VARCHAR, wld_a_modifieddate DATETIME, ktn INT NOT NULL, kco INT, wty_code VARCHAR, wld_num VARCHAR, spl_num VARCHAR, iso_num VARCHAR, pdr_size VARCHAR, wld_fw BOOLEAN, wdr_num VARCHAR, wld_wdate DATE, fit_fitting1 VARCHAR, fit_fitting2 VARCHAR, wld_heat1 VARCHAR, wld_heat2 VARCHAR,  PRIMARY KEY (id))
CREATE TABLE  fb_welder  (id VARCHAR NOT NULL UNIQUE, wdr_a_createdby VARCHAR, wdr_a_createddate DATETIME, wdr_a_modifiedby VARCHAR, wdr_a_modifieddate DATETIME, ktn INT NOT NULL, kco INT, wdr_num VARCHAR, wdr_name VARCHAR, wdr_status VARCHAR, wdr_active BOOLEAN,  PRIMARY KEY (id))
CREATE TABLE  fb_isometric  (id VARCHAR NOT NULL UNIQUE, iso_a_createdby VARCHAR, iso_a_createddate DATETIME, iso_a_modifiedby VARCHAR, iso_a_modifieddate DATETIME, ktn INT NOT NULL, kco INT, con_num VARCHAR, job_num VARCHAR, iso_num VARCHAR, iso_revno INT, iso_revcode VARCHAR,  PRIMARY KEY (id))
CREATE TABLE  fb_spool  (id VARCHAR NOT NULL UNIQUE, spl_a_createdby VARCHAR, spl_a_createddate DATETIME, spl_a_modifiedby VARCHAR, spl_a_modifieddate DATETIME, ktn INT NOT NULL, kco INT, iso_num VARCHAR, spl_num VARCHAR,  PRIMARY KEY (id))
CREATE TABLE  fb_pipediam  (id VARCHAR NOT NULL UNIQUE, pdr_a_createdby VARCHAR, pdr_a_createddate DATETIME, pdr_a_modifiedby VARCHAR, pdr_a_modifieddate DATETIME, ktn INT NOT NULL, pdr_size VARCHAR, pdr_desc VARCHAR, pdr_nb DECIMAL,  PRIMARY KEY (id))
CREATE TABLE  fb_fitting  (id VARCHAR NOT NULL UNIQUE, fit_a_createdby VARCHAR, fit_a_createddate DATETIME, fit_a_modifiedby VARCHAR, fit_a_modifieddate DATETIME, ktn INT NOT NULL, fit_code VARCHAR, fit_name VARCHAR,  PRIMARY KEY (id))
CREATE TABLE  cj_contract  (id VARCHAR NOT NULL UNIQUE, con_a_createdby VARCHAR, con_a_createddate DATETIME, con_a_modifiedby VARCHAR, con_a_modifieddate DATETIME, ktn INT NOT NULL, kco INT, con_num VARCHAR, con_name VARCHAR,  PRIMARY KEY (id))
CREATE TABLE  cj_job  (id VARCHAR NOT NULL UNIQUE, job_a_createdby VARCHAR, job_a_createddate DATETIME, job_a_modifiedby VARCHAR, job_a_modifieddate DATETIME, ktn INT NOT NULL, kco INT, con_num VARCHAR, job_num VARCHAR, job_name VARCHAR,  PRIMARY KEY (id))
CREATE TABLE  tn_tenant  (id VARCHAR NOT NULL UNIQUE, tnt_a_createdby VARCHAR, tnt_a_createddate DATETIME, tnt_a_modifiedby VARCHAR, tnt_a_modifieddate DATETIME, ktn INT NOT NULL, tnt_name VARCHAR,  PRIMARY KEY (id))
CREATE TABLE  tn_company  (id VARCHAR NOT NULL UNIQUE, tco_a_createdby VARCHAR, tco_a_createddate DATETIME, tco_a_modifiedby VARCHAR, tco_a_modifieddate DATETIME, ktn INT NOT NULL, kco INT, tco_name VARCHAR,  PRIMARY KEY (id))
CREATE TABLE  sy_secfield  (id VARCHAR NOT NULL UNIQUE, sfd_a_createdby VARCHAR, sfd_a_createddate DATETIME, sfd_a_modifiedby VARCHAR, sfd_a_modifieddate DATETIME, ktn INT, stn_code VARCHAR, sfd_wrap VARCHAR, sfd_width INT, sfd_visible BOOLEAN, sfd_value VARCHAR, sfd_valid VARCHAR, sfd_update BOOLEAN, sfd_tooltip VARCHAR, sfd_tab VARCHAR, sfd_src VARCHAR, sfd_sort INT, sfd_seq INT, sfd_rows INT, sfd_required VARCHAR, sfd_readonly VARCHAR, sfd_range_step INT, sfd_range_num INT, sfd_range_min INT, sfd_range_max INT, sfd_progress_value INT, sfd_progress_max INT, sfd_placeholder VARCHAR, sfd_param VARCHAR, sfd_options VARCHAR, sfd_onok VARCHAR, sfd_onchange VARCHAR, sfd_onblur VARCHAR, sfd_name VARCHAR, sfd_maxlength INT, sfd_lspan INT, sfd_lclass VARCHAR, sfd_label VARCHAR, sfd_input_type VARCHAR, sfd_img_src VARCHAR, sfd_id VARCHAR, sfd_hide BOOLEAN, sfd_height INT, sfd_generate VARCHAR, sfd_format VARCHAR, sfd_form VARCHAR, sfd_disabled VARCHAR, sfd_default VARCHAR, sfd_column INT, sfd_code VARCHAR, sfd_class VARCHAR, sfd_calc VARCHAR, sfd_build VARCHAR, sfd_autofocus VARCHAR, sfd_autocomplete VARCHAR, sfd_append INT, sfd_align VARCHAR, sfd_addblank BOOLEAN, sfd_add BOOLEAN, mf_function VARCHAR, sfd_size INT,  PRIMARY KEY (id))
CREATE TABLE  sy_section  (id VARCHAR NOT NULL UNIQUE, stn_a_createdby VARCHAR, stn_a_createddate DATETIME, stn_a_modifiedby VARCHAR, stn_a_modifieddate DATETIME, ktn INT, stn_code VARCHAR, mf_function VARCHAR, stn_hservice VARCHAR, stn_bservice VARCHAR, stn_brows INT, stn_btitle VARCHAR, stn_form VARCHAR, stn_form_method VARCHAR, stn_script VARCHAR, stn_form_action VARCHAR, stn_htable VARCHAR, stn_btable VARCHAR,  PRIMARY KEY (id))
CREATE TABLE  au_user  (id VARCHAR NOT NULL UNIQUE, aus_a_createdby VARCHAR, aus_a_createddate DATETIME, aus_a_modifiedby VARCHAR, aus_a_modifieddate DATETIME, ktn INT NOT NULL, aus_login VARCHAR(50) NOT NULL, aus_password VARCHAR(50) NOT NULL, aus_enabled BOOLEAN NOT NULL, kco_prime INT, kco_list VARCHAR, aus_name VARCHAR,  PRIMARY KEY (id))
CREATE TABLE  au_authority  (id VARCHAR NOT NULL UNIQUE, aau_a_createdby VARCHAR, aau_a_createddate DATETIME, aau_a_modifiedby VARCHAR, aau_a_modifieddate DATETIME, ktn INT, aus_login VARCHAR(50) NOT NULL, aau_authority VARCHAR(50) NOT NULL,  PRIMARY KEY (id), FOREIGN KEY (aus_login) REFERENCES au_user (aus_login), UNIQUE INDEX au_authority_idx_1 (aus_login, aau_authority))
CREATE TABLE  au_group  (id VARCHAR NOT NULL UNIQUE, agr_a_createdby VARCHAR, agr_a_createddate DATETIME, agr_a_modifiedby VARCHAR, agr_a_modifieddate DATETIME, ktn INT, agr_group_name VARCHAR(50) NOT NULL,  PRIMARY KEY (id))
CREATE TABLE  au_group_authority  (id VARCHAR NOT NULL UNIQUE, aga_a_createdby VARCHAR, aga_a_createddate DATETIME, aga_a_modifiedby VARCHAR, aga_a_modifieddate DATETIME, ktn INT, agr_group_name VARCHAR, aga_authority VARCHAR(50) NOT NULL,  PRIMARY KEY (id), FOREIGN KEY (agr_group_name) REFERENCES au_group (agr_group_name))
CREATE TABLE  au_group_member  (id VARCHAR NOT NULL UNIQUE, agm_a_createdby VARCHAR, agm_a_createddate DATETIME, agm_a_modifiedby VARCHAR, agm_a_modifieddate DATETIME, ktn INT, aus_login VARCHAR(50) NOT NULL, agr_group_name VARCHAR,  PRIMARY KEY (id), FOREIGN KEY (agr_group_name) REFERENCES au_group (agr_group_name))

INSERT INTO sy_section(id,ktn,stn_code,stn_bservice,stn_btable,stn_brows,stn_btitle,stn_form,stn_form_method,stn_form_action) VALUES (1,1,'-WFBWLD101','FbService','fbweld',25,'Weld Input','welds','POST','update.html')
INSERT INTO sy_secfield(id,stn_code,sfd_code,mf_function,sfd_form,sfd_seq,sfd_input_type,sfd_name,sfd_id,sfd_size) VALUES (1,'-WFBWLD101','-WFBWLD101','-WFBWLD101','weld',1,'hidden','id','id',0)
INSERT INTO sy_secfield(id,stn_code,sfd_code,mf_function,sfd_form,sfd_seq,sfd_input_type,sfd_name,sfd_id,sfd_label,sfd_size) VALUES (2,'-WFBWLD101','-WFBWLD101','-WFBWLD101','weld',2,'number','ktn','ktn','ktn',2)
INSERT INTO sy_secfield(id,stn_code,sfd_code,mf_function,sfd_form,sfd_seq,sfd_input_type,sfd_name,sfd_id,sfd_size) VALUES (3,'-WFBWLD101','-WFBWLD101','-WFBWLD101','weld',3,'hidden','kco','kco',0)
INSERT INTO sy_secfield(id,stn_code,sfd_code,mf_function,sfd_form,sfd_seq,sfd_input_type,sfd_name,sfd_id,sfd_label,sfd_size,sfd_required) VALUES (4,'-WFBWLD101','-WFBWLD101','-WFBWLD101','weld',4,'text','wty_code','wty_code','Type',10,'required')
INSERT INTO sy_secfield(id,stn_code,sfd_code,mf_function,sfd_form,sfd_seq,sfd_input_type,sfd_name,sfd_id,sfd_label,sfd_size,sfd_required) VALUES (5,'-WFBWLD101','-WFBWLD101','-WFBWLD101','weld',5,'text','wld_num','wld_num','Number',6,'required')
INSERT INTO sy_secfield(id,stn_code,sfd_code,mf_function,sfd_form,sfd_seq,sfd_input_type,sfd_name,sfd_id,sfd_label,sfd_size,sfd_required) VALUES (6,'-WFBWLD101','-WFBWLD101','-WFBWLD101','weld',6,'text','spl_num','spl_num','Spool',6,'required')
INSERT INTO sy_secfield(id,stn_code,sfd_code,mf_function,sfd_form,sfd_seq,sfd_input_type,sfd_name,sfd_id,sfd_label,sfd_size,sfd_required) VALUES (7,'-WFBWLD101','-WFBWLD101','-WFBWLD101','weld',7,'text','iso_num','iso_num','Iso',6,'required')
INSERT INTO sy_secfield(id,stn_code,sfd_code,mf_function,sfd_form,sfd_seq,sfd_input_type,sfd_name,sfd_id,sfd_label,sfd_size) VALUES (8,'-WFBWLD101','-WFBWLD101','-WFBWLD101','weld',8,'number','pdr_size','pdr_size','Size',3)
INSERT INTO sy_secfield(id,stn_code,sfd_code,mf_function,sfd_form,sfd_seq,sfd_input_type,sfd_name,sfd_id,sfd_label,sfd_size) VALUES (9,'-WFBWLD101','-WFBWLD101','-WFBWLD101','weld',9,'image','wld_fw','wld_fw','FW',1)
INSERT INTO sy_secfield(id,stn_code,sfd_code,mf_function,sfd_form,sfd_seq,sfd_input_type,sfd_name,sfd_id,sfd_label,sfd_size) VALUES (10,'-WFBWLD101','-WFBWLD101','-WFBWLD101','weld',10,'text','wdr_num','wdr_num','Welder',3)
INSERT INTO sy_secfield(id,stn_code,sfd_code,mf_function,sfd_form,sfd_seq,sfd_input_type,sfd_name,sfd_id,sfd_label,sfd_size) VALUES (11,'-WFBWLD101','-WFBWLD101','-WFBWLD101','weld',11,'date','wld_wdate','wld_wdate','Welded',6)
INSERT INTO sy_secfield(id,stn_code,sfd_code,mf_function,sfd_form,sfd_seq,sfd_input_type,sfd_name,sfd_id,sfd_label,sfd_size) VALUES (12,'-WFBWLD101','-WFBWLD101','-WFBWLD101','weld',12,'text','fit_fitting1','fit_fitting1','Fitting 1',6)
INSERT INTO sy_secfield(id,stn_code,sfd_code,mf_function,sfd_form,sfd_seq,sfd_input_type,sfd_name,sfd_id,sfd_label,sfd_size) VALUES (13,'-WFBWLD101','-WFBWLD101','-WFBWLD101','weld',13,'text','fit_fitting2','fit_fitting2','Fitting 2',6)
INSERT INTO sy_secfield(id,stn_code,sfd_code,mf_function,sfd_form,sfd_seq,sfd_input_type,sfd_name,sfd_id,sfd_label,sfd_size) VALUES (14,'-WFBWLD101','-WFBWLD101','-WFBWLD101','weld',14,'text','wld_heat1','wld_heat1','Heat #1',8)
INSERT INTO sy_secfield(id,stn_code,sfd_code,mf_function,sfd_form,sfd_seq,sfd_input_type,sfd_name,sfd_id,sfd_label,sfd_size) VALUES (15,'-WFBWLD101','-WFBWLD101','-WFBWLD101','weld',15,'text','wld_heat2','wld_heat2','Heat #2',8)
INSERT INTO au_user(id,ktn,aus_login,aus_password,aus_enabled,aus_name,kco_prime,kco_list) VALUES (1,1,'vinny','2ac9cb7dc02b3c0083eb70898e549b63',true,'Vincent OKeeffe',1,1)
INSERT INTO au_user(id,ktn,aus_login,aus_password,aus_enabled,aus_name,kco_prime,kco_list) VALUES (2,1,'guest','084e0343a0486ff05530df6c705c8bb4',true,'Guest',1,1)
INSERT INTO au_authority(id,aus_login,aau_authority) VALUES (1,'vinny','ROLE_CREATE')
INSERT INTO au_authority(id,aus_login,aau_authority) VALUES (2,'vinny','ROLE_READ')
INSERT INTO au_authority(id,aus_login,aau_authority) VALUES (3,'vinny','ROLE_UPDATE')
INSERT INTO au_authority(id,aus_login,aau_authority) VALUES (4,'vinny','ROLE_DELETE')
INSERT INTO au_authority(id,aus_login,aau_authority) VALUES (5,'guest','ROLE_READ')
INSERT INTO au_authority(id,aus_login,aau_authority) VALUES (100,'guest','ROLE_USER')
INSERT INTO au_authority(id,aus_login,aau_authority) VALUES (101,'vinny','ROLE_USER')
INSERT INTO au_group(id,agr_group_name) VALUES (1,'ADMIN')
INSERT INTO au_group(id,agr_group_name) VALUES (2,'GUEST')
INSERT INTO au_group_member(id,agr_group_name,aus_login) VALUES (1,'ADMIN','vinny')
INSERT INTO au_group_member(id,agr_group_name,aus_login) VALUES (2,'GUEST','guest')
INSERT INTO au_group_authority(id,agr_group_name,aga_authority) VALUES (1,'ADMIN','ROLE_CREATE')
INSERT INTO au_group_authority(id,agr_group_name,aga_authority) VALUES (2,'ADMIN','ROLE_READ')
INSERT INTO au_group_authority(id,agr_group_name,aga_authority) VALUES (3,'ADMIN','ROLE_UPDATE')
INSERT INTO au_group_authority(id,agr_group_name,aga_authority) VALUES (4,'ADMIN','ROLE_DELETE')
INSERT INTO au_group_authority(id,agr_group_name,aga_authority) VALUES (5,'GUEST','ROLE_READ')
INSERT INTO au_group_authority(id,agr_group_name,aga_authority) VALUES (100,'ADMIN','ROLE_USER')
INSERT INTO au_group_authority(id,agr_group_name,aga_authority) VALUES (101,'GUEST','ROLE_USER')