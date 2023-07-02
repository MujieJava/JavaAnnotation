package com.mujie.exercise.fanxin;

import java.util.ArrayList;

/**
 * @author Aimetoi
 * @date 2023/6/24 12:36
 * version: 1.0
 */

public class fanxin1 {


    public static void main(String[] args) {
        //使用传统的方法来解决
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Dog("旺财", 10));
        arrayList.add(new Dog("发财", 1));
        arrayList.add(new Dog("小黄", 5));
//假如我们的程序员，不小心，添加了一只猫
        arrayList.add(new Cat("招财猫", 8));
//遍历
        for (Object o : arrayList) {
//向下转型 Object ->Dog
            Dog dog = (Dog) o;
            System.out.println(dog.getName() + "-" + dog.getAge());
        }
    }
}
