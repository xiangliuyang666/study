package com.yd.demo;

import org.springframework.scheduling.annotation.Scheduled;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * @title: ScheduledTest
 * @Author yang
 * @Date: 2020/7/9 19:37
 * @Version 1.0
 */
public class ScheduledTest {
    public static void main(String[] args) {
        Person p = new Person("z", 1);
        Person p2 = new Person("v", 2);
        Person p3 = new Person("b", 3);
        List<Person> personList = new ArrayList<>();
        personList.add(p);
        personList.add(p2);
        personList.add(p3);
        Map<String, Integer> collect = personList.stream().collect(Collectors.toMap(Person::getName, Person::getAge));
        System.out.println(collect);
    }
}

class Person {
    String name;
    int age;


    public String toString() {
        return "Person:" + this.name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
}


