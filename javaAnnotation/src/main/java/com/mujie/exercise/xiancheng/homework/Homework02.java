package com.mujie.exercise.xiancheng.homework;

/**
 * @author Aimetoi
 * @date 2023/7/2 13:20
 * version: 1.0
 */

public class Homework02 {

    public static void main(String[] args) {

        Withdraw withdraw1 = new Withdraw();
        Withdraw withdraw2 = new Withdraw();
        withdraw1.start();
        withdraw2.start();
    }
}

class Withdraw extends Thread {

    private static int moneyNums = 10000;

    @Override
    public synchronized void run() {
        while(moneyNums >= 1000) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            moneyNums -= 1000;
            System.out.println(Thread.currentThread().getName() + "取钱1000，还剩" + moneyNums);
        }
    }
}
