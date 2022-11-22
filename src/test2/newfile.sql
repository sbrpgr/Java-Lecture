SET SESSION FOREIGN_KEY_CHECKS=0;
DROP TABLE IF EXISTS employee;
CREATE TABLE employee
(
	id int NOT NULL,
	name varchar(4) NOT NULL,
	position varchar(4) NOT NULL,
	joinDate datetime,
	PRIMARY KEY (id)
);



