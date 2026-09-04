# Job Application Tracker

A Spring Boot REST API for managing and tracking job applications.

## Features

- Create a job application
- View all job applications
- View a job application by ID
- Update a job application
- Delete a job application
- Request validation
- Global exception handling
- MySQL database integration

## Tech Stack

- Java 21
- Spring Boot
- Spring Data JPA
- REST APIs
- MySQL
- Maven
- Git

## API Endpoints

- POST `/api/applications`
- GET `/api/applications`
- GET `/api/applications/{id}`
- PUT `/api/applications/{id}`
- DELETE `/api/applications/{id}`

## Database

Create a MySQL database:

```sql
CREATE DATABASE job_tracker;