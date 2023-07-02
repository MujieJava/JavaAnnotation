package com.mujie.exercise.xiancheng.method;

/**
 * @author Aimetoi
 * @date 2023/7/2 12:01
 * version: 1.0
 */

public class ThreadState_ {

    public static void main(String[] args) throws InterruptedException {
        Thread1 thread1 = new Thread1();
        System.out.println("thread1状态：" + thread1.getState());
        thread1.start();

//        thread1.join();

        while (Thread.State.TERMINATED != thread1.getState()) {
            System.out.println("循环中..thread1状态：" + thread1.getState());
        }

        System.out.println("循环结束..thread1状态：" + thread1.getState());
    }
}

class Thread1 extends Thread {

    @Override
    public void run() {

        for (int i = 0; i < 20; i++) {
            if (i == 5) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }

    }
}
