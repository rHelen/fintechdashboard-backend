# FinSight Backend

Backend REST API do FinSight, usando Java 25 + Spring Boot 4.1.

## Stack
- Java 25 (LTS)
- Spring Boot 4.1
- Maven
- Spring Web
- Bean Validation
- Actuator
- JUnit

Esta primeira versão usa dados em memória de propósito. A próxima etapa é trocar o armazenamento por SQL Server + Spring Data JPA.

## Estrutura
```text
src/main/java/com/finsight/
├── FinSightApplication.java
├── config/CorsConfig.java
├── controller/
│   ├── DashboardController.java
│   └── TransactionController.java
├── dto/
│   ├── DashboardSummaryResponse.java
│   ├── MonthlyFinancialResponse.java
│   └── TransactionResponse.java
├── exception/
│   ├── GlobalExceptionHandler.java
│   └── ResourceNotFoundException.java
├── model/Transaction.java
└── service/
    ├── DashboardService.java
    └── TransactionService.java
```

## Pré-requisitos
- JDK 25
- Maven 3.6.3+

## Executar
```bash
mvn spring-boot:run
```

API: http://localhost:8080

Health: http://localhost:8080/actuator/health

## Endpoints
```http
GET /api/dashboard/summary
GET /api/dashboard/monthly
GET /api/transactions
GET /api/transactions/{id}
```

## Próximas etapas
SQL Server → JPA → CRUD → integração React → Spring Security/JWT → Docker.
