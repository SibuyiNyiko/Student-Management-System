# Student Management System

A web-based Student Management System built with **Java**, **Spring
Boot**, and **Maven**. The application is structured using controller,
service, repository, and entity layers, with Thymeleaf templates for the
user interface.

## Overview

This project is intended to make student information easier to manage
through a web application. It is also a practical Java project
demonstrating Spring Boot application structure and server-rendered web
pages.

## Features

Based on the current project structure, the application includes pages
and components for:

-   Viewing the student list
-   Creating a student record
-   Editing a student record
-   Deleting a student record
  

## Technologies Used

-   **Java** --- application programming language
-   **Spring Boot** --- application framework
-   **Maven** --- dependency and build management
-   **Thymeleaf** --- server-side HTML templates
-   **HTML** --- web page structure
-   **Git and GitHub** --- version control and project hosting

The exact database and dependency versions are defined by the project
configuration. Check `pom.xml` and
`src/main/resources/application.properties` for the details.

## Project Structure

``` text
StudentManagementSystem/
├── .mvn/wrapper/                 # Maven Wrapper configuration
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/java/StudentManagementSystem/
│   │   │       ├── controller/   # Handles web requests
│   │   │       ├── entity/       # Student data model
│   │   │       ├── repository/   # Data access layer
│   │   │       ├── service/      # Application/business logic
│   │   │       └── ...           # Application entry point
│   │   └── resources/
│   │       ├── templates/        # Thymeleaf HTML pages
│   │       └── application.properties
│   └── test/                     # Application tests
├── mvnw                          # Maven Wrapper for Linux/macOS
├── mvnw.cmd                      # Maven Wrapper for Windows
├── pom.xml                       # Maven project configuration
└── README.md
```

## Requirements

Before running the application, install:

-   A compatible JDK for the Java version configured in `pom.xml`
-   Git (optional, for cloning and version control)

You do not need to install Maven separately when using the included
Maven Wrapper.

## Getting Started

### 1. Clone the repository

``` bash
git clone https://github.com/SibuyiNyiko/Student-Management-System.git
cd Student-Management-System
```

### 2. Check the application configuration

Open `src/main/resources/application.properties` and review the
configured server port, database connection, and any other required
settings.

If the project uses a database, make sure the database server and
database exist and that the connection settings are correct. Do not
commit real passwords, API keys, or other secrets to GitHub.

### 3. Run the application on Windows

From the project root, run:

``` bash
.\mvnw.cmd spring-boot:run
```

Alternatively, build the project first:

``` bash
.\mvnw.cmd clean package
```

Then run the generated JAR from the `target` folder, using its actual
filename:

``` bash
java -jar target/<generated-jar-name>.jar
```

### 4. Run the application on macOS/Linux/Git Bash

In Git Bash, run:

``` bash
./mvnw spring-boot:run
```

If the wrapper does not have execute permission in a Linux/macOS
environment, run `chmod +x mvnw` first.

### 5. Open the application

When the application starts successfully, open a browser and visit:

``` text
http://localhost:8080
```

If you configured a different port in `application.properties`, use that
port instead. The exact page path may depend on the controller mappings
in the source code.

## Running Tests

To run the project's tests:

**Windows**

``` bash
.\mvnw.cmd test
```

**Git Bash / macOS / Linux**

``` bash
./mvnw test
```

## Development Notes

-   Open the project in Eclipse or another Java IDE that supports Maven
    projects.
-   Keep business logic in the service layer and data-access operations
    in the repository layer.
-   Validate user input and handle errors clearly.
-   Add or update tests when changing application behaviour.
-   Keep credentials and environment-specific settings out of public
    commits.

## Future Improvements

Possible enhancements, depending on the current implementation, include:

-   Input validation and clearer error messages
-   Search, sorting, and pagination for student records
-   Improved responsive styling and accessibility
-   Automated tests for controller and service logic
-   Clear setup instructions for the database
-   Screenshots or a short demo of the application

## Author

**Nyiko Sibuyi**

GitHub: [@SibuyiNyiko](https://github.com/SibuyiNyiko)

## Repository

[Student Management System on
GitHub](https://github.com/SibuyiNyiko/Student-Management-System)
