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
│   ├── AccountController.java
│   ├── BudgetController.java
│   ├── CategoryController.java
│   ├── DashboardController.java
│   ├── GoalController.java
│   ├── TransactionController.java
│   └── UserController.java
│
├── dto/
│   ├── account/
│   ├── budget/
│   ├── category/
│   ├── dashboard/
│   ├── goal/
│   ├── transaction/
│   └── user/
|
├── entity/
│   ├── Account.java
│   ├── Budget.java
│   ├── Category.java
│   ├── Goal.java
│   ├── Transaction.java
│   └── User.java
│
├── enums/
│   ├── AccountType.java
│   ├── TransactionStatus.java
│   └── TransactionType.java
│
├── repository/
│   ├── AccountRepository.java
│   ├── BudgetRepository.java
│   ├── CategoryRepository.java
│   ├── GoalRepository.java
│   ├── TransactionRepository.java
│   └── UserRepository.java
│
└── service/
    ├── AccountService.java
    ├── BudgetService.java
    ├── CategoryService.java
    ├── GoalService.java
    ├── TransactionService.java
    └── UserService.java
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
