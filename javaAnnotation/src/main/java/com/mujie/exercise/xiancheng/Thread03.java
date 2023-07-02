package com.mujie.exercise.xiancheng;

/**
 * @author Aimetoi
 * @date 2023/6/30 17:54
 * version: 1.0
 */

public class Thread03 {

    public static void main(String[] args) {
        T3 t3 = new T3();
        T4 t4 = new T4();
        Thread thread3 = new Thread(t3);
        Thread thread4 = new Thread(t4);
        thread3.start();
        thread4.start();
        System.out.println("主线程继续执行...");
    }
}

class T3 implements Runnable {

    private int nums = 0;

    @Override
    public void run() {
        do {
            System.out.println("我们一起学猫叫" + (++nums) + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if(nums == 20) {
                break;
            }

        } while (true);
    }
}

class T4 implements Runnable {

    private int nums = 0;

    @Override
    public void run() {
        do {
            System.out.println("我们一起学狗叫" + (++nums) + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if(nums == 20) {
                break;
            }

        } while (true);
    }
}
