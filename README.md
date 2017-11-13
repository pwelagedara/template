# template

The api documentation will be available in http://localhost:8088/v2/api-docs.
    
## To change the Spring Profile in IntelliJ 
In Terminal execute the following and restart the IDE.
```
launchctl setenv SPRING_PROFILES_ACTIVE production
```

## What is there?
* Swagger Documentation
* Exception Handling examples( Filter Level and Controller Level)
* Spring Security is enabled with Basic In-Memory Authentication( V1.0.0.RELEASE)
* Custom Error Messages for 401 and 403 responses from Spring Security
* Spring Data JPA
* Spring Profiles for Development and Production
* CORS Support for Web Apps
  
## RestTemplate 
Refer to [pwelagedara/bot](https://github.com/pwelagedara/bot) for examples. The code should go into com.pubudu.template.integration.rest package.

## WAR/EAR 
Refer to [pwelagedara/ear](https://github.com/pwelagedara/ear) for examples. 

## Releases
* V1.0.0.RELEASE - With In-Memory Authentication
* V1.0.0.RELEASE - With JDBC Authentication

