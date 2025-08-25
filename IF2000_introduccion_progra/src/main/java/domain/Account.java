/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author mayco
 */
public abstract class Account {
    
    private String accountNumber;
    private double balance;
    private Person client;

    
    public Account () {
    
}
    
    public Account(String accountNumber, double balance, Person client) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.client = client;
    }
    



    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Person getClient() {
        return client;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setClient(Person client) {
        this.client = client;
    }
    
    
    
    //ABSTRACTS METHODS FOR POLIMORFISM
    public abstract void deposit();
    public abstract void withdraw();
    public abstract double interestCalculation();
    
    @Override
            public String toString() {
                String result = "\nBANK ACCOUNT INFROMATION:" 
                        +  "-------------------------------------------------------------------"
                        +  "\nACCOUNT NUMBER: " + this.getAccountNumber()
                        + "\nBALANCE: " + this.getBalance()
                        + "\nACCOUNT OWNER: " + this.getClient().toString();
                        
                return result;
                
            }
}


















