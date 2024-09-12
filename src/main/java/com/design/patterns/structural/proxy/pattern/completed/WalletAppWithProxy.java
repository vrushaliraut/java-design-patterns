package com.design.patterns.structural.proxy.pattern.completed;

public class WalletAppWithProxy {
    public static void main(String[] args) {
        WalletProxy proxyWallet = new WalletProxy(500); // Create a proxy with initial balance

        // Try to access without authentication
        proxyWallet.deposit(200);   // Should print unauthorized access message
        proxyWallet.withdraw(100);  // Should print unauthorized access message
        proxyWallet.getBalance();   // Should print unauthorized access message

        // Authenticate and then perform operations
        proxyWallet.authenticate("user", "password"); // Correct credentials
        proxyWallet.deposit(200);    // Should now allow deposit
        proxyWallet.withdraw(100);   // Should now allow withdraw
        System.out.println("Final Balance: " + proxyWallet.getBalance()); // Should show the correct balance
    }
}
