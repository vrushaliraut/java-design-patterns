package com.design.patterns.structural.proxy.pattern.completed;

public class RealWallet implements Wallet {
    double balance;

    public RealWallet(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. Current balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn. Current balance: " + balance);
        } else {
            System.out.println("Insufficient funds. Current balance: " + balance);
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
