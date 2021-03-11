CREATE DATABASE jaegers;

CREATE TABLE Jaegers (
	id		SERIAL PRIMARY KEY,
	modelName	TEXT,
	mark		TEXT,
	height		FLOAT8,
	weight		INTEGER,
	status		TEXT,
	origin		TEXT,
	launch		DATE,
	kaijuKill	INTEGER
);