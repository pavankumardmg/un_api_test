#                                               Unique Numbers API Test Automation Framework

# Introduction

    - Unique Numbers API Test Automation Framework provides structured and standard way of creating automated test scripts for API and database layers

    - This is a reusable automation framework that blends together with Rest Assured and Cucumber JVM (incorporating Gherkin and the BDD 'Given, When Then' testing construct)

    - The framework incorporates design principle of Behaviour-Driven Development (BDD) which is software development process that Cucumber was built to support

    - Which promotes writing acceptance tests by describing behaviour of application under test in simple english language from the perspective of its stakeholders

    - Having test written in Natural language helps the Project Team (Product Owners, Business Analysts, Development and QA team) to understand and track the requirements

## 1. Software Requirements

JAVA 11  - Programming language

Maven    - Build tool

TestNG   - TestNg Java testing framework

Azure    - Git repository hosted server

VCS      - Git client

Intellij Or Eclipse: - Integrated Development Environment

Note: By default IDEA(Intellij) the latest version comes with Java, Maven and GIT client.

## 2. Clone Project

https://github.com/ANMedia/un_api_test.git

## 3. Dependencies(libraries)

Cucumber-JVM          - BDD Framework

Cucumber Spring       - Cucumber with Spring, it will be handy to use Spring-configured components in BDD testing.

TestNG                - TestNg Java testing framework

Lombok                - Java library api

AssertJ               - Java library that provides a rich set of assertions

Rest Assured          - Assured is a Java library that provides a domain-specific language (DSL) for writing powerful, maintainable tests for RESTful APIs

Json Schema Validator - JSON Schema is a vocabulary that allows you to validate JSON documents

Spring JDBC           -Spring JdbcTemplate eliminates the mentioned problems of JDBC API. It provides you methods to write the queries directly, so it saves a lot of work and time.

Spring Framework      - The Spring Framework provides a comprehensive programming and configuration model for modern Java-based enterprise applications

Cucumber Extent Report- Graphical HTML Reports

Maven Cucumber Reports- Graphical HTML Reports

All the above dependencies are defined in pom.xml file

### 3.1 HTML Reports

Extent report is used in this project to generate the custom cucumber-jvm report using ExtentReports plugin. it will be generated in targe/reports
Maven Cucumber Reports are configured in the maven surefire plugin section in pom.xml file and it can be configurable.

### 3.3 Json Reports

Cucumber uses json report plugin to produce reports that contain information about what scenarios have passed or failed which is inbuilt.

### 3.4 Schema Files

Schema files are pre-defined templates which is stored in files/schema directory. This schema files can be validated with the response received

### 3.5 Feature files

Feature files are the stored in test/resources/features directory which can used to define and read the tests

## 4. API references

[Rest Assured](https://rest-assured.io/)

[Spring JDBC ](https://spring.io/projects/spring-data-jdbc)

[Cucumber-JVM](https://cucumber.io/docs/installation/java/)

[Cucumber Spring](https://github.com/cucumber/cucumber-jvm/tree/main/spring)

[TestNG](https://testng.org/doc/)

[Lombok](https://projectlombok.org/)

[AssertJ](https://github.com/assertj/assertj-core)

[Json Schema Validator](https://github.com/java-json-tools/json-schema-validator)

[Spring Framework](https://github.com/spring-projects/spring-framework)

[Cucumber Extent Report](https://www.extentreports.com/docs/versions/4/java/cucumber4.html)

[Maven Cucumber Reports](https://github.com/damianszczepanik/maven-cucumber-reporting)

## 5. Build and Test

cd to root ot automationFramework project directory

You can use the generic maven lifecycle commands for execution, Let say to execute tests to use below command

**mvn test**

