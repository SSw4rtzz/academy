-- CREATE TYPE rack_status_enum AS ENUM ('ACTIVE', 'RETURNED', 'REPAIR', 'OUTDATED', 'BRICKED');

CREATE TABLE T_TEAM
(
    id   BIGINT DEFAULT random() PRIMARY KEY,
    name varchar(255) NOT NULL,
    product varchar(255) NOT NULL,
    created_at timestamp DEFAULT now() NOT NULL,
    modified_at timestamp DEFAULT now() NOT NULL,
    default_location varchar(10) NOT NULL
);
CREATE SEQUENCE IF NOT EXISTS SEQ_TEAM_ID;

CREATE TABLE T_RACK
(
    id            BIGINT DEFAULT random() PRIMARY KEY,
    serial_number varchar(20)      NOT NULL UNIQUE,
    status        varchar(20)      NOT NULL,
    default_location varchar(10) NOT NULL,
    created_at timestamp DEFAULT now() NOT NULL,
    modified_at timestamp DEFAULT now() NOT NULL,
    assembled_at  DATE
);
CREATE SEQUENCE IF NOT EXISTS SEQ_RACK_ID;

CREATE TABLE T_TEAM_MEMBER (
                               id BIGINT DEFAULT random() PRIMARY KEY,
                               team_id BIGINT REFERENCES T_TEAM(id),
                               ctw_id varchar(10) NOT NULL UNIQUE,
                               name varchar(20) NOT NULL,
                               created_at timestamp DEFAULT now() NOT NULL,
                               modified_at timestamp DEFAULT now() NOT NULL
);
CREATE SEQUENCE IF NOT EXISTS SEQ_TEAM_MEMBER_ID;

CREATE TABLE T_BOOKING (
                           rack_id BIGINT REFERENCES T_RACK(id),
                           requester_id BIGINT REFERENCES T_TEAM_MEMBER(id),
                           book_from timestamp NOT NULL,
                           book_to timestamp NOT NULL,
                           created_at timestamp DEFAULT now() NOT NULL,
                           modified_at timestamp DEFAULT now() NOT NULL
);
CREATE SEQUENCE IF NOT EXISTS SEQ_BOOKING_ID;

CREATE TABLE T_RACK_ASSET
(
    id BIGINT DEFAULT random() PRIMARY KEY,
    asset_tag varchar(10) NOT NULL,
    rack_id BIGINT NOT NULL REFERENCES T_RACK(id)
);
CREATE SEQUENCE IF NOT EXISTS SEQ_RACK_ASSET_ID;

INSERT INTO t_team (id, name, product, created_at, modified_at, default_location) VALUES ('1000','The Gardeners', 'Plant', '2025-02-05 15:13:09.357121', '2025-02-05 15:13:09.357121', 'Lisbon');
INSERT INTO t_team (id, name, product, created_at, modified_at, default_location) VALUES ('1001','Stars', 'Car', '2025-02-05 15:18:23.509219', '2025-02-05 15:18:23.509219', 'Porto');
-- INSERT INTO t_team (id, name, product, created_at, modified_at, default_location) VALUES ('Speedsters', 'Moto', '2025-02-05 15:18:23.509219', '2025-02-05 15:18:23.509219', 'Braga');
-- INSERT INTO t_team (id, name, product, created_at, modified_at, default_location) VALUES ('The Analytics', 'Dashboards', '2025-02-05 15:18:23.509219', '2025-02-05 15:18:23.509219', 'Lisbon');
-- INSERT INTO t_team (id, name, product, created_at, modified_at, default_location) VALUES ('Wheels', 'Car', '2025-02-05 15:18:23.509219', '2025-02-05 15:18:23.509219', 'Porto');
-- INSERT INTO t_team (id, name, product, created_at, modified_at, default_location) VALUES ('Sonic Team', 'Car', '2025-02-05 15:18:23.509219', '2025-02-05 15:18:23.509219', 'Porto');

INSERT INTO t_rack (id, serial_number, created_at, default_location, status, modified_at) VALUES ('2000' ,'2222-10000-01', '2025-02-05 11:33:24.157169', 'Lisbon', 'ACTIVE', '2025-02-05 14:50:20.331984');
INSERT INTO t_rack (id, serial_number, created_at, default_location, status, modified_at) VALUES ('2001', '1000-12021-03', '2025-02-05 11:33:37.053591', 'Braga', 'ACTIVE', '2025-02-05 14:50:20.331984');