package com.company;
import java.io.*;

/**
 * Created by dpennebacker on 2/13/17.
 */
public class bankAccount implements Comparable {
    public FileWriter fw = new FileWriter("log.txt");
    public PrintWriter output = new PrintWriter(fw);

    public bankAccount(String nm, double amt)throws IOException {

        name = nm;
        balance = amt;

        output.print("Account: " + name + " Balance: " + balance + "\n");

        output.close();
        fw.close();
    }

    public int compareTo(Object otherObject) {
        bankAccount otherAccount = (bankAccount) otherObject;
        int retValue;
        if (balance < otherAccount.balance) {
            retValue = -1;
        } else {
            if (balance > otherAccount.balance) {
                retValue = 1;
            } else {
                retValue = 0;
            }
        }
        return retValue;
    }

    public void deposit(double dp) throws IOException{

        balance = balance + dp;

    }

    public void withdraw(double wd)throws IOException {
        balance = balance - wd;
    }

    public String name;
    public double balance;

}
