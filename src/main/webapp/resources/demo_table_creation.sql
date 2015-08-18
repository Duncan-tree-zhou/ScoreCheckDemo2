CREATE DATABASE `demodb` /*!40100 DEFAULT CHARACTER SET UTF8 */;

drop table if exists `demodb`.`c_st_cls`, `demodb`.`c_st_cos`, `demodb`.`c_tch_psn`, `demodb`.`tb_class`, `demodb`.`tb_course`, `demodb`.`tb_course_group`, `demodb`.`tb_loginlog`, `demodb`.`tb_position`, `demodb`.`tb_score`, `demodb`.`tb_student`, `demodb`.`tb_teacher`, `demodb`.`tb_user`;


CREATE TABLE `tb_user` (
  `uid` varchar(128) NOT NULL DEFAULT '',
  `uname` varchar(32) CHARACTER SET utf8 DEFAULT NULL,
  `upassword` varchar(32) DEFAULT NULL,
  `uprivilege` int(11) DEFAULT NULL,
  `u_fn_id` varchar(32) DEFAULT NULL,
  `log_count` int(11) DEFAULT '0',
  `last_visit` datetime DEFAULT NULL,
  `last_ip` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `tb_loginlog` (
  `llid` varchar(128) NOT NULL DEFAULT '',
  `uid` varchar(128) DEFAULT NULL,
  `uip` varchar(128) DEFAULT NULL,
  `loginDate` date DEFAULT NULL,
  PRIMARY KEY (`llid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `tb_student` (
  `st_id` varchar(32) NOT NULL DEFAULT '',
  `st_image` text CHARACTER SET utf8,
  `st_name` varchar(32) CHARACTER SET utf8 DEFAULT NULL,
  `st_gender` varchar(2) DEFAULT NULL,
  `st_parent_name` varchar(32) CHARACTER SET utf8 DEFAULT NULL,
  `st_contact` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`st_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `tb_class` (
  `cls_id` varchar(32) DEFAULT NULL,
  `cls_desc` text CHARACTER SET utf8,
  `cls_start` date DEFAULT NULL,
  `cls_end` date DEFAULT NULL,
  `cls_type` varchar(32) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `c_st_cls` (
  `c_id` varchar(128) NOT NULL DEFAULT '',
  `st_id` varchar(32) DEFAULT NULL,
  `cls_id` varchar(32) DEFAULT NULL,
  `c_start` date DEFAULT NULL,
  `c_end` date DEFAULT NULL,
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `tb_course` (
  `cos_id` varchar(128) NOT NULL DEFAULT '',
  `cos_name` varchar(32) CHARACTER SET utf8 DEFAULT NULL,
  `cos_desc` text CHARACTER SET utf8,
  `cos_type` varchar(32) CHARACTER SET utf8 DEFAULT NULL,
  `cosg_id` varchar(128) DEFAULT NULL,
  `cos_credit` double DEFAULT NULL,
  `cos_start` date DEFAULT NULL,
  `cos_end` date DEFAULT NULL,
  `tch_id` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`cos_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `tb_course_group` (
  `cosg_id` varchar(128) NOT NULL DEFAULT '',
  `cosg_name` varchar(32) CHARACTER SET utf8 DEFAULT NULL,
  `cosg_desc` text CHARACTER SET utf8,
  `cos_start` date DEFAULT NULL,
  `cos_end` date DEFAULT NULL,
  PRIMARY KEY (`cosg_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `c_st_cos` (
  `c_id` varchar(128) NOT NULL DEFAULT '',
  `st_id` varchar(128) DEFAULT NULL,
  `cs_id` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `tb_score` (
  `sc_id` varchar(128) NOT NULL DEFAULT '',
  `st_id` varchar(32) DEFAULT NULL,
  `cs_id` varchar(128) DEFAULT NULL,
  `sc_name` varchar(32) CHARACTER SET utf8 DEFAULT NULL,
  `sc_date` date DEFAULT NULL,
  `sc_score` double DEFAULT NULL,
  PRIMARY KEY (`sc_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `tb_teacher` (
  `tch_id` varchar(32) NOT NULL DEFAULT '',
  `tch_name` varchar(32) CHARACTER SET utf8 DEFAULT NULL,
  `tch_image` text CHARACTER SET utf8,
  `tch_gender` varchar(2) DEFAULT NULL,
  `tch_group` varchar(32) CHARACTER SET utf8 DEFAULT NULL,
  `tch_contact` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`tch_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `tb_position` (
  `psn_id` varchar(128) NOT NULL DEFAULT '',
  `psn_name` varchar(32) CHARACTER SET utf8 DEFAULT NULL,
  `psn_desc` text CHARACTER SET utf8,
  PRIMARY KEY (`psn_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `c_tch_psn` (
  `c_id` varchar(128) NOT NULL DEFAULT '',
  `tch_id` varchar(32) CHARACTER SET utf8 DEFAULT NULL,
  `psn_id` varchar(128) DEFAULT NULL,
  `c_start` date DEFAULT NULL,
  `c_end` date DEFAULT NULL,
  `c_fnd_id` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



