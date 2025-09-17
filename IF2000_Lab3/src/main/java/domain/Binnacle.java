/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author mayco
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Binnacle {
    private static int counter = 0; 
    
    private int eventId;
    private String event; 
    private LocalDateTime dateTime;
    private Account account; 
    
    public Binnacle(String event, Account account) {
        this.eventId = ++counter; 
        this.event = event;
        this.dateTime = LocalDateTime.now();
        this.account = account;
    }

    public int getEventId() {
        return eventId;
    }

    public String getEvent() {
        return event;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public Account getAccount() {
        return account;
    }

    
    

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return "Log Entry {" +
                "\n IdEvent: " + getEventId() +
                "\n Type of event: "+ getEvent() +
                "\n Date of saving: "  + dateTime.format(formatter) +
                 "\n Account: " + account.getAccountNumber() +
                 "\n Balance: " + account.getBalance();
    }
    
}