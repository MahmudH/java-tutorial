package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(123, 0, "Tim", "tim@gmail.com", "079");
        account.deposit(100);
        account.withdraw(100);
        System.out.println("Balance is " + account.getBalance());

//
//        System.out.println("Acc number is " + account.getAcccountNumber());
    }
}
