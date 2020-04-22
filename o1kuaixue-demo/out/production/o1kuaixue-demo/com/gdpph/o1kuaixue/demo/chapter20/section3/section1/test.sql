CREATE DATABASE test;

CREATE TABLE users (
 	id SMALLINT UNSIGNED PRIMARY KEY NOT NULL AUTO_INCREMENT,
 	name VARCHAR(20) NOT NULL,
	age TINYINT UNSIGNED NOT NULL
);

INSERT users VALUES(null, 'Jack', 12);
INSERT users VALUES(null, 'Mike', 34);
