package com.mujie.reflection.bean;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Aimetoi
 * @date 2021/9/1 18:29
 * version: 1.0
 */

public class TestClass {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchFieldException {
        Class c1 = Class.forName("com.mujie.reflection.bean.User");

        System.out.println(c1.getName());
        System.out.println(c1.getSimpleName());

        System.out.println("=====================");

        // 获得类的全部属性
        Field[] declaredFields = c1.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        System.out.println("==============");
        // 获得类的方法
        Method[] methods = c1.getMethods();
        for (Method method : methods) {
            System.out.println("正常的  " + method);
        }

        System.out.println("=================");

        Method[] declaredMethods = c1.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("getDeclaredMthods  " + declaredMethod);
        }


        System.out.println("================");
        // 获得指定方法
        Method getName = c1.getMethod("getName", null);
        Method setName = c1.getMethod("setName", String.class);
        System.out.println(getName);
        System.out.println(setName);

        System.out.println("================");
        Constructor[] constructors = c1.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

        System.out.println("============");

        Constructor[] declaredConstructors = c1.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }

        System.out.println("=============");

        Constructor constructor = c1.getConstructor(null);
        System.out.println(constructor);

        System.out.println("=============");

        //User user = (User) c1.getDeclaredConstructor(Integer.class, String.class, String.class).newInstance(1, "Mujie", "pwd");
        //System.out.println(user);

        User user = (User) c1.newInstance();

        Method setName1 = c1.getDeclaredMethod("setName", String.class);
        setName1.invoke(user, "Mujie");
        System.out.println(user.getName());

        System.out.println("================");

        User user2 = (User) c1.newInstance();

        Field field = c1.getDeclaredField("name");
        field.setAccessible(true);
        field.set(user2, "field");
        System.out.println(user2.getName());

        System.out.println("========================");
        Class tempClass = User.class;
        User user5 = (User) tempClass.newInstance();

    }
}
