package com.pluralsight;

import com.pluralsight.finance.*;

public class FinanceApplication {
    public static void main(String[] args) {
        /*BankAccount account1 = new BankAccount("Pam", "123", 12500);
        Valuable account2 = new BankAccount("Gary", "123", 1500);

        account1.deposit(100);
        account2.deposit(100)*/;

        Portfolio myPortfolio = new Portfolio("Test", "Nati");

        Valuable valuable = new BankAccount("Pam", "123", 12500);
        Valuable valuable1 = new CreditCard("Rose", "456", 5000);
        Valuable valuable2 = new Jewelry("Necklace", 2000, 24);
        Valuable valuable3 = new House("Mansion", 100000, 2004, 2000, 5);
        Valuable valuable4 = new Gold("Nuggets", 500, 10);

        myPortfolio.add(valuable);
        myPortfolio.add(valuable1);
        myPortfolio.add(valuable2);
        myPortfolio.add(valuable3);
        myPortfolio.add(valuable4);

        System.out.println(myPortfolio.getValue());
        System.out.println(myPortfolio.getMostValuable());
        System.out.println(myPortfolio.getLeastValuable());
    }
}
