## Spring MVC Film C.R.U.D. Project

### Week 9 Homework Project for Skill Distillery

### Overview

This application provides a user with full C.R.U.D access to make changes to a Mobile Legends (video game) database. The user is able to search for heroes, create new heroes to add to the database, update  heroes, or delete heroes.

### Technologies

Java 8, JPA, JUnit 5 Test Driven Development, Object Relational Mapping, Spring Tool Suite, Spring MVC, Gradle, Apache Tomcat 8.5, MySQL Workbench, AWS EC2, HTML, CSS, Boostrap, Git & Github, Eclipse, Atom.

### Lessons Learned

While working on front end, the bootstrap import overrides certain CSS  styling I implemented. In order to pinpoint where this was occurring, launching developer tools and inspecting each portion of the front end allowed me to visually see which lines of code were being overridden. That allowed me to place an "!important" where necessary and bypass the bootstrap overrides.

While Spring boot gives a error page that gives a decent description of errors, it is not more beneficial than reading the error directly from the console. Reading the error from the console gives a more descriptive statement of the error and is much more feasible to locate and fix the bug by reading the console thoroughly.

### Assignment given to us by Skill Distillery

#Spring MVC C.R.U.D.
It's time at last to put those web skills you've been learning to use!

#Overview
We are going to have you create a CRUD application, completely from scratch, in order to get a handle on what you've been doing this week. We aren't going to have to create a persisted backend for it (that will come later), the goal here is to get comfortable with building a web application with SpringMVC. We can use the DAO pattern we have seen over the past two weeks to mimic the functionality of a database.

#The Application
The goal is to have you implement C.R.U.D. (Create, Read, Update, Destroy), which is some of the most common behavior on the web (Facebook is basically nothing but CRUD for instance). It represents the states of persistence that almost every application has (further reading for those interested). To simulate how you would read data from and write data to a database, we are just going to use an array or map for persistence.

Your application should adhere to the MVC pattern. Benefits of the MVC pattern are similar to that of encapsulation. There is a separation of concerns between the individual elements that make up the model, view, and controller respectively. Changing code in one has no affect on the code in the others. Their interactions are discussed below.

#MVC Elements
The Model: Represents the data being used by the application.

The View: Is what is displayed in the browser. For our purposes this will be a JSP or HTML document. These documents take user input which will be used to manipulate the models data, as well as provide a user interface.

The Controller: The controller manages all of these interactions. It delegates data from the view to the model to make changes and provides the view with requested data.

Below are a list of project starting points you can choose from:

A media application (Music, Movies, Video Games).
A sports application.
A restaurant menu system.
An inventory management system.
Expectations
A finalized version of your project is due next Monday. Your app must be built using the Spring framework that we have discussed over the course of the week. When finished you also need to deploy the WAR to your AWS server and add a link to the project via your personal portfolio website.

#Grading

This is a graded project. You are expected to have your project completed by noon on Monday.

You will be given either a pass or fail based on whether your code works given all of the following test conditions:

Create, Read, Update, and Delete functionality work with one of your objects through a web gui.
The project must be launched to AWS
The project must be added to your github account with a README spelling out
Who did the project?
What was the project?
What technologies did you used?
What future feature sets you would like to add?
Any stumbling points you encountered?
Stretch goals
Have nested CRUD. That being an object that has an object inside of it that can be created, read, updated, and deleted.
If the project does not work with the above test conditions, you will be given a 0 for this week's project.

If you get a zero on the project, you can upgrade to a score of .5 if you turn in a working project by the start of class the following Monday morning AND notify an instructor that you wish to get partial credit.

To turn in a project, you must push it to GitHub. You must also deploy it to your AWS server (we will show you how to do that Monday morning). You must include a README.md that describes your program and how to access it on AWS.

Be prepared to discuss your project with the class in a concise 5 minute presentation.

We will be demoing an application Wednesday to give a clear idea of the expected functionality, as well as potential stretch goals you can achieve on your own. We will be using the restaurant menu system as a prompt, but feel free to choose a topic that interests you.
