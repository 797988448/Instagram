# <h1 align = "center">  Insta Basic </h1>
___ 
<p align="center">
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.1.3-brightgreen.svg" />
</a>
<a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.0.6-brightgreen.svg" />
</a>
</p>

---

<p align="left">

<!-- Project Description -->
## Overview
<p align="center">This project,   Insta Basic ," is a robust Spring Boot application designed for managing user data efficiently. It provides a set of API endpoints that allow you to perform various operations on user records, such as adding, retrieving, updating, and deleting user information. 
</p>

<!-- Table of Contents -->
## Table of Contents
1. [Technologies Used](#technologies-used)
2. [Key Features](#key-features)
3. [Usage](#usage)
4. [API reference](#api-reference)
5. [License](#license)
6. [Acknowledgments](#acknowledgments)
7. [Contact](#contact)

<!-- Technologies Used -->
## Technologies Used
- Java 8
- Spring Boot
- Spring Web Initializer
- Maven
- Spring Web Dependency
- SQL DRIVER
- JPA
- SWAGGER
- sQL DATABASE
- OneToOne Mapping
- OneToMany Mapping
- ManyToMany Mapping
- ManyToOne Mapping

## Model Classes
- Address Entity :-The Address entity represents an address record in your Spring Boot application. It is used to store information about a user's address, including details such as name, landmark, phone number, zipcode, and state. This entity is associated with the User entity through a one-to-one relationship.
- Book Entity :-The fields in the Book entity represent specific attributes associated with an order in your Spring Boot application. These fields capture information about the user, product, address, and product quantity for an order.
- Course Entity :-The fields in the Course entity represent specific attributes associated with a product in your Spring Boot application. These fields capture information about the product's name, price, description, category, and brand.
- Student Entity :-The fields in the Student entity represent specific attributes associated with a user in your Spring Boot application. These fields capture information about the student's name, email, password, and phone number.
- Laptop Entity :-The fields in the Student entity represent specific attributes associated with a user in your Spring Boot application. These fields capture information about the student's name, email, password, and phone number.
## Controller Class
- Address Controller :-The AddressController is a Spring MVC controller class responsible for handling HTTP requests related to address operations in your Spring Boot application.
- Student Controller :-The OrderController is a Spring MVC controller class responsible for handling HTTP requests related to order operations in your Spring Boot application.
- Courset Controller :-The ProductController is a Spring MVC controller class responsible for handling HTTP requests related to product operations in your Spring Boot application.
- Stuent Controller :-The UserController is a Spring MVC controller class responsible for handling HTTP requests related to user operations in your Spring Boot application.
- Laptop Controller :-The UserController is a Spring MVC controller class responsible for handling HTTP requests related to user operations in your Spring Boot application.
## Service Class
- Address Service :-The AddressService is a service class in your Spring Boot application responsible for handling address-related operations. It includes the addAllAddress method, which allows you to add multiple addresses to your system.
- Course Service :-The OrderService is a service class in your Spring Boot application responsible for handling order-related operations. It includes the getAllOrder and addOrder methods, which allow you to retrieve all orders and add new orders to your system, respectively.
- Student Service :-The ProductService is a service class in your Spring Boot application responsible for handling product-related operations. It includes several methods for adding, retrieving, filtering, and deleting products.
- Book Service :-The UserService is a service class in your Spring Boot application responsible for handling user-related operations. It includes two methods for adding users and retrieving users by their ID.
- Laptop Service :-The UserService is a service class in your Spring Boot application responsible for handling user-related operations. It includes two methods for adding users and retrieving users by their ID.


<!-- Key Features -->
## Key Features
- Get Student by Id.
- Get all Sudent.
- Get Student Details By Id.
- Delete Course By Id.
- Update StudentName
- SingUp
- SingIn

<!-- Usage -->
## Usage
- Access the application at `http://localhost:8080`.
- Use the provided API endpoints to CRUD Operation And Custom finder.

### Controller:
- It consists of a class named APIController which basically controls the flow of data.
- @RestController annotation is used to make the APIController as a controller layer.
- We perform the CRUD operations such as @PostMapping , @GetMapping , @PutMapping , @DeleteMapping.

### API Reference

#### Add Users :
PostMethod :  http://localhost:8080/posts
### UPdate User:
PutMapping : http://localhost:8080/companyName/Id

### Delete User:
DeleteMapping: http://localhost:8080/Delete/Id/


#### Get All Users :
 - GET Method : http://localhost:8080/get

 

 <!-- Acknowledgments -->
## Acknowledgments
- Thank you to the Spring Boot and Java communities for providing excellent tools and resources.

<!-- Contact -->
## Contact
For questions or feedback, please contact : SHRAVAN KUMAR   -
- Maild Id : shravankm93@gmail.com

<h1 align="center">Thank You...<h1>
<h3 align = "center"> ***********************************************************<h3>
*  Insta Basic 
