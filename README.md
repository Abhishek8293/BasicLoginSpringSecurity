# Database Login Spring Security

## This repository demonstrates a Spring Security application with database login functionality.

## Project Structure:

1. `com.dblogin.config` - Security configuration classes (e.g., SecurityConfiguration, CustomUserDetailsService)
2. `com.dblogin.controller` - REST controllers (UserController)
3. `com.dblogin.dao` - Data access layer interface (UserDao) and implementation (UserDaoImpl)
4. `com.dblogin.dto` - Data Transfer Object (UserRegistrationDto)
5. `com.dblogin.entity` - Entity class (User)
6. `com.dblogin.repository` - JPA repository interface (UserRepository)
7. `com.dblogin.service` - Service layer (UserService)

## Features:

- User registration with user details stored in a database
- Spring Security for user authentication
- BCryptPasswordEncoder for secure password storage
- Customizable security configuration (antMatchers, authorizeRequests)
- Permitting specific URLs without authentication
- User login and logout functionalities with success URLs
- Example endpoints (`/permit`, `/success`, `/out`)

## Dependencies:

- Spring Boot
- Spring Security
- Lombok (optional)

## Database Setup:

1. Configure your preferred database (e.g., MySQL, PostgreSQL).
2. Create a table to store user credentials (username, password, roles, etc.).

## Running the Application:

1. Implement the UserDao interface with your specific database interactions (saving and retrieving users).
2. Configure your datasource connection details in `application.properties`.
3. Run the application using:` mvn spring-boot:run`

## Additional Notes:

- This is a basic example and can be extended for more complex authorization scenarios.
- Remember to configure your specific database connection details.
- Refer to Spring Security documentation for detailed configuration options.

## Further Resources:

- Spring Security documentation on JDBC Authentication: https://docs.spring.io/spring-security/reference/servlet/authentication/passwords/jdbc.html
- Baeldung Spring Security Registration Tutorial: https://github.com/Baeldung/spring-security-registration


