package com.hhg.jerry.bean;

import java.util.List;

/**
 * Created by lining on 2018/9/4.
 */
public class User {
    private Long id;
    private String name;
    private int age;
    private String job;
    private List<String> languages;
    public User(){}

    public User(String name, int age, String job){
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    @Override
    public String toString(){
        return "User{" +
                "id=" + id +
                ", name=" + name +
                ", age=" + age +
                ", job=" + job +
                ", languages=" + languages +
                '}';
    }
}
