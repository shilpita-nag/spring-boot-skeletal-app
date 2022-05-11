# spring-boot-skeletal-app
A simple spring boot hello world application that can be used as a skeletal for other apps

### Step 1:
[Spring Initializr](https://start.spring.io/) to generate the base for our project

### Step 2:
Make sure dependencies spring-boot-starter and spring-boot-starter-web are added. These are useful for REST-style Web Application development.

<b><u>The spring-boot-starter-web bring in the following main dependencies:</b></u>\
Spring boot configuration stuff.\
Spring web mvc components.\
Embedded Tomcat 9.0.53.\
Slf4j logback for logging.\
Snakeyaml for external YAML properties.\
Jackson 2.x for JSON binding.

### Step 3:
Create a @SpringBootApplication annotated class. This will be the starting point of the spring boot application. 
Running this class, would start the application.

### Step 4:
Create a REST Controller that returns message for the root path /. 
Use @RestContoller to annotate a Class as REST
Use @RequestMapping to define the root path

### Step 5:
Added Unit Test. Define class as Unit Test class by using annotation @SpringBootTest