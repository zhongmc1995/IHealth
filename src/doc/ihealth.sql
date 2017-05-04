/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50550
Source Host           : localhost:3306
Source Database       : ihealth

Target Server Type    : MYSQL
Target Server Version : 50550
File Encoding         : 65001

Date: 2017-05-04 21:37:56
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` varchar(32) NOT NULL COMMENT '角色唯一标识',
  `role_name` varchar(255) NOT NULL COMMENT '角色名字',
  `role_type` varchar(255) NOT NULL COMMENT '角色类别',
  `useable` varchar(255) NOT NULL COMMENT '是否使用',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `create_by` varchar(255) DEFAULT NULL COMMENT '创建者',
  `update_by` datetime DEFAULT NULL COMMENT '更行者',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role
-- ----------------------------

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` varchar(32) NOT NULL COMMENT '系统用户主键',
  `username` varchar(20) NOT NULL COMMENT '用户名',
  `password` varchar(20) NOT NULL COMMENT '登录密码',
  `desc` varchar(200) DEFAULT NULL COMMENT '用户描述',
  `email` varchar(100) DEFAULT NULL COMMENT '用户邮箱',
  `icon` varchar(200) DEFAULT NULL COMMENT '头像',
  `address` varchar(255) DEFAULT NULL COMMENT '用户地址',
  `introduce` varchar(500) DEFAULT NULL COMMENT '简介',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(255) DEFAULT NULL COMMENT '更新者',
  `create_by` varchar(255) DEFAULT NULL COMMENT '创建者',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('2d1f8a617123457fb40ab9fd81002514', 'zhangsan', 'zhangsan', null, null, null, null, null, null, null, null, null);
INSERT INTO `sys_user` VALUES ('b956fe8fd57244aab071b526d09003bc', 'zhangsan', 'zhangsan', null, null, null, null, null, null, null, null, null);
