# Kafka Producer and Consumer Demo with Spring Boot 4

This project is a local hands-on Kafka setup built using Spring Boot 4, with separate producer and consumer applications.

It demonstrates:

- Publishing JSON messages to Kafka
- Consuming messages from Kafka
- Testing Kafka using REST endpoints
- Debugging serializer and deserializer issues
- Understanding producer and consumer flow in a real setup

---

## Tech Stack

- Java 17
- Spring Boot 4
- Spring Kafka
- Apache Kafka
- Maven
- REST APIs for testing

---

## What This Project Covers

### Producer

The producer application:

- Runs on port `8081`
- Accepts a `Course` object
- Publishes the message to Kafka topic
- Uses:
  - `StringSerializer` for key
  - `JacksonJsonSerializer` for value

### Consumer

The consumer application:

- Runs on port `8082`
- Listens to Kafka topic 
- Consumes published messages
- Exposes an endpoint to fetch the last consumed message
- Uses:
  - `StringDeserializer` for key
  - `JacksonJsonDeserializer` for value

---


## Course Model

The message payload used in this project is:

```java
public class Course {
    private String courseId;
    private String title;
    private String trainer;
    private double price;
}
