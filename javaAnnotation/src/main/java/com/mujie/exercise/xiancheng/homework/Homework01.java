package com.mujie.exercise.xiancheng.homework;

import java.util.Random;

/**
 * @author Aimetoi
 * @date 2023/7/2 13:07
 * version: 1.0
 */

public class Homework01 {

    public static void main(String[] args) {

    }
}

class A extends Thread {

    private boolean loop = true;

    @Override
    public void run() {
        while(loop) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("A线程" + Thread.currentThread().getName() + " " + ((Math.random() * 100) + 1));
        }
    }
}

class B extends Thread {

    @Override
    public void run() {

    }
}