package com.design.patterns.structural.proxy.pattern.starter;

public class WalletApp {
    public static void main(String[] args) {
        // Any user can access the wallet
        Wallet wallet = new Wallet(500); // Initial balance
        wallet.deposit(200); // Direct deposit without authentication
        wallet.withdraw(100); // Direct withdraw without authentication
        System.out.println("Final Balance: " + wallet.getBalance());
    }
}
