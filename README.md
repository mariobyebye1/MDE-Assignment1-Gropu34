# Accounting Speech Natural Language to SQL DSML
This repository consists of an Xtext generated Domain Specific Modelling Language which is aimed at employees in financial institutions which are unfamiliar with SQL and do not have any experience in programming. The aim of the language is to provide an easy to use text based interface which will remove all the complexities and unknown jargon used in the SQL languge and instead abstract to a more human friendly syntax and semantics. Since this is an abstraction dedicated to a specific part of the whole SQL language, we have decided to focus our attention at the basic commands that a user who is new to SQL can learn.

# Grammar guidance

The language consists of 5 main possible statements that the user can write:
1. Create table
2. Select statement
3. Insert statement
4. Delete Statement
5. Update statement

Each of those statements has to end with a full-stop "." at the end to indicate that the statement has been declared and the program can wait for the next statement.
We will now focus on what are the available functionalities for each of those statements

# Create table
![image](https://user-images.githubusercontent.com/85931808/228388277-354de89d-c1ef-40b2-8dba-57b468dfeb39.png)

The Create table statement simulates the command CREATE TABLE from SQL. In order to create a table we first establish the table name and then the list of columns. For each of the columns we have to give an appropriate type to the values that will be entered. There are three possible types - integer, string and date since those are the three most commonly used types in SQL. Note that we cannot have any query statements if at least one table is not createed since for simplicity and due to the scope of the project we cannot connect to a real database and use the columns and table provided, the alternative was to allow the user to create his own tables and columns and build any query statements referenced to the tables created.

# Select Statement
<img width="417" alt="image" src="https://user-images.githubusercontent.com/85931808/228389411-0005012f-5d67-41ff-bb84-7508728ab34f.png">

The Select statement consists of two compulsary and two optional rules. The two compulsary statements that have to be made for a select statement to be made are for the tables to be mentioned and for the columns to be mentioned. We modified the order of statement execution with the user having to first mention the tables and then the columns that they would want to query some data from and for the option of "*" we've replaced with a more human-friendly "all columns" statement. Similarly to SQL we wanted to allow the user to have flexibility and if they want they can include a "WHERE" statement and subsequently a "Group By" statement as shown from the above example. The where statement can have multiple conditions and the users have the choice to either use a comparison sign or write out the comparision they want with the language able to correctly translate it into SQL.

# Insert statement
<img width="375" alt="image" src="https://user-images.githubusercontent.com/85931808/228390412-cc9ae2c4-fcf8-4e9d-a0da-ae5cb22471dc.png">

The Insert statement is very similar to the SQL version with the main differences being that there is more explanation as to what the process of insertion than in SQL as seen in the example above. Note that for this introductory version of the DSML we have allowed for only one table to insert values at a time.

# Delete statement
<img width="499" alt="image" src="https://user-images.githubusercontent.com/85931808/228390894-d27e243f-8392-4096-9635-7fff5f512aed.png">

The Delete statement is one of the more confusing statements in SQL, so we deciede to make it more understandable by splitting it into three possible statements. The first one allows us to delete specific records from one specific table based on one or multiple conditions. The second one allows us to delete and entire table or in SQL terms to "DROP" it. Many employees who begin their journey with SQL find it difficult to differenciate between what the DELETE and the DROP statement are used for and by using our language that difficulty is clarified by the syntax. The final possible statemt allows us to empty a sepcific table which will not delte the able but erase all records inside it.

# Update statement
<img width="454" alt="image" src="https://user-images.githubusercontent.com/85931808/228391949-a63b549e-e266-46b4-acff-a504ed41d5ea.png">

The Update statement allows the user to replicate the "UPDATE" statement in SQL but for one specific table. There is also the optional extension to the method with the "where" clause to filter out specific records from the table. If the Update statement is used without the optional where statement then it will assume that all records in table X have to update values for columns Y.

Here is an example project that can be implemented. The outcome should be a fully generated .sql file that can be tested on an appropriate SQL editor.
<img width="490" alt="image" src="https://user-images.githubusercontent.com/85931808/228392284-1f316fa5-5474-4a3c-a5dc-89bd8e42c6b6.png">




