package com.mujie.reflection.bean;

/**
 * @author Aimetoi
 * @date 2021/9/1 15:51
 * version: 1.0
 */



public class User {

    private int id;
    private String name;
    private String pwd;

    public User() {
        System.out.println("User 调用了默认构造");
    }

    public User(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    @Deprecated
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

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
