# CS520 Assignment 5 Tomas Hornicek

# Requirements to Run the Project

In order to run this project, the following jar files need to be downloaded and integrated into the project: commons-lang-2.6.jar, commons-lang-2.6-sources.jar, commons-lang-2.6-javadoc.jar, opencsv-5.5.2.jar and mysql-connector-java-8.0.27.jar. All these jar files and the file paths, adjusted to my personal computer, can be found in the file ".classpath".

# Assignment 5

For this assignment I have initialized MySQL and connected it to my code using the JDBC driver from MySQL. The code for this assignment can be found in the file: "DatabaseHW.java". The class DatabaseHW creates a table in MySQL, populates the table using a file downlaoded from the indiegogo database. The class contains methods to search for keywords and search for keywords in date ranges, in the MySQL table. It then outputs the results to the console.
