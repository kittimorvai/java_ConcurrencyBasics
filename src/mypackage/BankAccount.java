package mypackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private double initialBalance;
    private final String accountNumber;
    private Lock lock;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.initialBalance = initialBalance;
        //this.lock = new ReentrantLock();

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void printAccountNumber() {
        System.out.println(this.accountNumber);
    }


// Using synchronization in the Main
//=============================================================================================
//    public void deposit(double amount) {
//        initialBalance += amount;
//        System.out.println(amount + " was deposited on account " + accountNumber);
//    }

    //
//    public void withdraw(double amount) {
//        initialBalance -= amount;
//        System.out.println(amount + " was withdrew from account " + accountNumber);
//    }
// ============================================================================================





// Using reentrant lock
//=============================================================================================
//    public void withdraw(double amount) {
//        lock.lock();
//        try {
//            initialBalance -= amount;
//            System.out.println(amount + " was withdrew from account " + accountNumber);
//        } finally {
//            lock.unlock();
//        }
//    }
//
//    public void deposit(double amount) {
//        lock.lock();
//        try {
//            initialBalance += amount;
//            System.out.println(amount + " was deposited on account " + accountNumber);
//        } finally {
//            lock.unlock();
//        }
//
//    }
//=============================================================================================




// Using tryLock() for the transactions
//=============================================================================================
//    public void withdraw(double amount) throws InterruptedException {
//        if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
//            try {
//                initialBalance -= amount;
//                System.out.println(amount + " was withdrew from account " + accountNumber);
//            } finally {
//                lock.unlock();
//            }
//        } else {
//            System.out.println("Could not get the lock");
//        }
//    }
//
//    public void deposit(double amount) throws InterruptedException {
//        if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
//            try {
//                initialBalance += amount;
//                System.out.println(amount + " was deposited to account " + accountNumber);
//            } finally {
//                lock.unlock();
//            }
//        } else {
//            System.out.println("Could not get the lock.");
//        }
//    }
//=============================================================================================



}