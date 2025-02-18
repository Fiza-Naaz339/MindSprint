package com.mindsprint.project1.inheritance;

// Parent class
class Account {
    private String accountNumber;
    private String accountHolderName;
    protected double balance;

    public Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdraw amount or insufficient balance");
        }
    }

    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

// Child class 1: SavingAccount
class SavingAccount extends Account {
    private double interestRate;

    public SavingAccount(String accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = balance * interestRate / 100;
        deposit(interest);
        System.out.println("Interest added: " + interest);
    }
}

// Child class 2: CurrentAccount
class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String accountHolderName, double balance, double overdraftLimit) {
        super(accountNumber, accountHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdraw amount or exceeds overdraft limit");
        }
    }
}

// Example usage
public class Banking {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount("SA123", "Alice", 1000.0, 5.0);
        savingAccount.displayInfo();
        savingAccount.addInterest();
        savingAccount.displayInfo();

        CurrentAccount currentAccount = new CurrentAccount("CA456", "Bob", 500.0, 200.0);
        currentAccount.displayInfo();
        currentAccount.withdraw(600.0);
        currentAccount.displayInfo();
    }
}

