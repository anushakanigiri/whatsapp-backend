# WhatsApp Backend Assignment

This is a Spring Boot-based backend for a simplified WhatsApp clone.

## 🚀 Features Implemented

- ✅ My Profile (view & update)
- ✅ Chatroom creation
- ✅ Messaging (text + attachment up to 10MB)
- ✅ Emoji Reactions (thumbup, love, crying, surprised)
- ✅ Swagger API documentation
- ✅ Pagination support for list endpoints

## 📂 Tech Stack

- Java 17 + Spring Boot
- Maven
- JPA (Hibernate)
- H2 (in-memory) or MySQL (configurable)
- Swagger (springdoc-openapi)
- Deployed using Docker on Render

## 🔗 Live Demo

**Swagger UI**:  
👉 [Click here to test the APIs]( http://localhost:8081/swagger-ui.html )

## 📁 API Documentation

Swagger is available in the deployed link and auto-generates all endpoints.

## 📦 Setup Instructions (Local)

```bash
git clone https://github.com/anushakanigiri/whatsapp-backend.git
cd whatsapp-backend
./mvnw spring-boot:run
