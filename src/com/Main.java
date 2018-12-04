package com;

import javax.security.auth.login.LoginContext;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {
    public static void main(String[] args) {


    }
}

class Book {
    String name;
    int buyTime;
    ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    Lock read = readWriteLock.readLock();
    Lock write = readWriteLock.writeLock();

    public void addBuy() {
        write.lock();
        buyTime++;
        write.unlock();
    }

    public void howManyBooksSold() {
        read.lock();
        System.out.println("Book were sold " + buyTime);
        sendReport(buyTime);
        read.unlock();
    }

    private void sendReport(int books) {
    }
}



































