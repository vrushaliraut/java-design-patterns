package com.design.patterns.structural.proxy.pattern.completed;

public class WalletProxy implements Wallet {

    private RealWallet realWallet;
    private boolean authenticated;

    public WalletProxy(double initialBalance) {
        realWallet = new RealWallet(initialBalance); // Create a real wallet with an initial balance
    }

    // Simulate authentication mechanism
    public void authenticate(String username, String password) {
        if ("user".equals(username) && "password".equals(password)) {
            authenticated = true;
            System.out.println("Authentication successful. Access granted.");
        } else {
            authenticated = false;
            System.out.println("Authentication failed. Access denied.");
        }
    }

    @Override
    public void deposit(double amount) {
        if (authenticated) {
            realWallet.deposit(amount);
        } else {
            System.out.println("Unauthorized access. Cannot deposit funds.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (authenticated) {
            realWallet.withdraw(amount);
        } else {
            System.out.println("Unauthorized access. Cannot deposit funds.");
        }
    }

    @Override
    public double getBalance() {
        if (authenticated) {
            return realWallet.getBalance();
        } else {
            return 0;
        }
    }
}
