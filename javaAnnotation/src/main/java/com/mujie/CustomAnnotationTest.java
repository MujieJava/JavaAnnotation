package com.mujie;

/**
 * @author Aimetoi
 * @date 2021/9/1 15:08
 * version: 1.0
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class CustomAnnotationTest {

    @CustomAnnotation(value = "Mujie")
    public void test() {

    }
}

@Target(value = {ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface CustomAnnotation {
    // 注解的参数：参数类型 + 参数名()
    String value() default "XXX";
}

