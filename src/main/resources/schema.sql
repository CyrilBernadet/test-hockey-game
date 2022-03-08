CREATE TABLE TEAM (
    id INTEGER NOT NULL AUTO_INCREMENT,
    coach VARCHAR,
    year INTEGER
);

CREATE TABLE PLAYER (
    number INTEGER NOT NULL,
    name VARCHAR,
    lastname VARCHAR,
    position VARCHAR,
    is_captain BOOLEAN
);

CREATE TABLE PLAYER_TEAM (
    team_id INTEGER NOT NULL,
    player_id INTEGER NOT NULL
);