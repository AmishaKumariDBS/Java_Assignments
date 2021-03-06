
## Installation

This [guide](https://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/html/) includes the step by step installation [instructions](https://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/html/getting-started.html#getting-started-installing-spring-boot)
## Modules
There are a number of modules in Spring Boot, here is a quick overview:
## spring-boot
The main library providing features that support the other parts of Spring Boot, these include:
The SpringApplication class, providing static convenience methods that can be used to write a stand-alone Spring Application. Its sole job is to create and refresh an appropriate Spring ApplicationContext
Embedded web applications with a choice of container (Tomcat, Jetty or Undertow)
First class externalized configuration support
Convenience ApplicationContext initializers, including support for sensible logging defaults
## spring-boot-autoconfigure
Spring Boot can configure large parts of common applications based on the content of their classpath. A single @EnableAutoConfiguration annotation triggers auto-configuration of the Spring context.
Auto-configuration attempts to deduce which beans a user might need. For example, if H2DB is on the classpath, and the user has not configured any database connections, then they probably want an in-memory database to be defined. Auto-configuration will always back away as the user starts to define their own beans.
## spring-boot-starters
Starters are a set of convenient dependency descriptors that you can include in your application. You get a one-stop-shop for all the Spring and related technology that you need without having to hunt through sample code and copy paste loads of dependency descriptors. For example, if you want to get started using Spring and JPA for database access include the spring-boot-starter-data-jpa dependency in your project, and you are good to go.
## spring-boot-cli
The Spring command line application compiles and runs Groovy source, allowing you to write the absolute minimum of code to get an application running. Spring CLI can also watch files, automatically recompiling and restarting when they change.
## spring-boot-actuator
Actuator endpoints let you monitor and interact with your application. Spring Boot Actuator provides the infrastructure required for actuator endpoints. It contains annotation support for actuator endpoints. Out of the box, this module provides a number of endpoints including the HealthEndpoint, EnvironmentEndpoint, BeansEndpoint and many more.
## spring-boot-actuator-autoconfigure
This provides auto-configuration for actuator endpoints based on the content of the classpath and a set of properties. For instance, if Micrometer is on the classpath, it will auto-configure the MetricsEndpoint. It contains configuration to expose endpoints over HTTP or JMX. Just like Spring Boot AutoConfigure, this will back away as the user starts to define their own beans.
## spring-boot-test
This module contains core items and annotations that can be helpful when testing your application.
## spring-boot-test-autoconfigure
Like other Spring Boot auto-configuration modules, spring-boot-test-autoconfigure, provides auto-configuration for tests based on the classpath. It includes a number of annotations that can be used to automatically configure a slice of your application that needs to be tested.
## spring-boot-loader
Spring Boot Loader provides the secret sauce that allows you to build a single jar file that can be launched using java -jar. Generally you will not need to use spring-boot-loader directly, but instead work with the Gradle or Maven plugin.
## spring-boot-devtools
The spring-boot-devtools module provides additional development-time features such as automatic restarts, for a smoother application development experience. Developer tools are automatically disabled when running a fully packaged application.
