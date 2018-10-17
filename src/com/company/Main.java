package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Account> acctList = new ArrayList<>();
    static Scanner keyboard = new Scanner(System.in);
    static Account currentAccount;

    public static void main(String[] args) {
        acctList.add(new Account(123456, "Sherry Williams", 2500.00, 1111));
        acctList.add(new Account(122222, "Sana Samson", 3500.00, 2222));
        acctList.add(new Account(133333, "Mike Bird ", 2000.00, 3333));
        acctList.add(new Account(144444, "Billy Graham", 4000.00, 4444));

        int counter = 0;
        int acc;
        int pin;
        do {
            System.out.println("Enter your account number :");
            acc = keyboard.nextInt();
            System.out.println("Enter your PIN :");
            pin = keyboard.nextInt();
            counter++;
            if (!checkAccount(acc,pin)){
                System.out.println("Account/PIN is incorrect");
            }
            if (counter == 3){
                System.out.println("Your account has been locked out");
            }
        }while (!checkAccount(acc,pin) && counter<3) ;

        if (checkAccount(acc,pin)==true){
            ifStatement();
        }

    } // End main method


        public static boolean checkAccount(int acc, int pin){

            for (Account acctNew : acctList) {
                if (acctNew.getAcctNum() == acc && acctNew.getPinNum() == pin) {

                    currentAccount = acctNew;

                    return true;
                }


            }
            return false;
        }
        public static void ifStatement (){
            String response = "";
            String input = "";
            double balance = currentAccount.getBalance();
            double amount = 0;
            System.out.println("Would you like to make a deposit, withdrawal or check balance?");
            response = keyboard.next();
            if (response.equalsIgnoreCase("deposit")) {
                System.out.println("Enter the amount you would like to deposit");
                amount = keyboard.nextDouble();
                balance = currentAccount.getBalance() + amount;
            }
            if (response.equalsIgnoreCase("withdrawal")) {
                System.out.println("Enter amount you would like to withdrawal :");
                amount = keyboard.nextDouble();
                if (amount > currentAccount.getBalance()) {
                    System.out.println("The amount entered is not available");
                    keyboard.nextLine();
                } else if (amount <= currentAccount.getBalance()){
                    balance = currentAccount.getBalance()-amount;
                }
                if(response.equalsIgnoreCase("check balance")){
                    balance = currentAccount.getBalance();
                }
            }
            System.out.println("\n");
            System.out.println(currentAccount.getUserName());
            System.out.println(currentAccount.getAcctNum() + "\n");
            System.out.println("Beginning balance..................................." + currentAccount.getBalance());
            System.out.println("Deposit/Withdrawal Amount..........................." + amount);
            System.out.println("Ending Balance......................................" + balance);
        }

    }
