public class EncapBank {
    // Private variables
    private int accountNumber;
    private double balance;

    // Setter methods
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Getter methods
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        // Create object of EncapBank
        EncapBank acc = new EncapBank();

        // Set values using setters
        acc.setAccountNumber(12345);
        acc.setBalance(25000.50);

        // Get values using getters
        System.out.println("Account Number : " + acc.getAccountNumber());
        System.out.println("Balance : " + acc.getBalance());
    }
}
