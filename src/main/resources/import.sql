-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
-- insert into myentity (id, field) values(1, 'field-1');
-- insert into myentity (id, field) values(2, 'field-2');
-- insert into myentity (id, field) values(3, 'field-3');
-- alter sequence myentity_seq restart with 4;

-- INSERT INTO t_rack (serial_number, team_id, created_at, default_location, status, modified_at) VALUES ( '1000-12021-02', '643a7cd8-5c6b-4530-ba89-8e6e459a5e26', '2025-02-05 11:33:00.397668', 'Porto', 'UNAVAILABLE', '2025-02-05 14:50:20.331984');
-- INSERT INTO t_rack (serial_number, team_id, created_at, default_location, status, modified_at) VALUES ( '3100-11031-01', 'c94e18c5-2401-40a0-873c-7e5613b75d26', '2025-02-05 11:33:53.825660', 'Porto', 'UNAVAILABLE', '2025-02-05 14:50:20.331984');
-- INSERT INTO t_rack (serial_number, team_id, created_at, default_location, status, modified_at) VALUES ( '1000-12021-01', '9928fee2-974f-41bb-af9b-79641bfdce56', '2025-02-05 11:32:40.681242', 'Lisbon', 'AVAILABLE', '2025-02-05 14:50:20.331984');

--INSERT INTO t_team (id, name, product, created_at, modified_at, default_location) VALUES ('1000','The Gardeners', 'Plant', '2025-02-05 15:13:09.357121', '2025-02-05 15:13:09.357121', 'Lisbon');
--INSERT INTO t_team (id, name, product, created_at, modified_at, default_location) VALUES ('1001','Stars', 'Car', '2025-02-05 15:18:23.509219', '2025-02-05 15:18:23.509219', 'Porto');
-- INSERT INTO t_team (id, name, product, created_at, modified_at, default_location) VALUES ('Speedsters', 'Moto', '2025-02-05 15:18:23.509219', '2025-02-05 15:18:23.509219', 'Braga');
-- INSERT INTO t_team (id, name, product, created_at, modified_at, default_location) VALUES ('The Analytics', 'Dashboards', '2025-02-05 15:18:23.509219', '2025-02-05 15:18:23.509219', 'Lisbon');
-- INSERT INTO t_team (id, name, product, created_at, modified_at, default_location) VALUES ('Wheels', 'Car', '2025-02-05 15:18:23.509219', '2025-02-05 15:18:23.509219', 'Porto');
-- INSERT INTO t_team (id, name, product, created_at, modified_at, default_location) VALUES ('Sonic Team', 'Car', '2025-02-05 15:18:23.509219', '2025-02-05 15:18:23.509219', 'Porto');

--INSERT INTO t_rack (id, serial_number, team_id, created_at, default_location, status, modified_at) VALUES ('2000' ,'2222-10000-01', '1000', '2025-02-05 11:33:24.157169', 'Lisbon', 'ACTIVE', '2025-02-05 14:50:20.331984');
--INSERT INTO t_rack (id, serial_number, team_id, created_at, default_location, status, modified_at) VALUES ('2001', '1000-12021-03', '1001', '2025-02-05 11:33:37.053591', 'Braga', 'ACTIVE', '2025-02-05 14:50:20.331984');

INSERT INTO t_rack (id, serial_number, created_at, default_location, status, modified_at) VALUES ('2002' ,'2222-10000-04', '2025-02-05 11:33:24.157169', 'Lisbon', 'ACTIVE', '2025-02-05 14:50:20.331984');
INSERT INTO t_rack (id, serial_number, created_at, default_location, status, modified_at) VALUES ('2003', '1000-12021-05', '2025-02-05 11:33:37.053591', 'Braga', 'ACTIVE', '2025-02-05 14:50:20.331984');
INSERT INTO t_rack (id, serial_number, created_at, default_location, status, modified_at) VALUES ('2004' ,'2222-10000-06', '2025-02-05 11:33:24.157169', 'Lisbon', 'ACTIVE', '2025-02-05 14:50:20.331984');
INSERT INTO t_rack (id, serial_number, created_at, default_location, status, modified_at) VALUES ('2005', '1000-12021-07', '2025-02-05 11:33:37.053591', 'Porto', 'ACTIVE', '2025-02-05 14:50:20.331984');
INSERT INTO t_rack (id, serial_number, created_at, default_location, status, modified_at) VALUES ('2006' ,'2222-10000-08',  '2025-02-05 11:33:24.157169', 'Lisbon', 'ACTIVE', '2025-02-05 14:50:20.331984');
INSERT INTO t_rack (id, serial_number, created_at, default_location, status, modified_at) VALUES ('2007', '1000-12021-09',  '2025-02-05 11:33:37.053591', 'Braga', 'ACTIVE', '2025-02-05 14:50:20.331984');