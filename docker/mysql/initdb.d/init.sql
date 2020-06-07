CREATE DATABASE IF NOT EXISTS refcheck_db;
use refcheck_db;

CREATE TABLE task_type (
  id int(2) NOT NULL,
  type varchar(20) NOT NULL,
  comment varchar(50) DEFAULT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE task (
  id int(5) NOT NULL AUTO_INCREMENT,
  user_id int(5) NOT NULL,
  type_id int(2) NOT NULL,
  title varchar(50) NOT NULL,
  detail text,
  deadline datetime NOT NULL,
  PRIMARY KEY (id)
) ;

CREATE TABLE user (
  id int(11) NOT NULL AUTO_INCREMENT,
  username varchar(50) NOT NULL,
  email varchar(70) NOT NULL,
  password varchar(60) NOT NULL,
  enabled tinyint(1) NOT NULL,
  authority varchar(50) NOT NULL,
  tempkey varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
);

INSERT INTO `task_type` VALUES 
(1,'緊急','最優先で取り掛かるべきタスク'),
(2,'重要','期限に間に合わせるべきタスク'),
(3,'できれば','今後やってみたいアイデア');

INSERT INTO `task` VALUES 
(NULL,1,1,'JUnitを学習','テストの仕方を学習する','2020-07-07 15:00:00'),
(NULL,1,3,'サービスの自作','マイクロサービスを作ってみる','2020-09-13 17:00:00');
