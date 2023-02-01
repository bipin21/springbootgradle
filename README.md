# springbootgradle
### yml file link
[application.yml](./src/main/resources/application.yml)

### DB Configuration
```spring:
  datasource:
    url: jdbc:postgresql://127.0.0.1:5432/${databaseName}?useSSL=false
    hikari:
      username: ${DB_USER}
      password: ${DB_PASS}
      connection-test-query: select 1
      driver-class-name: org.postgresql.Driver
  jpa:
    hibernate:
      ddl-auto: create
    properties:
      hibernate:
        dialect: org.hibernate.dialect.PostgreSQLDialect
        show-sql: true
```

### JPA, Hibernate and Postgres dependencies
``` 
    implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
    implementation group: 'com.vladmihalcea', name: 'hibernate-types-52', version: '2.21.1'
	implementation group: 'org.postgresql', name: 'postgresql', version: '42.3.4'
```