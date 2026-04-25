## 🚀 Employee Management Microservices System

A production-ready Employee Management System built using Spring Boot Microservices Architecture, demonstrating strong backend engineering principles, clean code practices, and scalable system design.

This project was developed as part of a technical assessment to showcase expertise in Java, Spring Ecosystem, and Distributed Systems.

## 📌 Project Overview

This system provides RESTful APIs to manage employee data with features such as:

Retrieve all employees
Fetch employee by UUID
Create new employee records

The application is built using a microservices-based architecture, ensuring scalability, modularity, and fault tolerance.

## 🏗️ Architecture Design

The system follows industry-standard layered architecture (MVC) combined with microservices patterns:

🔹 MVC Structure
Controller Layer → Handles HTTP requests (@RestController, ResponseEntity)
Service Layer → Contains business logic
Repository Layer → Handles persistence using Spring Data JPA
Entity Layer → Represents database models

---

## 🌐 Microservices Components
### 🔸 1. Service Registry (Eureka Server)
Centralized service discovery using Netflix Eureka
All services register themselves dynamically
Enables loose coupling between services
Service Registry → http://localhost:8080/eureka/

### 🔸 2. API Gateway (Spring Cloud Gateway)
Single entry point for all client requests
Routes requests to appropriate microservices
Configured with path-based routing
spring.cloud.gateway.routes[0].id=REILIAQUESTENTRYLEVELJAVACHALLENGE
spring.cloud.gateway.routes[0].uri=lb://REILIAQUESTENTRYLEVELJAVACHALLENGE
spring.cloud.gateway.routes[0].predicates[0]=Path=/api/v1/employee/**

### 🔸 3. Employee Service
Core microservice handling employee operations
Registered with Eureka
Exposes REST APIs via Gateway
Service Name: REILIAQUESTENTRYLEVELJAVACHALLENGE  
Port: 8081

---

## 🗂️ Project Structure
```
employee-management-system/
│
├── service-registry/
├── api-gateway/
├── employee-service/
│   ├── controller/
│   ├── service/
│   ├── repository/
│   ├── entity/
│   ├── exception/
│
└── README.md
```
---

## ⚙️ Tech Stack
Java 17+
Spring Boot
Spring Web (REST APIs)
Spring Data JPA
Spring Cloud (Eureka + Gateway)
H2 In-Memory Database
Maven

## 📡 API Endpoints (via API Gateway)
Method	Endpoint	Description
GET	/api/v1/employee	Get all employees
GET	/api/v1/employee/{uuid}	Get employee by UUID
POST	/api/v1/employee	Create new employee

## 📥 Sample Request
```
{
  "firstName": "John",
  "lastName": "Doe",
  "salary": 60000,
  "age": 28,
  "jobTitle": "Software Engineer",
  "email": "john.doe@example.com"
}
```

## 📤 Sample Response
```
{
  "uuid": "generated-uuid",
  "firstName": "John",
  "lastName": "Doe",
  "fullName": "John Doe",
  "salary": 60000,
  "age": 28,
  "jobTitle": "Software Engineer",
  "email": "john.doe@example.com",
  "contractHireDate": "2026-04-25T10:15:30Z",
  "contractTerminationDate": null
}
```

## 💡 Notes
uuid → Automatically generated
fullName → Derived from first and last name
contractHireDate → Auto-set during creation
contractTerminationDate → Null for active employees

## ⚠️ Exception Handling

Global exception handling is implemented using @ControllerAdvice:

404 NOT FOUND → Resource not found
400 BAD REQUEST → Invalid input/data issues
500 INTERNAL SERVER ERROR → Unexpected errors

Ensures clean and consistent API responses.

---

## 🧠 Key Highlights
✔ Clean MVC layered architecture
✔ Fully functional Microservices setup
✔ Service Discovery using Eureka
✔ API Gateway routing with Spring Cloud Gateway
✔ UUID-based entity management
✔ Proper use of ResponseEntity
✔ Centralized exception handling
✔ Lightweight H2 in-memory database
✔ Production-ready structure

---

## ▶️ How to Run the Project
### 1️⃣ Start Service Registry
 Run Eureka Server (Port 8080)

### 2️⃣ Start Employee Service

Runs on Port 8081 and registers with Eureka

### 3️⃣ Start API Gateway

Runs on Port 8082 and routes requests

## 🔗 Access Application
Eureka Dashboard → http://localhost:8080
API Gateway → http://localhost:8082/api/v1/employee

## 📈 Future Enhancements
Input validation using @Valid
DTO layer for abstraction
Authentication & Authorization (JWT)
Logging & Monitoring (Spring Boot Actuator)
Integration with MySQL/PostgreSQL

## 👨‍💻 Conclusion
This project demonstrates:

Strong understanding of Spring Boot & Microservices
Ability to design scalable and maintainable systems
Clean coding practices and professional API design

It reflects real-world backend development standards and readiness for enterprise-level applications.
