/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.if2000_lab3;

/**
 *
 * @author mayco
 */
import domain.Bank;
import domain.Binnacle;
import domain.Person;
import domain.SavingAccount;
import domain.SinpeMovil;

public class IF2000_Lab3 {
    public static void main(String[] args) {

      //CLIENT  
        Person client1 = 
        new Person("Edgardo", "Corrales", "1-2323-4545", 18, "45456789");
        Person client2 = 
        new Person("Juan", "Morales", "1-3433-4315", 12, "38492932");
     
        
           //ACCOUNT     
        SavingAccount account1 = 
        new SavingAccount("2025-02-12", 12, 5, "1000567801", 25000, client1);
        SavingAccount account2 = 
        new SavingAccount("2025-09-04", 1, 15, "1320560204", 65000, client2);
     
         //BANK       
    Bank bancoNacional = new Bank("BN");   
    Bank bancoCostaRica = new Bank("BCR");
    bancoNacional.addAccount(account1);
    bancoCostaRica.addAccount(account2);  
    
    
    

        //METHODS
        boolean success = SinpeMovil.transfer(bancoNacional, "1000567801", bancoCostaRica, "1320560204", 5000);
        account1.deposit(3000);
         
        //BINNACLE
        Binnacle bin = new Binnacle("withdraw", account1);
        System.out.println(bin.toString());
    
              
     
             account1.withdraw(16000);
        
        System.out.println(account1.toString());
     
     
    }
}
