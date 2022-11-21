SET SESSION FOREIGN_KEY_CHECKS=1;

/* Drop Tables */

DROP TABLE IF EXISTS hitSong;
DROP TABLE IF EXISTS girlGroup;




/* Create Tables */

-- 걸그룹
CREATE TABLE girlGroup
(
	gid int NOT NULL AUTO_INCREMENT COMMENT '걸그룹 아이디',
	gname varchar(20) NOT NULL COMMENT '걸그룹이름',
	company varchar(20) NOT NULL COMMENT '소속사',
	debut date default (current_date) COMMENT '데뷔일자',
	PRIMARY KEY (gid)
) AUTO_INCREMENT = 101;


-- 히트곡
CREATE TABLE hitSong
(
	sid int NOT NULL AUTO_INCREMENT COMMENT '히트곡 아이디',
	sname varchar(20) NOT NULL COMMENT 'sname',
	composer varchar(20) COMMENT '작곡가',
	writer varchar(20) COMMENT '작사가',
	gid int NOT NULL  COMMENT '걸그룹 아이디',
	PRIMARY KEY (sid)
) AUTO_INCREMENT = 1001;



/* Create Foreign Keys */

ALTER TABLE hitSong
	ADD FOREIGN KEY (gid)
	REFERENCES girlGroup (gid)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



