package com.mujie.reflection.bean;

import java.lang.annotation.*;
import java.lang.reflect.Field;

/**
 * @author Aimetoi
 * @date 2021/9/2 18:45
 * version: 1.0
 */

public class TestAnnotation {

    public static void main(String[] args) throws NoSuchFieldException {
        Class<Stu> c1 = Stu.class;

        // 获得类的注解
        Annotation[] annotations = c1.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

        // 获得注解对应的方法
        Field name = c1.getDeclaredField("name");
        FieldMuJie annotation = name.getAnnotation(FieldMuJie.class);
        System.out.println(annotation.columnName());
    }
}

@TableMuJie("db_stu")
class Stu {

    @FieldMuJie(columnName = "db_id", type = "int", length = 10)
    private int id;

    @FieldMuJie(columnName = "db_name", type = "varchar", length = 10)
    private String name;

    @FieldMuJie(columnName = "db_age", type = "varchar", length = 10)
    private String age;

    public Stu() {
    }

    public Stu(int id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}

// 类名的注解
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface TableMuJie {
    String value();
}

// 属性的注解
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface FieldMuJie {
    String columnName();

    String type();

    int length();
}