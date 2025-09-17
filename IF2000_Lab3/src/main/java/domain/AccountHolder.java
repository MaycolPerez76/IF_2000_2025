/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author mayco
 */
public class AccountHolder extends Account {
   private String initialDate;
    private int months;
    private float interest;

    public AccountHolder(String initialDate, int months, float interest) {
        this.initialDate = initialDate;
        this.months = months;
        this.interest = interest;
    }

    public AccountHolder(String initialDate, int months, float interest, String accountNumber, double balance, Person client) {
        super(accountNumber, balance, client);
        this.initialDate = initialDate;
        this.months = months;
        this.interest = interest;
        
    }

    public String getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(String initialDate) {
        this.initialDate = initialDate;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }
    
@Override
public void deposit(double amount) {
    super.setBalance(this.getBalance() + amount);
}

@Override
public boolean withdraw(double amount) {
    if (amount <= this.getBalance()) {
        super.setBalance(this.getBalance() - amount);
        return true;
    } else {
        System.out.println("You dont have enough money");
    }
    return false;
}

    @Override
    public double interestCalculation() {
        double total = (super.getBalance() * this.getInterest()) % 12;
        return super.getBalance() + total; 
    } 

    @Override
    public String toString() {   
        String result = "\nAccount Type: CHECKING ACCOUNT"
                + "\n---------------------------------"
                + "\n Initial date of account: " + this.getInitialDate()
                + "\n Months of saving: " + this.getMonths()
                + "\n Interest: " + this.getInterest()
                + "\n Gained Interest: " + super.getBalance() * (this.getInterest() / 100.0) * this.getMonths()
                + "\n Balance after interest: " + this.getBalance() + super.getBalance() * (this.getInterest() / 100.0) * this.getMonths();
        return super.toString() + result; 
    } 

}