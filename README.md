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
- Global Exception Handling (Zentrale Fehlerverwaltung)
- Request Validation (Überprüfung von Eingabedaten mit Bean Validation)

## Architecture
Client → Controller (Validation) → Service → Repository → Database
          ↑
    GlobalExceptionHandler (Catches all Errors)

## Example JSON (POST)
```json
{
  "firstNameString": "Ozcan",
  "lastnameString": "Yildiz",
  "birthOfDate": "1995-05-16"
}

## Error Handling
The API returns a structured JSON response when an error occurs:

| Field | Description |
| :--- | :--- |
| `id` | Unique error ID (UUID) for tracking |
| `errorTimeDate` | Timestamp of the error |
| `errors` | Map of field names and their specific validation messages |

**Example Error Response (400 Bad Request):**
```json
{
  "id": "550e8400-e29b-41d4-a716-446655440000",
  "errorTimeDate": "2026-01-11T17:30:00.000+00:00",
  "errors": {
    "firstNameString": ["must not be blank"],
    "birthOfDate": ["must be a past date"]
  }
}
