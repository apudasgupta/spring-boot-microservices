# spring-boot-microservices
Spring Boot Microservices using Eureka for Service Discovery

This is a sample work to demonstrate Microservice Registration and Discovery - using Eureka in Spring Boot Project.

It contains 4 separate Spring Boot Maven Projects.
1) My-Microservice-1 : run on port 8091
2) My-Microservice-2 : run on port 8092
3) My-Microservice-Discovery-Server : run Eureka server on default port 8761 http://localhost:8761/
4) My-Microservice-Discovery-Client : run on port 8090
	

Need to run all project separately.

Eureka server runs on default port 8761 http://localhost:8761/ .

Microservice-1 and Microservice-2 both register itself with Eureka Discovery-Server
having application name respectively user-info-service and user-contact-service

My-Microservice-Discovery-Client :
	run on port 8090

	It has two endpoints: 
	http://localhost:8090/user/getDetailsAll
	http://localhost:8090/user/getDetailsById?userId=1
	
	UserDetail model is as follows:
	
	public class UserDetail {
		private Long id;
		private String name;
		private String email;
		private String phone;
		private String address;
	}
	
	where id,name and email are populated from microservice-1 ie: user-info-service
	and phone and address are populated from microservice-2 ie: user-contact-service
	
	Client project also use Swagger for API documentation. You can see the Swagger UI html by visiting
	http://localhost:8090/swagger-ui.html


	you are free to download and use it in your projects !!!
