# SmartCampus System
📖 Overview
The SmartCampus System is a simple Java console application designed to manage students, courses, and enrollments in a campus environment. It demonstrates key Java concepts such as Object-Oriented Programming (OOP), Collections, Exception Handling, and Multithreading in a menu-driven program.

This project is suitable for college-level Java training and showcases how to build a small but functional management system.

# 🎯 Features
Student Management

Add new students with ID, name, and email.

View all registered students.

Course Management

Add new courses with ID, name, and fee.

View all available courses.

Enrollment System

Enroll students into courses.

View all enrollments.

Enrollment requests are processed asynchronously using threads.

Error Handling

Custom exception (InvalidInputException) for invalid inputs.

Handles wrong input types gracefully.

Menu Driven

Interactive console menu for easy navigation.

# 🛠️ Technologies Used
Java Classes & Objects → Represent students, courses, and enrollments.

Constructors → Initialize objects with values.

Collections

HashMap → Store students and courses by ID.

ArrayList → Store enrollments.

Exception Handling

Custom exception for invalid inputs.

Input mismatch handling.

Multithreading

Background processing of enrollments using Thread.

# 📂 Project Structure
Code
SmartCampusSystem.java
├── Student class
├── Course class
├── Enrollment class
├── EnrollmentProcessor (Thread)
└── SmartCampusSystem (Main class with menu)
# ▶️ How to Run
Save the code in a file named SmartCampusSystem.java.

Open terminal/PowerShell in the folder containing the file.

Compile the program:

bash
javac SmartCampusSystem.java
Run the program:

bash
java SmartCampusSystem
🖥️ Sample Run
Code
--- SmartCampus Menu ---
1. Add Student
2. Add Course
3. Enroll Student
4. View Students
5. View Enrollments
6. Search Student by Name
7. Exit
Enter choice: 1
Enter Student ID: 101
Enter Name: Mohit
Enter Email: mohit@example.com
✔ Student added.

Enter choice: 2
Enter Course ID: 201
Enter Course Title: Java Basics
Enter Fee: 5000
✔ Course added.

Enter choice: 3
Enter Student ID: 101
Enter Course ID: 201
Enrollment submitted...
✔ Enrollment processed: Mohit enrolled in Java Basics

Enter choice: 6
Enter Student Name: Mohit
Found: ID: 101, Name: Mohit, Email: mohit@example.com

