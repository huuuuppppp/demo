# <center>面试公司测试题demo</center>


------------


## 项目简介
根据面试官要求实现以下两个核心题目
1. 使用Vue-element-admin，springboot、mysql，实现登陆、职员信息管理功能
2. 编写两个shell，实现查询指定内容在指定的文件内出现的行数和查询系统内存磁盘CPU信息


------------


## 目录说明

```
demo
    │  README.md
    │  
    ├─  shell
    │   │ search.sh  //查询内容出现行数脚本 
    │   │ system_status.sh  //查询系统状态
    ├─  vue-admin-template-master  //前端项目源码
	|
    ├─  test-service    //后端源码
	    |  sql        //数据库初始化脚本
	    |  src        // 后端源码
```


------------

## 环境要求
1. JDK8+
2. Node3+
3. Git2+
4. MySql8+


------------
## 使用说明

### 前端启动：

```html
# 进入前端项目目录
cd vue-admin-template-master

# 安装依赖
npm install --registry=https://registry.npmmirror.com

# 本地开发 启动项目
npm run dev

#访问路径 http://localhost:9528/
```

### 后端启动
 1. 使用数据库脚本初始化数据库
 2. 修改application.yml配置文件中的数据源
 3. 运行DemoApplication.java
 
 
### Shell使用
 #### 查询内容所在行数脚本 （MacOS测试通过，ContOS未知）
 1. search.sh文件放到服务器上之后添加权限
 2. 运行 ./search.sh文件，根据提示先输入要搜索的内容，再输入指定的文件，再输入结果的输出位置，最后会在控制台输出查询结果，并生成文件
 
 #### 查询服务器状态脚本 （ContOS测试通过）
 
 1. system_status.sh文件放到服务器上之后添加权限
 2. 直接运行 system_status.sh文件即可在控制台输出结果
------------

## 技术栈
 1. Vue-element-admin
 2. Spring Boot 
 3. String MVC
 4. MyBatis-Plus
 5. Swagger

## 相关文档 
 
 1. [vue-element-admin](https://panjiachen.github.io/vue-element-admin-site/zh/ "vue-element-admin")
 2. [MyBatis-Plus](https://baomidou.com/ "MyBatis-Plus")
 3. 接口文档： 后端项目运行后 `IP:端口/swagger-ui/index.html`
 

------------

## 问题说明
 1. 所有接口未做Token校验
 2. 跨域请求处理为全部允许
 3. 只实现基础增删改查功能
 4. 登录只是伪登录，账号密码均为admin，只要根据账号密码能查询到数据，即可进行页面跳转

 
