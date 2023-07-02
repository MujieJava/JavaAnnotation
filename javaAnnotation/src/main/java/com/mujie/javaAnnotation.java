package com.mujie;

@SuppressWarnings("all")
public class javaAnnotation {

    @Deprecated
    public void testDeprecated() {
        System.out.println("方法过时");
    }

    @Override
    public String toString() {
        return super.toString();
    }


    public static void main(String[] args) {
        new javaAnnotation().testDeprecated();
    }
}
