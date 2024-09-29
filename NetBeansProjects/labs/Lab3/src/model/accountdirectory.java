/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author shrutisen
 */
public class accountdirectory {

    private ArrayList<account> accounts;

    public accountdirectory() {
        this.accounts = new ArrayList<account>();
    }

    public ArrayList<account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<account> accounts) {
        this.accounts = accounts;
    }

    public account addAccount() {
        account a = new account();
        accounts.add(a);
        return a;
    }

    public void deleteAccount(account account) {
        accounts.remove(account);
    }
    
    public account searchAccount(String accountNumber) {
    for (account a : accounts) {
        if (a.getAccountNumber().contains(accountNumber)) {
            return a; 
        }
    }
    return null; 
    
    }
}
