package com.green.day18;

import java.util.Arrays;
import java.util.Scanner;

public class NumberBaseBallGameTest {
    public static void main(String[] args) {
        NumberBaseBallGame game = new NumberBaseBallGame(4);
        game.start();
    }
}

class NumberBaseBallGame {
    Scanner scanner = new Scanner(System.in);
    final int NUMBER_COUNT;
    private int[] numArr;
    int S;
    int B;
    int O;

    void initSol() {
        this.S = 0;
        this.B = 0;
        this.O = 0;
    }

    public void start() {

        while (S != NUMBER_COUNT) {
            initSol();
            System.out.printf("1~9까지 숫자로 %d자리를 적어주세요 (중복x) => \n", NUMBER_COUNT);
            int[] arr = input();
//            int input = scanner.nextInt();
//            int[] arr = new int[numArr.length];
//            for (int i = numArr.length - 1; i >= 0; i--, input /= 10) {
//                arr[i] = input % 10;
//            }
            for (int i = 0; i < numArr.length; i++) {
                isS(arr[i], i);
            }
            isO();
            System.out.printf("%d 스트라이크, %d 볼, %d 아웃!\n", S, B, O);
        }
        showArr();
        scanner.close();
    }

    public int[] input() {
        String str = scanner.nextLine();
        String[] answerStrArr = str.split(" ");
        int[] answerIntArr = new int[answerStrArr.length];
        for (int i = 0; i < answerStrArr.length; i++) {
            answerIntArr[i] = Integer.parseInt(answerStrArr[i]);
        }
        return answerIntArr;
    }


    public void isS(int input, int index) {
        if (input == numArr[index]) {
            this.S++;
        } else {
            isB(input);
        }
    }

    public void isB(int input) {
        for (int i = 0; i < numArr.length; i++) {
            if (input == numArr[i]) {
                this.B++;
                break;
            }
        }
    }

    public void isO() {
        this.O = NUMBER_COUNT - (this.S + this.B);
    }

    public void showArr() {
        System.out.println("정답 : " + Arrays.toString(numArr));
    }

    public NumberBaseBallGame(final int initNum) {
        if (initNum < 1 || initNum > 9) {
            NUMBER_COUNT = 3;
        } else {
            NUMBER_COUNT = initNum;
        }
        this.init();
    }

    private void init() {
        this.numArr = new int[NUMBER_COUNT];
        if (numArr.length == 0) {
            return;
        }
        int[] temp = new int[9];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = i + 1;
        }
        for (int i = 0; i < temp.length; i++) {
            int rand = (int) (Math.random() * temp.length);
            int k = temp[i];
            temp[i] = temp[rand];
            temp[rand] = k;
        }
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = temp[i];
        }
    }
}