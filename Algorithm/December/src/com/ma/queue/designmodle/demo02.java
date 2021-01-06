package com.ma.queue.designmodle;

import java.util.ArrayList;
import java.util.Iterator;

public class demo02 {
    public static void main(String[] args) {
        ArrayList<Person> array = new ArrayList<Person>();

        Person p1 = new Person("Tom1");
        Person p2 = new Person("Tom2");
        Person p3 = new Person("Tom3");
        Person p4 = new Person("Tom4");

        array.add(p1);
        array.add(p2);
        array.add(p3);
        array.add(p4);

        Iterator<Person> iterator = array.iterator();

        for (Person pp : array){
            System.out.println(pp.getName());
        }

        System.out.println("\r\n" + "-----利用Lambda表达式的foreach-----" + "\r\n");
        array.forEach(obj -> System.out.println(obj.getName()));


    }
}
