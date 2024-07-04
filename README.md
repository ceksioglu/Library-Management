# Library Management System

This project is a Library Management System using Java, Hibernate, and PostgreSQL. It includes entities for managing books, authors, categories, publishers, and book borrowing transactions.

## Technologies Used

- Java
- Hibernate
- JPA (Jakarta Persistence API)
- PostgreSQL
- Maven

## Project Structure

The project includes the following entities:

1. **Book**
2. **Author**
3. **Category**
4. **Publisher**
5. **BookBorrowing**

## Entity Relationships

- **One-to-Many**: 
  - An author can have multiple books.
  - A publisher can have multiple books.
  - A book can have multiple borrowing records.
  
- **Many-to-Many**: 
  - A book can belong to multiple categories.
  - A category can contain multiple books.
 
![db](https://github.com/ceksioglu/Library-Management/assets/64319097/502d003e-6822-4fe4-be7c-6dd6136a96b0)


## Database Configuration

Ensure your `persistence.xml` file is properly configured to connect to your PostgreSQL database. Example configuration:

```xml
<persistence xmlns="https://jakarta.ee/xml/ns/persistence"
             xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="https://jakarta.ee/xml/ns/persistence
            https://jakarta.ee/xml/ns/persistence/persistence_3_0.xsd"
             version="3.0">
    <persistence-unit name="library_management">
        <class>github.ceksioglu.Book</class>
        <class>github.ceksioglu.Author</class>
        <class>github.ceksioglu.Category</class>
        <class>github.ceksioglu.Publisher</class>
        <class>github.ceksioglu.BookBorrowing</class>
        <properties>
            <property name="jakarta.persistence.jdbc.url" value="jdbc:postgresql://localhost:5432/your_db_name"/>
            <property name="jakarta.persistence.jdbc.user" value="your_db_user"/>
            <property name="jakarta.persistence.jdbc.password" value="your_db_password"/>
            <property name="jakarta.persistence.jdbc.driver" value="org.postgresql.Driver"/>
            <property name="hibernate.dialect" value="org.hibernate.dialect.PostgreSQLDialect"/>
            <property name="hibernate.hbm2ddl.auto" value="update"/>
        </properties>
    </persistence-unit>
</persistence>
