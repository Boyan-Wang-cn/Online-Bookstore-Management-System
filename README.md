**Introduction**

This is a simple book management system, with the backend developed using web technologies, the frontend implemented in HTML, and a MySQL database. It involves basic data operations such as Create, Read, Update, and Delete (CRUD), database access, and captcha verification, which can help web beginners to learn more effectively.

**System Architecture**

The system is designed with a front-end and back-end separation architecture: the frontend uses Vue + ElementUI + Axios, and the backend uses Spring Boot + MyBatis.

The database structure is established: MySQL is used to create corresponding data tables, including book tables, book category tables, user tables, order tables, etc.

**Administrator Functions**

- Book Management: Implement CRUD functions for books, including entering, editing, deleting, and querying book information.

- Book Category Management: Implement CRUD functions for book categories, including adding, deleting, modifying, and querying categories.

- User Management: Implement CRUD functions for users, including adding, deleting, modifying, and querying user information.

- Administrator Interface: Design a clear menu navigation for quick access to book management, book category management, and user management pages, as well as a safe exit button.

- The administrator interface is shown in the following figure:

  ![Image](https://github.com/user-attachments/assets/90a31cfd-5666-4b72-b64e-7cea3d542128)

**User Functions**

- Book Browsing: After logging in, users can browse all book information in the system, including title, author, category, price, etc.

- Purchase Function: Users can select books for purchase, implementing the addition of orders. After purchasing, the system should generate the corresponding order items and save them to the database.

- Order Viewing: Users can view their purchase history, including order number, purchase time, and book information.

- The user interface is shown in the following figure:

  ![Image](https://github.com/user-attachments/assets/4ed030e9-3290-4138-93dc-0fafb9725eea)

**Development Environment**

- Frontend: HBuilder is used as the development IDE, Vue as the framework, ElementUI as the UI component library, and Axios for HTTP requests.

- Backend: IntelliJ IDEA is used as the development IDE, Spring Boot as the framework, Spring MVC as the MVC framework, MyBatis as the persistence layer framework, and MySQL as the database.

**Database Design (To replicate, please add the following attributes to create MySQL tables and connect to the database)**

- Book Table: Stores book information, including Book ID (primary key, auto-increment), title, author, category ID, price, inventory, ISBN (unique), book description, etc.

- Book Category Table: Stores book category information, including Category ID (primary key, auto-increment), category name (unique), etc.

- User Table: Stores user information, including User ID (primary key, auto-increment), username (unique), password, email, role, registration time, etc.

- Order Table: Stores user order information, including Order ID (primary key, auto-increment), title, quantity, purchase time, total price, etc.

  Additionally, the category ID in the book table is a foreign key, and if there is no such ID in the book category table, the book cannot be added.

**Usage**

First, place the backend code in IDEA, load the Maven dependencies, modify the database connection to your own database, and then start it.

Then, place the frontend code in HBuilder, find the entry page main.html, and load it in the browser to use the project.

**Contribution**

Everyone is welcome to contribute to the online bookstore management system. There are actually some bugs in it, and I appreciate any criticism and correction of my code.

**Author**

* **Wang Boyan** - *Initial work* - [Boyan-Wang-cn](https://github.com/Boyan-Wang-cn)

Also, thanks to the [contributors](https://github.com/Boyan-Wang-cn/Online-Bookstore-Management-System/contributors) who participated in this project.

**License**

This project follows the MIT license - for more information, please refer to the [LICENSE.md](LICENSE.md) file.

**Acknowledgments**

* Salute to the original authors of any code used.
* Inspiration, code snippets, etc.

## 简介
  这是一个简易的图书管理系统，后端采用web开发，前端使用html语言，数据库使用的Mysql。里面涉及到简单的数据增删改查操作、访问数据库、验证码验证等操作，可以帮助web初学者更好地学习。
## 系统架构
  设计前后端分离的系统架构：前端采用Vue+ElementUI+Axios，后端采用Spring Boot+MyBatis。
  
  确立数据库结构：使用MySQL创建相应的数据表，包括书籍表、书籍类别表、用户表、订单表等。
## 管理员功能
  书籍管理：实现书籍的增删改查功能，包括书籍信息的录入、编辑、删除以及查询。
  
  书籍类别管理：实现书籍类别的增删改查功能，包括类别的添加、删除、修改以及查询。
  
  用户管理：实现用户的增删改查功能，包括用户信息的添加、删除、修改以及查询。
  
  管理员界面：设计清晰的菜单导航，方便管理员快速跳转到书籍管理、书籍类别管理、用户管理页面，还有安全退出按钮。
  
  管理员界面如下图所示
  
  ![图片](https://github.com/user-attachments/assets/90a31cfd-5666-4b72-b64e-7cea3d542128)

## 用户端功能
  书籍浏览：用户登录后可以浏览系统中的所有书籍信息，包括书名、作者、类别、价格等。
  
  购买功能：用户可以选择书籍进行购买，实现订单的增加功能。购买后，系统应生成相应的订单项并保存到数据库中。
  
  订单查看：用户可以查看自己的购买记录，包括订单编号、购买时间、书籍信息。

  用户界面如下图所示：
  
  ![图片](https://github.com/user-attachments/assets/4ed030e9-3290-4138-93dc-0fafb9725eea)

## 开发环境
  前端：使用HBuilder作为开发IDE，Vue作为框架，ElementUI作为UI组件库，Axios用于HTTP请求。
  
  后端：使用IntelliJ IDEA作为开发IDE，Spring Boot作为框架，Spring MVC作为MVC框架，MyBatis作为持久层框架，MySQL作为数据库。
  
## 数据库设计(若想复现，请按照以下属性添加mysql的表，并进行数据库连接）
  书籍表：用于存储书籍信息，包括书籍ID（主键、自增）、书名、作者、类别ID、价格、库存、isbn号（唯一）、书记描述等字段。
  
  书籍类别表：用于存储书籍类别信息，包括类别ID（主键、自增）、类别名称（唯一）等字段。
  
  用户表：用于存储用户信息，包括用户ID（主键、自增）、用户名（唯一）、密码、邮箱、角色、注册时间等字段。
  
  订单表：用于存储用户的订单信息，包括订单ID（主键、自增）、书名、购买数量、购买时间、总价等字段。
  
  同时，书籍表中的类别ID为外键，若书籍类别表中不存在该ID，则无法增加该书籍。
  
## 使用方法

首先将后端代码放入IDEA中，加载其中的maven依赖，将数据库连接处修改为自己的数据库，然后启动即可。

然后将前端代码放入HBuilder中，找到入口页面main.html在浏览器中加载出来即可使用该项目


## 贡献

欢迎大家对在线书店管理系统的贡献。里面其实也是有一些bug的，感谢大家对我的代码进行批评改正。

## 作者

* **王博妍** - *初始工作* - [Boyan-Wang-cn](https://github.com/Boyan-Wang-cn)

同时，也感谢参与本项目的[贡献者](https://github.com/Boyan-Wang-cn/Online-Bookstore-Management-System/contributors)。

## 许可证

本项目遵循MIT许可证——有关详细信息，请参阅[LICENSE.md](LICENSE.md)文件。

## 致谢

* 向任何被使用的代码的原作者致敬
* 灵感，代码片段等。
