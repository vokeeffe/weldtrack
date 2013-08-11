CREATE TABLE  fb_weldtype  (id VARCHAR not null unique, wty_a_createdby VARCHAR, wty_a_createddate DATE, wty_a_modifiedby VARCHAR, wty_a_modifieddate DATE, ktn INT,wty_code VARCHAR,wty_name VARCHAR, PRIMARY KEY (id))
CREATE TABLE  fb_weld  (id VARCHAR not null unique, wld_a_createdby VARCHAR, wld_a_createddate DATE, wld_a_modifiedby VARCHAR, wld_a_modifieddate DATE, ktn INT,kco INT,wty_code VARCHAR,wld_num VARCHAR,spl_num VARCHAR,iso_num VARCHAR,pdr_size VARCHAR,wld_fw BOOLEAN,wdr_num VARCHAR,wld_wdate DATE,fit_fitting1 VARCHAR,fit_fitting2 VARCHAR,wld_heat1 VARCHAR,wld_heat2 VARCHAR, PRIMARY KEY (id))
CREATE TABLE  fb_welder  (id VARCHAR not null unique, wdr_a_createdby VARCHAR, wdr_a_createddate DATE, wdr_a_modifiedby VARCHAR, wdr_a_modifieddate DATE, ktn INT,kco INT,wdr_num VARCHAR,wdr_name VARCHAR,wdr_status VARCHAR,wdr_active BOOLEAN, PRIMARY KEY (id))
CREATE TABLE  fb_isometric  (id VARCHAR not null unique, iso_a_createdby VARCHAR, iso_a_createddate DATE, iso_a_modifiedby VARCHAR, iso_a_modifieddate DATE, ktn INT,kco INT,con_num VARCHAR,job_num VARCHAR,iso_num VARCHAR,iso_revno INT,iso_revcode VARCHAR, PRIMARY KEY (id))
CREATE TABLE  fb_spool  (id VARCHAR not null unique, spl_a_createdby VARCHAR, spl_a_createddate DATE, spl_a_modifiedby VARCHAR, spl_a_modifieddate DATE, ktn INT,kco INT,iso_num VARCHAR,spl_num VARCHAR, PRIMARY KEY (id))
CREATE TABLE  fb_pipediam  (id VARCHAR not null unique, pdr_a_createdby VARCHAR, pdr_a_createddate DATE, pdr_a_modifiedby VARCHAR, pdr_a_modifieddate DATE, ktn INT,pdr_size VARCHAR,pdr_desc VARCHAR,pdr_nb DECIMAL, PRIMARY KEY (id))
CREATE TABLE  fb_fitting  (id VARCHAR not null unique, fit_a_createdby VARCHAR, fit_a_createddate DATE, fit_a_modifiedby VARCHAR, fit_a_modifieddate DATE, ktn INT,fit_code VARCHAR,fit_name VARCHAR, PRIMARY KEY (id))
CREATE TABLE  cj_contract  (id VARCHAR not null unique, con_a_createdby VARCHAR, con_a_createddate DATE, con_a_modifiedby VARCHAR, con_a_modifieddate DATE, ktn INT,kco INT,con_num VARCHAR,con_name VARCHAR, PRIMARY KEY (id))
CREATE TABLE  cj_job  (id VARCHAR not null unique, job_a_createdby VARCHAR, job_a_createddate DATE, job_a_modifiedby VARCHAR, job_a_modifieddate DATE, ktn INT,kco INT,con_num VARCHAR,job_num VARCHAR,job_name VARCHAR, PRIMARY KEY (id))
CREATE TABLE  tn_tenant  (id VARCHAR not null unique, tnt_a_createdby VARCHAR, tnt_a_createddate DATE, tnt_a_modifiedby VARCHAR, tnt_a_modifieddate DATE, ktn INT,tnt_name VARCHAR, PRIMARY KEY (id))
CREATE TABLE  tn_company  (id VARCHAR not null unique, tco_a_createdby VARCHAR, tco_a_createddate DATE, tco_a_modifiedby VARCHAR, tco_a_modifieddate DATE, ktn INT,kco INT,tco_name VARCHAR, PRIMARY KEY (id))
CREATE TABLE users(username varchar_ignorecase(50) not null primary key, password varchar_ignorecase(50) not null, enabled boolean not null)
CREATE TABLE authorities(username varchar_ignorecase(50) not null, authority varchar_ignorecase(50) not null, constraint fk_authorities_users foreign key(username) references users(username))
CREATE UNIQUE INDEX ix_auth_username on authorities (username,authority)
INSERT INTO users (username, password, enabled) VALUES ('vinny', '2ac9cb7dc02b3c0083eb70898e549b63', true)
INSERT INTO authorities (username, authority) VALUES ('vinny', 'ROLE_USER')
INSERT INTO users (username, password, enabled) VALUES ('guest', '084e0343a0486ff05530df6c705c8bb4', true)
INSERT INTO authorities (username, authority) VALUES ('guest', 'ROLE_GUEST')