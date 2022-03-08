INSERT INTO TEAM (id, coach, year) VALUES (1, 'Dominique Ducharme', 2019);
INSERT INTO TEAM (id, coach, year) VALUES (2, 'Dominique Ducharme', 2020);
INSERT INTO TEAM (id, coach, year) VALUES (3, 'Dominique Ducharme', 2021);

INSERT INTO PLAYER (number, name, lastname, position, is_captain) VALUES ( 31, 'Carey', 'Price', 'goaltender', false);
INSERT INTO PLAYER (number, name, lastname, position, is_captain) VALUES ( 14, 'Nick', 'Suzuki', 'forward', false);
INSERT INTO PLAYER (number, name, lastname, position, is_captain) VALUES ( 15, 'Jesperi', 'Kotkaniemi', 'forward', false);
INSERT INTO PLAYER (number, name, lastname, position, is_captain) VALUES ( 71, 'Jake', 'Evans', 'forward', false);
INSERT INTO PLAYER (number, name, lastname, position, is_captain) VALUES ( 27, 'Alexander', 'Romanov', 'defenseman', false);
INSERT INTO PLAYER (number, name, lastname, position, is_captain) VALUES ( 6, 'Shea', 'Weber', 'defenseman', true);

INSERT INTO PLAYER_TEAM (team_id, player_id) VALUES (1, 31);
INSERT INTO PLAYER_TEAM (team_id, player_id) VALUES (1, 14);
INSERT INTO PLAYER_TEAM (team_id, player_id) VALUES (1, 15);
INSERT INTO PLAYER_TEAM (team_id, player_id) VALUES (1, 71);
INSERT INTO PLAYER_TEAM (team_id, player_id) VALUES (1, 27);
INSERT INTO PLAYER_TEAM (team_id, player_id) VALUES (1, 6);

INSERT INTO PLAYER_TEAM (team_id, player_id) VALUES (2, 31);
INSERT INTO PLAYER_TEAM (team_id, player_id) VALUES (2, 14);
INSERT INTO PLAYER_TEAM (team_id, player_id) VALUES (2, 15);
INSERT INTO PLAYER_TEAM (team_id, player_id) VALUES (2, 71);
INSERT INTO PLAYER_TEAM (team_id, player_id) VALUES (2, 27);
INSERT INTO PLAYER_TEAM (team_id, player_id) VALUES (2, 6);

INSERT INTO PLAYER_TEAM (team_id, player_id) VALUES (3, 31);
INSERT INTO PLAYER_TEAM (team_id, player_id) VALUES (3, 14);
INSERT INTO PLAYER_TEAM (team_id, player_id) VALUES (3, 15);
INSERT INTO PLAYER_TEAM (team_id, player_id) VALUES (3, 71);
INSERT INTO PLAYER_TEAM (team_id, player_id) VALUES (3, 27);
INSERT INTO PLAYER_TEAM (team_id, player_id) VALUES (3, 6);