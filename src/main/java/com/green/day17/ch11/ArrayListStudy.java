package com.green.day17.ch11;

import java.util.ArrayList;

public class ArrayListStudy {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add("에이");



        if (list.get(0) instanceof Integer) {
            int r = (int) list.get(0);
            System.out.println(r);
        }
        if (list.get(3) instanceof String) {
            System.out.println((String)list.get(3));
        }


    }
}
