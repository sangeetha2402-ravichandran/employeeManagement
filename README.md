# 🌟 Employee Management System

[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.7.0-brightgreen)](https://spring.io/projects/spring-boot)
[![Java](https://img.shields.io/badge/Java-17-orange)](https://www.oracle.com/java/)
[![JWT](https://img.shields.io/badge/JWT-Security-blue)](https://jwt.io/)
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-14-blueviolet)](https://www.postgresql.org/)
[![License](https://img.shields.io/badge/License-MIT-yellow)](LICENSE)

---

## 📌 Overview

The **Employee Management System** is a Spring Boot application that provides a secure way to manage employees in an organization.  
It includes:

- 🔐 **JWT-based Authentication**
- 🛡 **Role-Based Access Control** (`ROLE_ADMIN`, `ROLE_USER`)
- 🗂 **CRUD Operations** for Employees
- 💾 **PostgreSQL Database Integration**
- 🏷 **Spring Security for Authentication & Authorization**

---

## 🛠 Features

### Authentication
- Users can **register** with a username and password.
- Users can **login** to receive a **JWT token** for subsequent requests.
- Passwords are stored **securely hashed** using **BCrypt**.

### Authorization
- **ROLE_ADMIN**: Full access to all endpoints.
- **ROLE_USER**: Restricted access based on role permissions.

### Employee Operations
- Create, Read, Update, Delete employee data.
- Search and list employees.
- Protected endpoints using **Spring Security** and **JWT**.

---

## 🚀 Technologies Used

| Technology | Purpose |
|------------|---------|
| Spring Boot | REST API development |
| Spring Security | Authentication & Authorization |
| JWT | Stateless token-based security |
| PostgreSQL | Relational database |
| Maven | Build & Dependency Management |
| Lombok | Boilerplate reduction |
| JPA / Hibernate | ORM for database interaction |
| Swagger (Optional) | API Documentation |

---
## Workflow Diagram
**<img width="1536" height="1024" alt="image" src="https://github.com/user-attachments/assets/e6ff4139-8657-4591-9ad4-efac44c6b10f" />
**

## 📝 Installation

1. **Clone the repository**
```bash
 git clone https://github.com/sangeetha2402-ravichandran/employee-management-system.git
cd employee-management-system

