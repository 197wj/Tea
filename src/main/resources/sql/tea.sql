/*
Navicat MySQL Data Transfer

Source Server         : hello
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : homework

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-10-09 09:20:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for grade
-- ----------------------------
DROP TABLE IF EXISTS `grade`;
CREATE TABLE `grade` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '等级主键',
  `grade_name` varchar(20) NOT NULL COMMENT '等级名称',
  `shape` double unsigned NOT NULL COMMENT '茶叶形状',
  `color` double unsigned NOT NULL COMMENT '色泽',
  `clarity` double unsigned NOT NULL COMMENT '净度',
  `tang` double unsigned NOT NULL COMMENT '汤色',
  `aroma` double unsigned NOT NULL COMMENT '香气',
  `taste` double unsigned NOT NULL COMMENT '滋味',
  `leaf` double unsigned NOT NULL COMMENT '叶底',
  `status` tinyint(3) unsigned NOT NULL DEFAULT '0' COMMENT '记录状态',
  `gmt_creat` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `gmt_update` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of grade
-- ----------------------------
INSERT INTO `grade` VALUES ('1', '特一级', '1', '0.9', '0.9', '0.9', '1', '1', '0.9', '0', '2017-10-03 17:42:00', null);
INSERT INTO `grade` VALUES ('2', '特二级', '0.9', '0.8', '0.9', '0.9', '0.9', '0.9', '0.8', '0', '2017-10-03 17:42:51', null);
INSERT INTO `grade` VALUES ('3', '特三级', '0.8', '0.7', '0.9', '0.8', '0.8', '0.7', '0.7', '0', '2017-10-03 17:46:40', null);
INSERT INTO `grade` VALUES ('4', '一级', '0.6', '0.5', '0.7', '0.6', '0.7', '0.7', '0.6', '0', '2017-10-03 17:59:30', null);
INSERT INTO `grade` VALUES ('5', '二级', '0.5', '0.4', '0.5', '0.5', '0.6', '0.6', '0.4', '0', '2017-10-03 18:02:20', null);
INSERT INTO `grade` VALUES ('6', '三级', '0.4', '0.3', '0.5', '0.4', '0.5', '0.5', '0.4', '0', '2017-10-03 18:03:28', null);
INSERT INTO `grade` VALUES ('7', '四级', '0.3', '0.2', '0.5', '0.2', '0.3', '0.3', '0.2', '0', '2017-10-03 18:04:28', null);

-- ----------------------------
-- Table structure for tea
-- ----------------------------
DROP TABLE IF EXISTS `tea`;
CREATE TABLE `tea` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '茶叶主键',
  `name` varchar(20) NOT NULL COMMENT '茶叶名字',
  `shape` double unsigned NOT NULL COMMENT '茶叶形状',
  `color` double unsigned NOT NULL COMMENT '色泽',
  `clarity` double unsigned NOT NULL COMMENT '净度',
  `tang` double unsigned NOT NULL COMMENT '汤色',
  `aroma` double unsigned NOT NULL COMMENT '香气',
  `taste` double unsigned NOT NULL COMMENT '滋味',
  `leaf` double unsigned NOT NULL COMMENT '叶底',
  `grade_id` int(10) unsigned NOT NULL COMMENT '等级id',
  `status` tinyint(3) unsigned NOT NULL DEFAULT '0' COMMENT '记录状态',
  `gmt_creat` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `gmt_update` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tea
-- ----------------------------
INSERT INTO `tea` VALUES ('1', '信阳毛尖', '0.8', '0.9', '0.7', '0.8', '0.7', '0.9', '0.9', '2', '0', '2017-10-05 16:27:50', null);
INSERT INTO `tea` VALUES ('2', '铁观音', '0.9', '0.7', '0.7', '0.8', '0.7', '0.8', '0.9', '3', '0', '2017-10-05 16:29:44', null);
INSERT INTO `tea` VALUES ('3', '乌龙茶', '0.6', '0.7', '0.8', '0.8', '0.9', '0.6', '0.7', '3', '0', '2017-10-05 16:30:50', null);
INSERT INTO `tea` VALUES ('4', '大红袍', '0.9', '0.9', '0.8', '0.8', '0.9', '0.9', '0.9', '2', '0', '2017-10-05 16:31:50', null);
INSERT INTO `tea` VALUES ('5', '碧螺春', '0.9', '0.9', '0.9', '0.9', '0.9', '0.9', '0.9', '2', '0', '2017-10-05 16:33:35', null);
INSERT INTO `tea` VALUES ('6', '西湖龙井', '1', '0.9', '0.9', '0.9', '0.9', '0.9', '1', '1', '0', '2017-10-05 16:34:48', null);
INSERT INTO `tea` VALUES ('7', '庐山云雾茶', '0.9', '0.9', '0.8', '0.8', '0.9', '0.8', '0.8', '2', '0', '2017-10-06 10:15:29', null);
INSERT INTO `tea` VALUES ('8', '银针', '0.9', '0.8', '0.8', '0.8', '0.9', '0.9', '0.8', '2', '0', '2017-10-06 17:46:13', null);
INSERT INTO `tea` VALUES ('9', '毛峰', '0.9', '0.8', '0.9', '0.8', '0.9', '0.9', '0.8', '2', '0', '2017-10-06 19:56:05', '2017-10-06 19:56:05');
INSERT INTO `tea` VALUES ('10', '红茶', '0.8', '0.8', '0.9', '0.7', '0.8', '0.9', '0.9', '2', '0', '2017-10-06 19:56:58', null);
INSERT INTO `tea` VALUES ('11', '绿茶', '0.8', '0.7', '0.6', '0.6', '0.7', '0.8', '0.6', '4', '0', '2017-10-06 20:43:16', null);
INSERT INTO `tea` VALUES ('12', '普洱', '0.8', '0.6', '0.8', '0.6', '0.7', '0.7', '0.9', '3', '0', '2017-10-06 20:56:07', null);
INSERT INTO `tea` VALUES ('13', '六安瓜片', '0.8', '0.8', '0.9', '0.7', '0.7', '0.8', '0.8', '3', '0', '2017-10-06 21:06:12', null);
INSERT INTO `tea` VALUES ('14', '茉莉花茶', '0.8', '0.8', '0.7', '0.7', '0.8', '0.7', '0.6', '3', '0', '2017-10-08 13:34:48', null);
INSERT INTO `tea` VALUES ('15', '大麦茶', '0.1', '0.1', '0.1', '0.1', '0.1', '0.2', '0.1', '7', '0', '2017-10-08 13:55:27', '2017-10-08 13:55:27');
INSERT INTO `tea` VALUES ('16', '玫瑰花茶', '0.3', '0.3', '0.3', '0.3', '0.2', '0.4', '0.3', '7', '0', '2017-10-08 13:57:07', null);
INSERT INTO `tea` VALUES ('17', '柠檬茶', '0.4', '0.4', '0.3', '0.5', '0.5', '0.6', '0.6', '5', '0', '2017-10-08 13:57:51', null);
INSERT INTO `tea` VALUES ('18', '金银花茶', '0.4', '0.5', '0.5', '0.4', '0.4', '0.5', '0.6', '6', '0', '2017-10-08 13:58:40', null);
INSERT INTO `tea` VALUES ('19', '冰红茶', '0.1', '0.1', '0.1', '0.1', '0.1', '0.1', '0.1', '7', '0', '2017-10-08 21:53:05', null);

-- ----------------------------
-- Table structure for vote
-- ----------------------------
DROP TABLE IF EXISTS `vote`;
CREATE TABLE `vote` (
  `id` int(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '投票的主键',
  `name` varchar(20) NOT NULL COMMENT '投票的茶叶的名字',
  `image` varchar(50) NOT NULL,
  `votes` int(20) unsigned NOT NULL DEFAULT '0' COMMENT '投票数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of vote
-- ----------------------------
INSERT INTO `vote` VALUES ('1', '安化黑茶', 'ahhc.gif', '9');
INSERT INTO `vote` VALUES ('2', '安吉白茶', 'ajbc.gif', '11');
INSERT INTO `vote` VALUES ('3', '安溪铁观音', 'axtgy.gif', '14');
INSERT INTO `vote` VALUES ('4', '黄山毛峰', 'hsmf.gif', '17');
INSERT INTO `vote` VALUES ('5', '君山银针', 'jsyz.gif', '3');
INSERT INTO `vote` VALUES ('6', '六安瓜片', 'lagp.gif', '1');
INSERT INTO `vote` VALUES ('7', '庐山云雾茶', 'lsywc.gif', '7');
INSERT INTO `vote` VALUES ('8', '茉莉花茶', 'mlhc.gif', '4');
INSERT INTO `vote` VALUES ('9', '湄潭翠芽', 'mtcy.gif', '9');
INSERT INTO `vote` VALUES ('10', '普洱茶', 'pec.gif', '5');
INSERT INTO `vote` VALUES ('11', '武夷山大红袍', 'wysdhp.gif', '0');
INSERT INTO `vote` VALUES ('12', '信阳毛尖', 'xymj.gif', '0');
