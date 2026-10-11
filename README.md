# Product Catalog

A simple Java application for managing a product catalog, built with Maven Jakarta Servlet using an embedded Apache Tomcat server.

## Features

- Display a list of products in a web browser
- show product IDs, names, and prices
- Initialize the catalog with sample product data
- Generata an HTML table to display product information

## Technologies

- Java
- Apache Maven
- Jakarta Servlet
- Apache Tomcat

## Run the application

 from the project directly containing pom.xml, run:

```bash
mvn exec:java -Dexec.mainClass="com.budiluhur.catalog.App"
```
Then open the following URL in your web browser:

http://localhost:8080/products
