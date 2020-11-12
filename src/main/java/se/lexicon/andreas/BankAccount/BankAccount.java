package se.lexicon.andreas.BankAccount;

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

public class BankAccount {
    static int counter=0;

   private int accountNumber;
   private double balance;
   private String customerName;
   private String email;
   private String phoneNumber;

   // Constructor
   public BankAccount (double balance, String customerName, String email, String phoneNumber){
        this.accountNumber = ++counter;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
   }

   //Methods
   public void deposit(double amount){
       System.out.println(this.customerName + " old balance: " + this.balance);
       this.balance = this.balance + amount;
       System.out.println(this.customerName + " new balance is: " + this.balance);
   }

   public void withdraw(double amount){
       if (!(this.balance - amount < 0)){
           System.out.println(this.customerName +" old balance: " + this.balance);
           this.balance = this.balance -amount;
           System.out.println(this.customerName + " new balance: " + this.balance);
       } else {
           System.out.println("Too big withdrawal. Transaction failed for " + this.customerName + " account");
       }
   }

    //getters and setters
   public void setAccountNumber(int accountNumber){
       this.accountNumber=++counter;
   }

   public int getAccountNumber(){
       return this.accountNumber;
   }

   public void setBalance(double balance){
       this.balance = balance;
   }

   public double getBalance(){
       return this.balance;
   }

   public void setCustomerName(String customerName){
       this.customerName = customerName;
   }

   public String getCustomerName(){
       return this.customerName;
   }

   public void setEmail(String email){
       this.email = email;
   }

   public String getEmail(){
       return this.email;
   }

   public void setPhoneNumber(String phoneNumber){
       this.phoneNumber = phoneNumber;
   }

   public String getPhoneNumber(){
       return this.phoneNumber;
   }

}
