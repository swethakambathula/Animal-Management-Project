# Animal-Management-Project

For this project to run we need  : 
1. A project zip file "JavaApplication1".
2. MySQL database for the project's data "animal_management_system.sql".
3. Java-to-MySQL database connector "mysql-connector-java-5.1.37-bin.jar".

We need to install Java Development Kit (JDK) preferably JDK-17 and Apache Netbeans IDE preferably version 12.5.
When done with the installation open Apache Netbeans IDE. 

Click on 'File' on the menu bar and navigate to 'Import Project' and choose 'From Zip...' navigate to the location of the attached zip file. Proceed to import.
Collapse the project name and source package to view the complete system. The project file was designed using 'Java with Maven'.

Install MySQL Database
======================
Download and install XAMPP
Open XAMPP control panel and Start MySQL and Apache
Open browser and enter localhost in the web address
Click on phpMyAdmin
Create a database, name it "animal_management_system"
Open the database, proceed to Import tab
Navigate to the location of the database "animal_management_system.sql", pick it then click go.
Our database would be ready.
Here we are assuming that we will not setup a root password and that you won't tamper with port 3306 for MySQL engine


Adding MySQL database Connector
================================
Add "mysql-connector-java-5.1.37-bin.jar" Before running the project
Open the Apache NetBeans and right click on the project in which you have to add the connector. In the option pane, click on Properties.
In properties, go to Libraries and click on the plus ‘+’ tab of the Classpath and choose Add JAR/Folder.
Browse the to the location of JAR file present in that folder you unzipped "mysql-connector-java-5.1.37-bin.jar"
You will note that the MySQL connector is shown in the Libraries package of our project.
Congratulations, MySQL connector has been successfully installed for our project.
