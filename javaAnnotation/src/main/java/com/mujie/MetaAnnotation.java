package com.mujie;

import java.lang.annotation.*;

@MyAnnotation
public class MetaAnnotation {

    public static void main(String[] args) {

    }
}

/**
 * ElementType.TYPE 类
 * ElementType.METHOD 方法
 */
@Target(value = {ElementType.TYPE})

/**
 * RetentionPolicy.SOURCE  源码级别
 * RetentionPolicy.CLASS   类级别
 * RetentionPolicy.RUNTIME 运行时
 *
 */
@Retention(RetentionPolicy.SOURCE)

/**
 * 表示是否将我们的注解生成到 javadoc 中
 */
@Documented

/**
 * 子类可以继承父类的注解
 */
@Inherited
@interface MyAnnotation {

}

