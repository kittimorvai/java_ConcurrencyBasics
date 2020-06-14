package mypackage;


import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static BankAccount account = new BankAccount("000-111", 1000);

    public static void main(String[] args) {

// 1) Using synchronization for the transaction
//=============================================================================================
//        Thread owner1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                synchronized (account) {
//                    account.deposit(300);
//                    account.withdraw(50);
//                }
//            }
//        });
//
//        Thread owner2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                synchronized (account) {
//                    account.deposit(203.75);
//                    account.withdraw(100);
//                }
//            }
//        });
//
//        owner1.start();
//        owner2.start();
//=============================================================================================






// Using reentrant lock for the transaction
//=============================================================================================
//        ReentrantLock lock = new ReentrantLock();
//
//        Thread owner1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                lock.lock();
//                try {
//                    account.deposit(300);
//                    account.withdraw(50);
//                } finally {
//                    lock.unlock();
//                }
//            }
//        });
//
//        Thread owner2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                lock.lock();
//                try {
//                    account.deposit(203.75);
//                    account.withdraw(100);
//                } finally {
//                    lock.unlock();
//                }
//            }
//        });
//=============================================================================================

    }
}
