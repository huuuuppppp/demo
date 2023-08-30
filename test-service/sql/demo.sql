/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80028
 Source Host           : localhost:3306
 Source Schema         : demo

 Target Server Type    : MySQL
 Target Server Version : 80028
 File Encoding         : 65001

 Date: 30/08/2023 16:54:11
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for employees
-- ----------------------------
DROP TABLE IF EXISTS `employees`;
CREATE TABLE `employees` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '职工id',
  `emp_name` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '职员姓名',
  `sex` varchar(32) DEFAULT NULL COMMENT '性别',
  `age` int DEFAULT NULL COMMENT '年龄',
  `dept_name` varchar(32) DEFAULT NULL COMMENT '部门名称',
  `emp_degree_name` varchar(32) DEFAULT NULL COMMENT '学历',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=45 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of employees
-- ----------------------------
BEGIN;
INSERT INTO `employees` (`id`, `emp_name`, `sex`, `age`, `dept_name`, `emp_degree_name`) VALUES (3, '123', '男', 111, '后勤部', '大专');
INSERT INTO `employees` (`id`, `emp_name`, `sex`, `age`, `dept_name`, `emp_degree_name`) VALUES (4, '张四', '女', 28, '人事部', '大专');
INSERT INTO `employees` (`id`, `emp_name`, `sex`, `age`, `dept_name`, `emp_degree_name`) VALUES (5, '张五', '男', 29, '后勤部', '大专');
INSERT INTO `employees` (`id`, `emp_name`, `sex`, `age`, `dept_name`, `emp_degree_name`) VALUES (6, '张六', '女', 29, '后勤部', '本科');
INSERT INTO `employees` (`id`, `emp_name`, `sex`, `age`, `dept_name`, `emp_degree_name`) VALUES (7, '张七', '男', 33, '业务部', '研究生');
INSERT INTO `employees` (`id`, `emp_name`, `sex`, `age`, `dept_name`, `emp_degree_name`) VALUES (8, '张八', '男', 32, '业务部', '本科');
INSERT INTO `employees` (`id`, `emp_name`, `sex`, `age`, `dept_name`, `emp_degree_name`) VALUES (9, '张九', '女', 33, '业务部', '大专');
INSERT INTO `employees` (`id`, `emp_name`, `sex`, `age`, `dept_name`, `emp_degree_name`) VALUES (10, '李一', '女', 45, '业务部', '研究生');
INSERT INTO `employees` (`id`, `emp_name`, `sex`, `age`, `dept_name`, `emp_degree_name`) VALUES (11, '李二', '女', 19, '人事部', '本科');
INSERT INTO `employees` (`id`, `emp_name`, `sex`, `age`, `dept_name`, `emp_degree_name`) VALUES (12, '李三', '男', 28, '业务部', '研究生');
INSERT INTO `employees` (`id`, `emp_name`, `sex`, `age`, `dept_name`, `emp_degree_name`) VALUES (13, '李四', '女', 46, '后勤部', '研究生');
INSERT INTO `employees` (`id`, `emp_name`, `sex`, `age`, `dept_name`, `emp_degree_name`) VALUES (14, '李五', '男', 58, '业务部', '大专');
INSERT INTO `employees` (`id`, `emp_name`, `sex`, `age`, `dept_name`, `emp_degree_name`) VALUES (15, '李六', '女', 22, '人事部', '研究生');
INSERT INTO `employees` (`id`, `emp_name`, `sex`, `age`, `dept_name`, `emp_degree_name`) VALUES (16, '李七', '男', 26, '后勤部', '大专');
INSERT INTO `employees` (`id`, `emp_name`, `sex`, `age`, `dept_name`, `emp_degree_name`) VALUES (17, '李八', '男', 25, '人事部', '研究生');
INSERT INTO `employees` (`id`, `emp_name`, `sex`, `age`, `dept_name`, `emp_degree_name`) VALUES (18, '李九', '女', 29, '后勤部', '研究生');
INSERT INTO `employees` (`id`, `emp_name`, `sex`, `age`, `dept_name`, `emp_degree_name`) VALUES (19, '王一', '男', 45, '后勤部', '本科');
INSERT INTO `employees` (`id`, `emp_name`, `sex`, `age`, `dept_name`, `emp_degree_name`) VALUES (20, '王二', '女', 21, '业务部', '本科');
INSERT INTO `employees` (`id`, `emp_name`, `sex`, `age`, `dept_name`, `emp_degree_name`) VALUES (21, '王三', '男', 21, '业务部', '大专');
INSERT INTO `employees` (`id`, `emp_name`, `sex`, `age`, `dept_name`, `emp_degree_name`) VALUES (22, '王四', '男', 23, '业务部', '大专');
INSERT INTO `employees` (`id`, `emp_name`, `sex`, `age`, `dept_name`, `emp_degree_name`) VALUES (23, '王五', '女', 33, '业务部', '大专');
INSERT INTO `employees` (`id`, `emp_name`, `sex`, `age`, `dept_name`, `emp_degree_name`) VALUES (24, '王六', '男', 45, '人事部', '本科');
INSERT INTO `employees` (`id`, `emp_name`, `sex`, `age`, `dept_name`, `emp_degree_name`) VALUES (25, '王七', '男', 35, '业务部', '研究生');
INSERT INTO `employees` (`id`, `emp_name`, `sex`, `age`, `dept_name`, `emp_degree_name`) VALUES (26, '王八', '男', 41, '后勤部', '本科');
INSERT INTO `employees` (`id`, `emp_name`, `sex`, `age`, `dept_name`, `emp_degree_name`) VALUES (27, '王九', '女', 25, '业务部', '大专');
INSERT INTO `employees` (`id`, `emp_name`, `sex`, `age`, `dept_name`, `emp_degree_name`) VALUES (28, '赵一', '男', 26, '人事部', '研究生');
INSERT INTO `employees` (`id`, `emp_name`, `sex`, `age`, `dept_name`, `emp_degree_name`) VALUES (29, '赵二', '男', 20, '后勤部', '本科');
INSERT INTO `employees` (`id`, `emp_name`, `sex`, `age`, `dept_name`, `emp_degree_name`) VALUES (30, '赵三', '女', 21, '人事部', '研究生');
INSERT INTO `employees` (`id`, `emp_name`, `sex`, `age`, `dept_name`, `emp_degree_name`) VALUES (31, '赵四', '男', 19, '后勤部', '研究生');
INSERT INTO `employees` (`id`, `emp_name`, `sex`, `age`, `dept_name`, `emp_degree_name`) VALUES (32, '赵五', '女', 35, '后勤部', '大专');
INSERT INTO `employees` (`id`, `emp_name`, `sex`, `age`, `dept_name`, `emp_degree_name`) VALUES (33, '赵六', '男', 24, '业务部', '研究生');
INSERT INTO `employees` (`id`, `emp_name`, `sex`, `age`, `dept_name`, `emp_degree_name`) VALUES (34, '赵七', '男', 29, '业务部', '大专');
INSERT INTO `employees` (`id`, `emp_name`, `sex`, `age`, `dept_name`, `emp_degree_name`) VALUES (35, '赵八', '女', 33, '业务部', '研究生');
INSERT INTO `employees` (`id`, `emp_name`, `sex`, `age`, `dept_name`, `emp_degree_name`) VALUES (36, '赵九', '男', 45, '业务部', '本科');
COMMIT;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int NOT NULL,
  `user_name` varchar(255) DEFAULT NULL COMMENT '用户名',
  `password` varchar(255) DEFAULT NULL COMMENT '用户密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` (`id`, `user_name`, `password`) VALUES (1, 'admin', 'admin');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
