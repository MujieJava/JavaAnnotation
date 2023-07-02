package com.mujie.exercise.xiancheng;

/**
 * @author Aimetoi
 * @date 2023/6/26 16:40
 * version: 1.0
 */

public class Thread01 {

    public static void main(String[] args) throws InterruptedException {
        Cat cat = new Cat();
        cat.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("主线程：" + i);
            Thread.sleep(1000);
        }
    }
}

class Cat extends Thread {

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
