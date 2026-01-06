# Student Management REST API

A simple Spring Boot REST API for managing students.

## Tech Stack
- Java 21
- Spring Boot
- Spring Web (REST)
- Spring Data JPA
- Hibernate
- PostgreSQL
- Lombok

## Features
- Create student
- Get all students
- Get student by ID
- Update student
- Delete student

## Architecture
Controller → Service → Repository → Database

## Example JSON (POST)
```json
{
  "firstNameString": "Ozcan",
  "lastnameString": "Yildiz",
  "birthOfDate": "1995-05-16"
}
