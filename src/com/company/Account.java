package com.company;

public class Account {

    private int acctNum;
    private String userName;
    private double balance;
    private int pinNum;

    public Account() {
    }

    public Account(int acctNum, String userName, double balance, int pinNum) {
        this.acctNum = acctNum;
        this.userName = userName;
        this.balance = balance;
        this.pinNum = pinNum;
    }

    public int getAcctNum() {
        return acctNum;
    }

    public void setAcctNum(int acctNum) {
        this.acctNum = acctNum;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getPinNum() {
        return pinNum;
    }

    public void setPinNum(int pinNum) {
        this.pinNum = pinNum;
    }
}
