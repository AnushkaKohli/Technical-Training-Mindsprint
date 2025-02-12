package com.mindsprint.project1.Assessment;

import java.util.Scanner;

class Account {
    Scanner sc = new Scanner(System.in);
    private String accNo;
    private String accHolder;
    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit() {
        int amt;
        System.out.println("Enter the amount you want to deposit: ");
        amt = sc.nextInt();
        balance = balance + amt;
    }

    public void withdrawal() {
        int amt;
        System.out.println("Enter the amount you want to withdraw: ");
        amt = sc.nextInt();
        if (balance >= amt) {
            balance = balance - amt;
            System.out.println("Balance after withdrawal: " + balance);
        } else {
            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );
        }
    }
}

class SavingAcc extends Account {
    private double interestRate;

    public SavingAcc(double interestRate) {
        this.interestRate = interestRate;
    }


    public void addInterest() {
        int balance = getBalance();
        balance += balance * interestRate / 100;
        setBalance(balance);
        System.out.println("Balance after adding interest: " + balance);
    }
}

class CurrentAcc extends Account {
    private int overdraftLimit;

    public CurrentAcc(int overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdrawal() {
        int amt;
        System.out.println("Enter the amount you want to withdraw: ");
        amt = sc.nextInt();
        if (getBalance() + overdraftLimit >= amt) {
            setBalance(getBalance() - amt);
            System.out.println("Balance after withdrawal: " + getBalance());
        } else {
            System.out.println("Your balance plus overdraft limit is less than " + amt + "\tTransaction failed...!!");
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        SavingAcc sa = new SavingAcc(20);
        sa.addInterest();
        CurrentAcc ca = new CurrentAcc(10);
        ca.withdrawal();
    }
}