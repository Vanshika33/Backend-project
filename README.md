# Backend-project
A spring boot application using a memory database with one entity - Course. This entity should implement domain driven design concepts like, value objects , and bounded context. Bounded context with respect to Course creator use role , teacher user role and student user role. 
H2 dependency was selected during the project setup which provides the JARs required to enable the in-memory database.
This is a simple Spring Boot application designed for managing courses. The application adheres to Domain-Driven Design (DDD) principles, incorporating concepts such as value objects and bounded contexts. The bounded contexts are defined based on user roles: Course Creator, Teacher, and Student.

## Features

- **Course Entity:** Represents a course with properties such as `courseId` (a value object), `name`, and other course-related attributes.

- **Value Object - CourseId:** A value object representing the unique identifier of a course. It is implemented as a separate class `CourseId` to emphasize immutability.

- **Bounded Contexts:**
  - **Course Creator:** Allows Course Creators to perform specific operations related to course creation and management.
  - **Teacher:** Provides functionality for Teachers to interact with and manage courses they are associated with.
  - **Student:** Supports operations for Students to view and enroll in courses.

- **In-Memory Database:** Utilizes an in-memory database for simplicity in this example. You may switch to a more persistent database for a production environment.

## Project Structure

The project follows a standard Spring Boot project structure:

- **`src/main/java`:** Contains the main application code.
  - **`com.example.coursemanagement`:** Main package.
    - **`controller`:** Controllers handling HTTP requests.
      - `CourseController`: Manages general course-related operations.
      - `CourseCreatorController`: Handles operations specific to Course Creators.
      - `TeacherController`: Implements functionality for Teachers.
      - `StudentController`: Manages operations for Students.
    - **`model`:** Contains the domain model.
      - `Course`: The main entity representing a course.
      - `CourseId`: A value object representing the course identifier.
    - **`repository`:** Spring Data JPA repositories.
      - `CourseRepository`: Repository for course-related database operations.
    - **`service`:** Business logic and service classes.
      - `CourseService`: Service class for course-related operations.

## Getting Started

1. **Clone the Repository:**
    ```bash
    git clone https://github.com/Vanshika33/Backend-project/edit/main/ 
    cd course-management
    ```

2. **Build and Run:**
    ```bash
    ./mvnw spring-boot:run
    ```

3. **Access the Application:**
    - Open a web browser and go to `http://localhost:8080` to access the application.

## Configuration

- The application uses default configurations for the in-memory H2 database. You can customize the database settings in the `application.properties` file.

## Dependencies

- Spring Boot
- Spring Data JPA
- H2 Database (in-memory)

## Contributing

Feel free to contribute to the project by submitting issues or pull requests. Your feedback is valuable.
