CREATE TABLE  fb_weldtype  (ktn INT,
wty_code VARCHAR,
wty_name VARCHAR,
id not null unique VARCHAR,PRIMARY KEY (id))
CREATE TABLE  fb_weld  (id not null unique VARCHAR,
ktn INT,
kco INT,
wty_code VARCHAR,
wld_num VARCHAR,
spl_num VARCHAR,
iso_num VARCHAR,
pdr_size VARCHAR,
wld_fw BOOLEAN,
wdr_num VARCHAR,
wld_wdate DATE,
fit_fitting1 VARCHAR,
fit_fitting2 VARCHAR,
wld_heat1 VARCHAR,
wld_heat2 VARCHAR,PRIMARY KEY (id))
CREATE TABLE  fb_welder  (id not null unique VARCHAR,
ktn INT,
kco INT,
wdr_num VARCHAR,
wdr_name VARCHAR,
wdr_status VARCHAR,
wdr_active BOOLEAN,PRIMARY KEY (id))
CREATE TABLE  fb_isometric  (id not null unique VARCHAR,
ktn INT,
kco INT,
con_num VARCHAR,
job_num VARCHAR,
iso_num VARCHAR,
iso_revno INT,
iso_revcode VARCHAR,PRIMARY KEY (id))
CREATE TABLE  fb_spool  (id not null unique VARCHAR,
ktn INT,
kco INT,
iso_num VARCHAR,
spl_num VARCHAR,PRIMARY KEY (id))
CREATE TABLE  fb_pipediam  (ktn INT,
pdr_size VARCHAR,
pdr_desc VARCHAR,
pdr_nb DECIMAL,
id not null unique VARCHAR,PRIMARY KEY (id))
CREATE TABLE  fb_fitting  (ktn INT,
fit_code VARCHAR,
id not null unique VARCHAR,
fit_name VARCHAR,PRIMARY KEY (id))
CREATE TABLE  cj_contract  (id not null unique VARCHAR,
ktn INT,
kco INT,
con_num VARCHAR,
con_name VARCHAR,PRIMARY KEY (id))
CREATE TABLE  cj_job  (id not null unique VARCHAR,
ktn INT,
kco INT,
con_num VARCHAR,
job_num VARCHAR,
job_name VARCHAR,PRIMARY KEY (id))
CREATE TABLE  tn_tenant  (id not null unique VARCHAR,
ktn INT,
tnt_name VARCHAR,PRIMARY KEY (id))
CREATE TABLE  tn_company  (id not null unique VARCHAR,
ktn INT,
kco INT,
tco_name VARCHAR,PRIMARY KEY (id))CREATE TABLE users(username varchar_ignorecase(50) not null primary key, password varchar_ignorecase(50) not null, enabled boolean not null)
CREATE TABLE authorities(username varchar_ignorecase(50) not null, authority varchar_ignorecase(50) not null, constraint fk_authorities_users foreign key(username) references users(username))
CREATE UNIQUE INDEX ix_auth_username on authorities (username,authority)
INSERT INTO users (username, password, enabled) VALUES ('vinny', '2ac9cb7dc02b3c0083eb70898e549b63', true)
INSERT INTO authorities (username, authority) VALUES ('vinny', 'ROLE_USER')
INSERT INTO users (username, password, enabled) VALUES ('guest', '084e0343a0486ff05530df6c705c8bb4', true)
INSERT INTO authorities (username, authority) VALUES ('guest', 'ROLE_GUEST')