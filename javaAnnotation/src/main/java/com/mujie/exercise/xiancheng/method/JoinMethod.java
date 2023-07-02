package com.mujie.exercise.xiancheng.method;

/**
 * @author Aimetoi
 * @date 2023/7/1 14:08
 * version: 1.0
 */

public class JoinMethod {

    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.start();
//        t.join();
        for (int i = 1; i <= 20; i++) {
            System.out.println("主线程" + i);
            Thread.sleep(50);
            if (i == 5) {
                t.join();
//                Thread.yield();
            }
        }
    }
}

class T extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            try {
                Thread.sleep(50);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("join线程。。。");
        }
    }
}
