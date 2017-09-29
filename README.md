## Spring Boot Demo Application
A demo (Rest Service) application to show the power and simplicity of Spring Boot!
Note:
<br/>1. Make sure that your IDE has Lombok plugin.
<br/>2. Also, ensure that - Annotation processing is enabled in your IDE (in case you are using IDE)

## Logical Components
#### 1. package: rest 
Http aware component which handles Http Request and Sends the response back to the client/caller.
Shows how to do Request Mapping in the Controller. 

#### 2. package: service
Non-Http aware. Abstracts business logic. Performs DB queries.

#### 3. package: common
Provides common functionalities like Exception handling, config, property file reading etc.

## Component Diagram
Below is the component diagram of the demo application. [ref1](https://www.ibm.com/developerworks/rational/library/dec04/bell/index.html) & [ref2](http://www.uml-diagrams.org/component.html)
![component-diagram](https://github.com/raiskumar/spring-boot-demo/blob/master/component-diagram.png)


## How to Build and Run
#### Build with gradlew or gradle
    $./gradlew build

#### Run using Spring boot command
    $./gradlew bootRun

#### Run with Jar
    $java -jar build/libs/spring-boot-demo-0.0.1-SNAPSHOT.jar

#### Run with profile
    $java -jar -Dspring.profiles.active=jenkins build/libs/spring-boot-demo-0.0.1-SNAPSHOT.jar

Refers to Application-jenkins.properties

#### Show Gradle dependencies
    $./gradlew dependencies 

## Features in the application
1. Application Setup with a sample controller and service component. 
2. Support for message.properties and application.properties. (Check PropertyReader.java)
3. How to change values based on profile. Application.properties and Application-local.properties are two profiles available. Spring boot can pick the appropriate profile based on the value of 'spring.profiles.active'.
Note, how the server can be started on different port based on the value.
4. Provide a custom error message (in JSON format) if something goes wrong
5. Handle Exception at a centralized place using Spring Boot suggested approach (Check RestControllerAdvice for more details) 


### References:
1. Configuring profile using YAML: https://hoserdude.com/2014/06/19/spring-boot-configurationproperties-and-profile-management-using-yaml/

