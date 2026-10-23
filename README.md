# JDBC Insert Program

## Program Name
Java Database Connectivity (JDBC) - Insert Records Using PreparedStatement

## Aim
To write a Java program that connects to a MySQL database using JDBC and inserts student records into a table.

## Technologies Used
- Java
- JDBC
- MySQL
- MySQL Connector/J

## Files
- `JDBCInsertExample.java` — Java source code
- `database.sql` — Database and table setup
- `README.md` — Project documentation

## Concepts Used
- JDBC Connection
- Statement
- PreparedStatement
- CREATE TABLE IF NOT EXISTS
- executeUpdate()
- SQL INSERT operation
- Exception handling

## Database Details
- Database name: `mydatabase`
- Table name: `students`
- Columns: `id`, `name`, `course`

## Sample Records
| ID | Name | Course |
|---|---|---|
| 101 | Ravi | Java |
| 102 | Sita | Python |

## Requirements
- Java Development Kit (JDK)
- MySQL Server
- MySQL Connector/J JDBC driver

## How to Run
1. Install and start MySQL Server.
2. Configure the database username and password in the Java program.
3. Add the MySQL Connector/J driver to the Java project's classpath.
4. Compile and run `JDBCInsertExample.java`.
5. Verify the inserted records using `SELECT * FROM students;`.

## Expected Output
The program should confirm that two student records were inserted successfully.

## Result
The program demonstrates inserting records into a MySQL database using JDBC and PreparedStatement.
