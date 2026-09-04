# Job Application Tracker

A backend REST API built with Spring Boot for managing and tracking job applications.

The application allows users to create, view, update, and delete job application records while storing the data in a MySQL database.

## Features

- Create a new job application
- View all job applications
- View a job application by ID
- Update an existing job application
- Delete a job application
- Input validation
- Global exception handling
- MySQL database integration
- Docker support for the application and database

## Tech Stack

- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Docker
- Docker Compose
- Git & GitHub

## Project Structure

```text
src/main/java/com/jyothi/jobapplicationtracker/
├── controller/
├── exception/
├── model/
├── repository/
├── service/
└── JobApplicationTrackerApplication.java
```

## API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| GET | `/api/applications` | Get all job applications |
| GET | `/api/applications/{id}` | Get application by ID |
| POST | `/api/applications` | Create a new application |
| PUT | `/api/applications/{id}` | Update an application |
| DELETE | `/api/applications/{id}` | Delete an application |

## Database Configuration

The application uses MySQL.

Database credentials are supplied through environment variables instead of being stored directly in the source code.

## Run with Docker

Set the database password in PowerShell:

```powershell
$env:DB_PASSWORD="your-password"
```

Start the application and MySQL:

```powershell
docker compose up --build
```

After the containers start, the API is available at:

```text
http://localhost:8081/api/applications
```

To stop the containers:

```powershell
docker compose down
```

## Run Locally

Make sure MySQL is running and the `job_tracker` database exists.

Set the database password:

```powershell
$env:DB_PASSWORD="your-password"
```

Run the application:

```powershell
.\mvnw.cmd spring-boot:run
```

## Author

Jyothi Battini