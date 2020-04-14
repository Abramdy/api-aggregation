# API aggregation service
This is a java/spring boot based REST service application that runs the API Aggregation. 

## About the Application
* User will give an input as query param for pricing, track and shipments
* Application validates the query param input values as per the specification and call the respective service.
* Get the response from all three services and aggregate the response and sent it back to the caller. 

## Install & Running
 
### Prerequisites
* [Java 1.8](http://www.oracle.com/technetwork/java/javase/downloads/index.html)  - Programming language
* [Maven 3.5.0](https://maven.apache.org/download.cgi) - Build tool

* Run the web server on dev mode
```
$ mvn spring-boot:run
```

* Run the web server on prod mode
```
$ mvn spring-boot:run -Dspring-boot.run.profiles=prod
```

### API documentation
After running the project on dev environment and browse
[http://localhost:8081/swagger-ui.html](http://localhost:8081/swagger-ui.html)

## Dependencies Used
* Spring Dev Tools
* Lombok
* Swagger API (REST Documentation)

## How to use Docker image?
As per the application requirement we download Docker image.
* Download the Docker image
```
docker pull xyzassessment/backend-services
```
* Check Docker Images
```
docker images
```
* Run your local docker container
```
docker container run -p 8080:8080 xyzassessment/backend-services
```

## Built With
* [Spring boot 2.2.5](https://projects.spring.io/spring-boot/) - Backed Framework
* [Maven](https://maven.apache.org/) - Dependency Management

## Authors

* **Karthikeyan Nithiyanandam**

## License

This project is licensed under the MIT License

