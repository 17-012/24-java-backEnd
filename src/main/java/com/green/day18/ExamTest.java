package com.green.day18;

public class ExamTest {
    public static void main(String[] args) {
        int rVal = Exam.getRandomValue(1, 101);
        int rVal2 = Exam.getRandomValue(1, 101);

//        Exam.printOddEven(rVal);
//
//        for (int i = 100; i < 104; i++) {
//            System.out.println(200 - i);
//        }
//
//        Exam.test(rVal, rVal2);
//        Exam.printNumToNum(2, 20);

//        int score = Exam.getRandomValue(-100, 200);
//        String grade = Exam.getGrade(score);
//        System.out.println(grade);

        int sum = Exam.getSumFromTo(8, 20);
        System.out.printf("Sum : %d\n", sum);
    }
}

class Exam {

    public static int getSumFromTo(int start, int end) {
        int sub = end * (end + 1) / 2;
        int sub2 = (start - 1) * (start) / 2;
        return (sub - sub2);
    }

    public static String getGrade(int score) {
        String result = "";
        if (score < 0 || score > 100) {
            return "값이 잘못되었습니다";
        }
        if (score == 100) {
            return "A+";
        }
        if (score < 70) {
            return "F";
        }
        result = switch (score / 10) {
            case 9 -> "A";
            case 8 -> "B";
            default -> "C";
        };
        result += switch (score % 10) {
            case 0, 1, 2 -> "-";
            case 3, 4, 5, 6 -> "0";
            default -> "+";
        };

        return result;
    }

    public static void printNumToNum(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }

    public static void test(int val1, int val2) {
        System.out.printf("val1 : %d\t val2 : %d\n", val1, val2);
        System.out.println(val1 % 2 == 0 ?
                val2 % 2 == 0 ? ("둘다 짝수 " + (val2 - val1)) : "짝 -> 홀 " + val1
                : val2 % 2 == 0 ? ("홀 -> 짝 " + (val2 - 5)) : "둘다 홀수 " + val2
        );
    }

    public static int getRandomValue(int n1, int n2) {
        int result = (int) (Math.random() * (n2 - n1)) + n1;
        return result;
    }

    public static void printOddEven(int input) {
        System.out.println(input % 2 == 0 ? input + "는(은) 짝수입니다." : input + "는(은) 홀수입니다.");
    }
}