package com.company;

public class BankAccount {
    private int acccountNumber;
    private double balance = 0d;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){}

    public BankAccount(int acccountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.acccountNumber = acccountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAcccountNumber() {
        return acccountNumber;
    }

    public void setAcccountNumber(int acccountNumber) {
        this.acccountNumber = acccountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
    }

    public void withdraw(double withdrawalAmount) {
        if (this.balance - withdrawalAmount >= 0 ) {
            this.balance -= withdrawalAmount;
        } else {
            System.out.println("Insufficient funds. Cannot withdraw.");
        }
    }
}
