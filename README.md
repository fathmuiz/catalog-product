# Product Catalog

A simple Java application for displaying product and category catalogs, using Jakarta Servlet and an embedded Apache Tomcat server.

## Features

- Product catalog with a tabular view
- Category catalog with a list view
- Preloaded sample products and categories
- Dedicated endpoints: `/products` and `/categories`

## Technologies

- Java
- Apache Maven
- Jakarta Servlet
- Apache Tomcat 10

## Run the application

 from the project directory containing pom.xml, run:

```bash
mvn exec:java -Dexec.mainClass="com.budiluhur.catalog.App"
```

## Access the application

Once the application is running, open:

- [Product catalog](http://localhost:8080/products)
- [Category catalog](http://localhost:8080/categories)
