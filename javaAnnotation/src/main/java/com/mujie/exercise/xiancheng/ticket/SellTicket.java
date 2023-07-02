package com.mujie.exercise.xiancheng.ticket;

/**
 * @author Aimetoi
 * @date 2023/6/30 18:57
 * version: 1.0
 */

public class SellTicket {

    public static void main(String[] args) {
        SellTicket1 sellTicket1 = new SellTicket1();
        SellTicket1 sellTicket2 = new SellTicket1();
        SellTicket1 sellTicket3 = new SellTicket1();

        sellTicket1.start();
        sellTicket2.start();
        sellTicket3.start();

//        SellTicket2 sellTicket2 = new SellTicket2();
//        Thread thread1 = new Thread(sellTicket2);
//        Thread thread2 = new Thread(sellTicket2);
//        Thread thread3 = new Thread(sellTicket2);
//
//        thread1.start();
//        thread2.start();
//        thread3.start();
    }
}

class SellTicket1 extends Thread {

    private static int ticketNum = 4700;

    @Override
    public synchronized void run() {
        for(; ticketNum > 0;) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + "正在售票，还剩" + (--ticketNum));
        }
        System.out.println("售票结束");
    }
}


class SellTicket2 implements Runnable {

    private int ticketNum = 13700;

    @Override
    public synchronized void run() {
        for(; ticketNum > 0;) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + "正在售票，还剩" + (--ticketNum));
        }
        System.out.println("售票结束");
    }
}
