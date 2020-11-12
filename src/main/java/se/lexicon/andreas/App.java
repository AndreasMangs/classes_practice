package se.lexicon.andreas;

import se.lexicon.andreas.BankAccount.BankAccount;

/**
 Practice
 •Create a class called BankAccount
 •Create fields for account number, balance, customer name, email and phone number.
 •Create a constructor that assign values to all fields
 •Make getters and setters for all fields
 •Create methods to deposit and withdraw funds.
 •Do not allow a withdrawal to complete if the balance is insufficient.
 •Extra: Have a static counter that increment and assign the account number.
 */
public class App 
{
    public static void main( String[] args )
    {
        BankAccount olle = new BankAccount(0,"Olle Olson", "olle@epost.com", "012-3456");
        BankAccount sven = new BankAccount(0,"Sven Svenson", "sven@epost.com", "022-2222");
        BankAccount bengt = new BankAccount(0,"Bengt Bengtson", "bengt@epost.com", "033-3333");

        olle.deposit(20.0);
        System.out.println(olle.getCustomerName()+ " balance is " + olle.getBalance());
        sven.deposit(30.0);
        bengt.deposit(90.0);
        sven.withdraw(5);

        System.out.println(olle.getAccountNumber());
        System.out.println(sven.getAccountNumber());
        System.out.println(bengt.getAccountNumber());

        olle.withdraw(21.0);
    }
}
