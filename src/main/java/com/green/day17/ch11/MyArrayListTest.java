package com.green.day17.ch11;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        System.out.println(list);

        int size = list.size();
        System.out.println("size : " + size);
        System.out.println(list.get(3));


    }
}

class MyArrayList {
    private int[] arr;

    public MyArrayList() {
        arr = new int[0];
    }

    public void remove(int index){
        int[] temp = new int[arr.length-1];
        for (int i = 0, idx = 0; i < arr.length; i++, idx++) {
            if(i == index){
                continue;
            }
            temp[idx] = arr[i];
        }
    }

    public int get(int index) {
        return arr[index];
    }

    public int size() {
        return arr.length;
    }

    @Override
    public String toString() {
//        String result = "[";
//        if (arr.length != 0) {
//            result += arr[0];
//            for (int i = 1; i < arr.length; i++) {
//                result += ", " + arr[i];
//            }
//        }
//        result += "]";
//
//        return result;

        if (arr.length == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(String.format("[%d", arr[0]));
        for (int i = 1; i < arr.length; i++) {
            sb.append(String.format(", %d", arr[i]));
        }
        sb.append("]");

        return sb.toString();
    }

    public void add(int add) {
        int[] temp = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        temp[arr.length] = add;
        arr = temp;
    }
}