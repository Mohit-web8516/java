#💳 Fintech Transaction Management System – Java User Story Assessment (Day 3)
🔹 Introduction
This project is a Java console application designed for a Fintech company to manage financial transactions. It is built around user stories and demonstrates advanced Java concepts such as Collections, Wrapper Classes, Custom Exception Handling, and Abstraction.

The application allows users to add, view, delete, categorize, filter, and calculate balances for transactions, while ensuring error handling and scalability.
========================================================================================================
========================================================================================================


🔹 Features Implemented
Add Transactions → Users can add Income or Expense transactions.

View Transactions → Displays all transactions stored in the system.

Delete Transactions → Removes a transaction by index.

Collections → Uses ArrayList to store transactions dynamically.

Wrapper Classes → Uses Double instead of primitive double for amounts.

Custom Exceptions → Handles invalid amounts, duplicates, and invalid indexes.

Abstraction → Abstract class Transaction defines common behavior; Income and Expense extend it.

Balance Calculation → Computes total balance based on all transactions.

Categorization & Filtering → Transactions can be categorized (Food, Bills, Salary, etc.) and filtered.

Scalability → Designed for future enhancements like currency conversion APIs.
========================================================================================================
========================================================================================================

🔹 How to Execute
Save the code in a file named FintechApp.java.

Open terminal/command prompt and navigate to the file location.

Compile the program:

bash
javac FintechApp.java
Run the program:

bash
java FintechApp
You will see a menu-driven interface with options:

Code
--- Fintech Transaction Management ---
1. Add Income
2. Add Expense
3. View Transactions
4. Delete Transaction
5. Calculate Balance
6. Filter by Category
7. Exit
🔹 Example Execution & Output
Adding Income
Code
Enter choice: 1
Enter income amount: 5000
Enter category: Salary
Transaction added successfully.
Adding Expense
Code
Enter choice: 2
Enter expense amount: 1200
Enter category: Food
Transaction added successfully.
Viewing Transactions
Code
Income: 5000.0 | Category: Salary
Expense: 1200.0 | Category: Food
Calculating Balance
Code
Total Balance: 3800.0
Filtering by Category
Code
Enter category to filter: Food
Expense: 1200.0 | Category: Food
Deleting a Transaction
Code
Enter transaction index to delete: 0
Transaction deleted successfully.
========================================================================================================

🔹 Error Handling Demonstrated
Invalid Amount → Adding a transaction with 0 or negative value throws InvalidTransactionException.

Duplicate Transaction → Prevents adding the same transaction twice.

Invalid Index → Deleting with an invalid index shows error message.
========================================================================================================

🔹 Importance of This Project
Demonstrates real-world fintech problem solving using Java.

Covers OOP pillars: Abstraction, Encapsulation, Polymorphism.

Uses Collections, Wrapper Classes, and Custom Exceptions effectively.

Provides a scalable design for future enhancements.

✨ In short: