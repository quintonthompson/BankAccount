package com.thompson;

public class Main {

    public static void main(String[] args) {

        BankAccount dadsBankAcct;

        dadsBankAcct = new BankAccount("12345-678",1000.00);

        Thread dad = new Thread(){
            @Override
            public void run() {
                dadsBankAcct.deposit(300.00);
                dadsBankAcct.withdraw(50.00);
            }
        };
        Thread quinton = new Thread() {
            @Override
            public void run() {
                dadsBankAcct.deposit(203.75);
                dadsBankAcct.withdraw(100.00);
            }
        };

        dad.start();
        quinton.start();
        System.out.println("Balance after transaction " + dadsBankAcct.getBalance());



    }
}
