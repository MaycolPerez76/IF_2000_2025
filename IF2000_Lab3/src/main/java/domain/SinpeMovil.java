/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author mayco
 */
public class SinpeMovil {
    
    
    
    
    
    public static boolean transfer(Bank bankName, String accountNumber, 
                               Bank toBank, String toAccountNumber, double amount) {
        
        
                Account fromAccount = bankName.getAccountByNumber(accountNumber);
                Account toAccount = toBank.getAccountByNumber(toAccountNumber);
         
        if (fromAccount.getBalance() < amount) {
            System.out.println("You do not have enought money yet");
            return false;
        }

        // Perform transfer
if (fromAccount.withdraw(amount)) {
    toAccount.deposit(amount);
    System.out.println("Transfer successful: " + amount + " from " 
                                + bankName.getBankName() + " -> " + toBank.getBankName());
            return true;
}

        return false;
    }
    
    
    
    
    
    
    
    
    
    
}
