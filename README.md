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

## Create table
![image](https://user-images.githubusercontent.com/85931808/228388277-354de89d-c1ef-40b2-8dba-57b468dfeb39.png)

The Create table statement simulates the command CREATE TABLE from SQL. In order to create a table we first establish the table name and then the list of columns. For each of the columns we have to give an appropriate type to the values that will be entered. There are three possible types - integer, string and date since those are the three most commonly used types in SQL. Note that we cannot have any query statements if at least one table is not createed. This is done due to the scope of the project since we cannot connect to a real database and use the columns and table provided, the alternative was to allow the user to create his own tables and columns and build any query statements referenced to the tables created.

## Select Statement
![image](https://user-images.githubusercontent.com/85931808/228392653-d2680610-2e96-4895-98e8-0f8824046dc0.png)

The Select statement consists of two compulsary and two optional rules. The two compulsary statements that have to be made for a select statement to be made are for the tables and columns to be mentioned. We modified the order of statement execution with the user having to first mention the tables and then the columns that they would want to query some data from and for the option of "*" we've replaced it with a more human-friendly "all columns" statement. Similarly to SQL we wanted to allow the user to have flexibility and if they want they can include a "WHERE" statement and subsequently a "Group By" statement as shown from the above example. The where statement can have multiple conditions and the users have the choice to either use a comparison sign or write out the comparision they want with the language able to correctly translate it into SQL.

## Insert statement
![image](https://user-images.githubusercontent.com/85931808/228392699-3df115c0-e489-488f-a311-962a0e38b439.png)

The Insert statement is very similar to the SQL version with the main differences being that there is more explanation as to what the process of insertion than in SQL as seen in the example above. Note that for this introductory version of the DSML we have allowed for only one table to insert values at a time.

## Delete statement
![image](https://user-images.githubusercontent.com/85931808/228392787-fea8f913-833e-438c-aee8-fdeed6107fd0.png)

The Delete statement is one of the more confusing statements in SQL, so we deciede to make it more understandable by splitting it into three possible statements. The first one allows us to delete specific records from one specific table based on one or multiple conditions. The second one allows us to delete and entire table or in SQL terms to "DROP" it. Many employees who begin their journey with SQL find it difficult to differenciate between what the DELETE and the DROP statement are used for and by using our language that difficulty is clarified by the syntax. The final possible statemt allows us to empty a sepcific table which will not delte the able but erase all records inside it.

## Update statement
![image](https://user-images.githubusercontent.com/85931808/228392743-58c251ff-9847-4c0a-9bfb-283d63a7878d.png)

The Update statement allows the user to replicate the "UPDATE" statement in SQL but for one specific table. There is also the optional extension to the method with the "where" clause to filter out specific records from the table. If the Update statement is used without the optional where statement then it will assume that all records in table X have to update values for columns Y.

# Example Project
Here is an example project that can be implemented. This project can be seen in the TestNlToSql folder under src>.The outcome should be a fully generated TestAccountingSpeech.sql file under the src-gen folder that can be tested on an appropriate SQL editor. The tests for the project both for code generation and grammar/validation rules are provided under the folder /uk.ac.kcl.inf.languages.nlToSql.xpect.
![image](https://user-images.githubusercontent.com/85931808/228392835-358046c6-0bc1-437e-8cfb-a8f0df33f3a3.png)





