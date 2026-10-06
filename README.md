# SpringDataJPA_CurdRepository_Project

A Spring Boot project demonstrating **CRUD (Create, Read, Update, Delete) operations** using **Spring Data JPA** and **CrudRepository** with a **MySQL database**.

## 📌 Project Overview

This project demonstrates how to build a simple CRUD application using Spring Boot, Spring Data JPA, and MySQL.

The application provides REST APIs to perform operations on employee data.

## 🛠️ Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- CrudRepository
- Hibernate
- MySQL
- Maven
- REST API
- Eclipse IDE

## 📂 Project Structure

```text
SpringDataJPA_CurdRepository_Project
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.example
│   │   │       ├── controller
│   │   │       ├── service
│   │   │       ├── repository
│   │   │       ├── entity
│   │   │       └── SpringDataJpaApplication.java
│   │   │
│   │   └── resources
│   │       └── application.properties
│   │
├── pom.xml
└── README.md
```

## ✨ Features

- Add a new employee
- Get all employees
- Get employee by ID
- Update employee details
- Delete employee
- MySQL database integration
- CRUD operations using `CrudRepository`

## 🔗 CRUD API Operations

| HTTP Method | Endpoint | Description |
|---|---|---|
| POST | `/addEmployee` | Add a new employee |
| GET | `/getEmployees` | Get all employees |
| GET | `/getEmployee/{id}` | Get employee by ID |
| PUT | `/updateEmployee/{id}` | Update employee |
| DELETE | `/deleteEmployee/{id}` | Delete employee |

> Update the endpoint names above if your actual controller uses different mappings.

## 🗄️ Database Configuration

Create a MySQL database:

```sql
CREATE DATABASE employee_db;
```

Configure the database in `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

Replace `YOUR_PASSWORD` with your local MySQL password.

## ▶️ How to Run

### 1. Clone the repository

```bash
git clone https://github.com/YOUR_USERNAME/SpringDataJPA_CurdRepository_Project.git
```

### 2. Open the project

Open the project in:

- Eclipse
- Spring Tool Suite (STS)
- IntelliJ IDEA

### 3. Configure MySQL

Create the database and update the MySQL username and password in:

```text
application.properties
```

### 4. Run the application

Run the Spring Boot main application class.

The application will start on:

```text
http://localhost:8080
```

## 📚 Concepts Practiced

- Spring Boot
- Dependency Injection
- REST API
- Spring Data JPA
- `CrudRepository`
- Hibernate
- Entity Mapping
- MySQL Database Connectivity
- CRUD Operations
- HTTP Methods
- Maven

## 👨‍💻 Author

**Abhishek Rathod**

Computer Science & Engineering Graduate

## 📄 License

This project is created for learning and educational purposes.
