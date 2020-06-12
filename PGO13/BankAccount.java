package PGO13;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class BankAccount{
    private String name;
    private String lastName;
    public int ID;
    public double balance;
    List<String> history = new ArrayList();


    public BankAccount(String name, String lastName, int ID) {
        this.name = name;
        this.lastName = lastName;
        this.ID = ID;
        this.balance = 0.0;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(int number) {
        this.balance += number;
        this.history.add("Deposit " + number);
    }

   public void getHistory() {
       System.out.println(this.history);
   }

    public void transfer(double number, BankAccount account) throws AccountOperationException {
        if (number > this.balance) {
            throw new AccountOperationException();
        }
        this.balance -= number;
        account.balance += number;
        this.history.add("Tranfer " + number + " to account "+ account.ID);
        account.history.add("Received " + number + " from account "+ this.ID );

    }

    public void makingPayment(double number) {
        this.balance -= number;
        this.history.add("Payment " + number);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
