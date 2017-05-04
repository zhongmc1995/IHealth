/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50550
Source Host           : localhost:3306
Source Database       : ihealth

Target Server Type    : MYSQL
Target Server Version : 50550
File Encoding         : 65001

Date: 2017-05-04 17:20:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` varchar(32) NOT NULL,
  `username` varchar(100) DEFAULT NULL,
  `password` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('38728c5853a1453ea88a3231a3f8b6a3', 'zhangsan', 'zhangsan');
INSERT INTO `sys_user` VALUES ('3c5790611ad44321a55083dbc16725ac', 'zhangsan', 'zhangsan');
INSERT INTO `sys_user` VALUES ('b32afca6f4ee4af0accb13432be9f0db', 'zhangsan', 'zhangsan');
INSERT INTO `sys_user` VALUES ('ba39d3776bc74b06b99113b4e3c41088', 'zhangsan', 'zhangsan');
INSERT INTO `sys_user` VALUES ('cc4f19eb59604a26a1c7dfce2181dcbf', 'zhangsan', 'zhangsan');
INSERT INTO `sys_user` VALUES ('d79d06328be4494c991d0aa3819d025d', 'zhangsan', 'zhangsan');
INSERT INTO `sys_user` VALUES ('f57dc38409a5422da3042c262eef8028', 'zhangsan', 'zhangsan');
