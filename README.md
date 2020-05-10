# Operation Code KC's Sample Java Spring Web Service

This project demonstrates how to use the [Spring Initializr](https://start.spring.io/) to spin up a basic 
Java Spring web service.

Clone the project to get the results of our first online session

## How the project was created

To start from the beginning, follow these steps:

1. Install a Java IDE such as [IntelliJ](https://www.jetbrains.com/idea/) <sup>$</sup> or [Spring Tool Suite](https://spring.io/tools/) <sup>free</sup>
1. Create a starter project from [Spring Initializr](https://start.spring.io/)    
   * Make sure "Maven Project" is selected  
   * Language is "Java"
   * Keep the default "Spring Boot" version
   * Fill in the "Project Metadata"
     * Group "com.opcode"
     * Artifact "employees"
     * Name "employees"
     * Package Name "com.opcode.employees"
   * Add Dependencies
     * Spring Web
     * Spring Data JPA
     * H2 Database
     * Spring Boot Actuator  ![Spring Initializr](https://github.com/OperationCodeKC/EmployeeSpringServiceExample/blob/develop/doc/springInitializr.png?raw=true)
   * Click "Generate" to download the zipped up project 
1. Unzip the project archive in a location (for example, C:\projects\)
1. Import the Maven project into your IDE

