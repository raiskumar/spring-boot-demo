#Spring Boot Demo Application

## Logical Components
### 1. package: rest 
Http aware component which handles Http Request and Sends the response back to the cient/caller

### 2. pacakge: service
Non-Http aware. Abstracts business logic. Performs DB queries.

### 3. package: common
Provides common functionalities like Exception handling, config, property file reading etc.

## How to Build
$./gradlew build

## How to Run
$./gradlew bootRun

Or, run below after build
$java -jar build/libs/spring-boot-demo-0.0.1-SNAPSHOT.jar

## To Print Gradle dependencies
$./gradlew dependencies 

