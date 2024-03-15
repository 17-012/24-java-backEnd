package com.green;
public class Main {
    public static void main(String[] args) {
        int max = 6;
        System.out.println("오름 차순");
        for(int i=1; i<max; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("내림 차순");
        for(int i=1; i<max; i++) {
            for(int j=1; j<=max-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("우측 정렬 오름 차순");
        for(int i=1; i<max; i++) {
            for(int j=1; j<max-i;j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("우측 정렬 내림 차순");
        for(int i=1; i<max; i++) {
            for(int j=1; j<i;j++){
                System.out.print(" ");
            }
            for(int k=1; k<=max-i;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("다이아");
        for(int i=1; i<max; i++) {
            for(int j=1; j<max-i;j++){
                System.out.print(" ");
            }
            for(int k=1; k<=2*i-1;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<max; i++) {
            for(int j=1; j<i;j++){
                System.out.print(" ");
            }
            for(int k=1; k<=2*(max-i) -1;k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("역 다이아");
        for(int i=1; i<max; i++) {
            for(int j=1; j<=max-i;j++){
                System.out.print("*");
            }
            for(int k=1; k<=2*i-1;k++) {
                System.out.print(" ");
            }
            for(int j=1; j<=max-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<max; i++) {
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            for(int k=1; k<=2*(max-i) -1;k++) {
                System.out.print(" ");
            }

            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("bubble");
        int[] a = {8,7,5,9,4,1,3};

        for (int j : a) {
            System.out.print(j + " ");
        }
        System.out.println();
        bubble(a);
        for (int j : a) {
            System.out.print(j + " ");
        }
    }

    public static void bubble(int[] a) {
        bubble(a, a.length);
    }
    private static void  bubble(int[] a, int size){
        for(int i = 1; i < size; i++){
            for(int j=0; j<size -i; j++){
                if(a[j] > a[j+1]){
                    swap(a, j, j+1);
                }
            }
        }
    }
    private static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i]= a[j];
        a[j] = temp;
    }
}