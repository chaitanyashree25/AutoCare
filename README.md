# 🚗 AutoCarePro – Vehicle Service Center Management System

**AutoCarePro** is a full-featured Spring Boot backend project that simulates a real-world **Vehicle Service Center**. It showcases best practices in Spring Data JPA, clean REST API design, layered architecture, and advanced querying, built entirely using Java and Spring Boot.

---

## 📌 Project Objective

To provide a backend solution for managing:
- 🧑‍🔧 Customers and their registered vehicles
- 🛠️ Service appointments linked to specific vehicles
- 🔎 Search, filter, and paginate data efficiently

The project is built to practice and demonstrate **all important Spring Data JPA concepts** — from basic CRUD to advanced custom repositories, DTO projections, and pagination.

---

## ⚙️ Tech Stack

- **Java 17+**
- **Spring Boot**
- **Spring Data JPA**
- **H2 Database (in-memory)**
- **Lombok** (optional)
- **Postman** (for testing REST APIs)

---

## 🧱 Features Implemented

### ✅ Core Features
- CRUD operations for **Customers**, **Vehicles**, and **Service Appointments**
- Layered architecture: `Controller → Service → Repository → Entity`
- In-memory H2 database for fast dev/test

### ✅ Entity Relationships
- `Customer → List<Vehicle>` (`@OneToMany`)
- `Vehicle → Customer` (`@ManyToOne`)
- `ServiceAppointment → Vehicle` (`@ManyToOne`)

### ✅ Spring Data JPA Features Practiced

| Feature | Status |
|--------|--------|
| Basic CRUD with `JpaRepository` | ✅ |
| Derived queries (`findBy...`) | ✅ |
| Custom JPQL queries using `@Query` | ✅ |
| Native SQL queries | ✅ |
| Pagination & Sorting using `Pageable` | ✅ |
| DTO Projections using Interface | ✅ |
| Custom Repository Implementation with `EntityManager` | ✅ |
| Cascade operations (`CascadeType.ALL`, `orphanRemoval`) | ✅ |
| Lazy loading and fetch strategies (`FetchType.LAZY`) | ✅ |

---

## 🧪 API Endpoints

### 📍 `/api/customers`
- `GET` → Fetch all customers
- `POST` → Add customers (bulk insert supported)

### 📍 `/api/vehicles`
- `GET` → Paginated list of vehicles (`page`, `size`, `sort`)
- `POST` → Add vehicles
- `GET /search?make=X&model=Y` → Filter by make & model
- `GET /summaries` → Return DTO projection (make, model, reg. no)
- `GET /searchRegistration?keyword=X` → Search using native SQL
- `GET /search/model?model=X` → Custom JPQL query via EntityManager

### 📍 `/api/appointment`
- `GET` → Fetch all service appointments
- `POST` → Add new appointments (bulk supported)

---

## 🧑‍💻 How to Run Locally

1. Clone this repo
2. Open in IntelliJ or Eclipse
3. Run the `AutocareproApplication` main class
4. Open H2 console at `http://localhost:8080/h2-console`  
   - JDBC URL: `jdbc:h2:mem:testdb`
5. Test APIs using Postman or Swagger

---

## 📌 Folder Structure

src
├── controller/
│ └── CustomerController.java, VehicleController.java, ...
├── dto/
│ └── VehicleSummary.java
├── model/
│ └── Customer.java, Vehicle.java, ServiceAppointment.java
├── repository/
│ └── JpaRepositories + Custom Repo
├── service/
│ └── Business logic
└── AutocareproApplication.java
