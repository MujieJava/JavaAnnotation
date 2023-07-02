package com.mujie.exercise.xiancheng;

/**
 * @author Aimetoi
 * @date 2023/6/30 16:57
 * version: 1.0
 */

public class Thread02 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Thread thread = new Thread(dog);
        thread.start();
        System.out.println("主线程继续执行");
    }
}

class Dog implements Runnable {

    private int nums = 0;

    @Override
    public void run() {

        do {
            System.out.println("我们一起学猫叫" + (++nums));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if(nums == 50) {
                break;
            }

        } while (true);
    }
}