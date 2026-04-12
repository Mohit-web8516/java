

import java.util.*;

// Custom Exception for invalid transactions
class InvalidTransactionException extends Exception {
    public InvalidTransactionException(String message) {
        super(message);
    }
}

// Abstract class for Transactions
abstract class Transaction {
    Double amount; // Wrapper class used instead of primitive double
    String category;

    Transaction(Double amount, String category) {
        this.amount = amount;
        this.category = category;
    }

    public Double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    // Abstract method to display transaction details
    public abstract void display();
}

// Income Transaction
class Income extends Transaction {
    Income(Double amount, String category) {
        super(amount, category);
    }

    @Override
    public void display() {
        System.out.println("Income: " + amount + " | Category: " + category);
    }
}

// Expense Transaction
class Expense extends Transaction {
    Expense(Double amount, String category) {
        super(amount, category);
    }

    @Override
    public void display() {
        System.out.println("Expense: " + amount + " | Category: " + category);
    }
}

// Transaction Manager using Collections
class TransactionManager {
    private List<Transaction> transactions = new ArrayList<>();

    // Add transaction
    public void addTransaction(Transaction t) throws InvalidTransactionException {
        if (t.getAmount() <= 0) {
            throw new InvalidTransactionException("Invalid amount! Must be greater than zero.");
        }
        if (transactions.contains(t)) {
            throw new InvalidTransactionException("Duplicate transaction not allowed!");
        }
        transactions.add(t);
        System.out.println("Transaction added successfully.");
    }

    // View all transactions
    public void viewTransactions() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions found.");
        } else {
            for (Transaction t : transactions) {
                t.display();
            }
        }
    }

    // Delete transaction by index
    public void deleteTransaction(int index) throws InvalidTransactionException {
        if (index < 0 || index >= transactions.size()) {
            throw new InvalidTransactionException("Invalid index! Transaction not found.");
        }
        transactions.remove(index);
        System.out.println("Transaction deleted successfully.");
    }

    // Calculate total balance
    public void calculateBalance() {
        double balance = 0;
        for (Transaction t : transactions) {
            if (t instanceof Income) {
                balance += t.getAmount();
            } else if (t instanceof Expense) {
                balance -= t.getAmount();
            }
        }
        System.out.println("Total Balance: " + balance);
    }

    // Filter transactions by category
    public void filterByCategory(String category) {
        boolean found = false;
        for (Transaction t : transactions) {
            if (t.getCategory().equalsIgnoreCase(category)) {
                t.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No transactions found for category: " + category);
        }
    }
}

// Main Class with User Interface
public class FintechApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TransactionManager manager = new TransactionManager();

        while (true) {
            System.out.println("\n--- Fintech Transaction Management ---");
            System.out.println("1. Add Income");
            System.out.println("2. Add Expense");
            System.out.println("3. View Transactions");
            System.out.println("4. Delete Transaction");
            System.out.println("5. Calculate Balance");
            System.out.println("6. Filter by Category");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter income amount: ");
                        Double incomeAmt = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Enter category: ");
                        String incomeCat = sc.nextLine();
                        manager.addTransaction(new Income(incomeAmt, incomeCat));
                        break;

                    case 2:
                        System.out.print("Enter expense amount: ");
                        Double expenseAmt = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Enter category: ");
                        String expenseCat = sc.nextLine();
                        manager.addTransaction(new Expense(expenseAmt, expenseCat));
                        break;

                    case 3:
                        manager.viewTransactions();
                        break;

                    case 4:
                        System.out.print("Enter transaction index to delete: ");
                        int index = sc.nextInt();
                        manager.deleteTransaction(index);
                        break;

                    case 5:
                        manager.calculateBalance();
                        break;

                    case 6:
                        System.out.print("Enter category to filter: ");
                        String cat = sc.nextLine();
                        manager.filterByCategory(cat);
                        break;

                    case 7:
                        System.out.println("Exiting... Thank you!");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice! Please try again.");
                }
            } catch (InvalidTransactionException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage());
            }
        }
    }
}
