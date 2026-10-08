# Product Catalog

A simple Java application for managing a product catalog, built with Maven

## Features

- add and display products
- find a product by ID
- Delete product by ID
- Handle missing products with a custom exception

## Technologies

- Java
- Apache Maven

## Run the application

 from the project directly containing 'pom.xml', run:

```bash
mvn org.codehaus.mojo:exec-maven-plugin:3.5.0:java -Dexec.mainClass=com.budiluhur.catalog.App
