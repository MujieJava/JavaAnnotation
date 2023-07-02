package com.mujie.reflection.bean;

import java.lang.annotation.Annotation;

/**
 * @author Aimetoi
 * @date 2021/9/1 15:52
 * version: 1.0
 */

public class ReflectionTest {

    public static void main(String[] args) throws ClassNotFoundException {
//        Class c1 = Class.forName("com.mujie.reflection.bean.User");
//        Class c2 = Class.forName("com.mujie.reflection.bean.User");
//        Class c3 = Class.forName("com.mujie.reflection.bean.User");
//        Class c4 = Class.forName("com.mujie.reflection.bean.User");
//
//        System.out.println(c1);
//
//        System.out.println(c1 == c2);
//        System.out.println(c2.hashCode());
//        System.out.println(c3.hashCode());
//        System.out.println(c4.hashCode());

        System.out.println("===========");

        Person person = new Student();
        System.out.println("这个人是：" + person.getName());

        // 方式一：通过创建对象获得
        Class c1 = person.getClass();
        System.out.println(c1.hashCode());

        // 方式二：forname 获得
        Class c2 = Class.forName("com.mujie.reflection.bean.Student");
        System.out.println(c2.hashCode());

        // 方式三：通过类名 .class 获得
        Class c3 = Student.class;
        System.out.println(c3.hashCode());

        // 父类类型
        Class c4 = Person.class;
        System.out.println(c4.hashCode());

        Class c5 = c1.getSuperclass();
        System.out.println(c5.hashCode());

        int[][] a = new int[10][10];
        int[] b = new int[10000];
        System.out.println(a.getClass().hashCode());
        System.out.println(b.getClass().hashCode());

        System.out.println("=============");

        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);

        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);

        ClassLoader classLoader = Class.forName("com.mujie.reflection.bean.ReflectionTest").getClassLoader();
        System.out.println(classLoader);

        System.out.println(System.getProperty("java.class.path"));


    }
}

class Person {
    String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Student extends Person {

    @Override
    public String getName() {
        return "Mujie学生";
    }
}
