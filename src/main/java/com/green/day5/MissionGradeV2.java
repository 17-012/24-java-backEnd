package com.green.day5;

public class MissionGradeV2 {
    public static void main(String[] args) {
        int score = (int) (Math.random() * 131.0) - 10;
        int val1 = score / 10;
        int val2 = score % 10;
        if (score > 100 || score < 0) {
            System.out.println("점수가 잘못 입력되었습니다.");
        } else {
            String spell = switch (val1) {
                case 10, 9 -> "A";
                case 8 -> "B";
                case 7 -> "C";
                default -> "F";
            };
            String detail = switch (val2) {
                case 0, 1, 2 -> "-";
                case 3, 4, 5, 6 -> "0";
                case 7, 8, 9 -> "+";
                default -> "";
            };
            if (score == 100) {
                detail = "+";
            }
            System.out.println("당신의 점수는 " + score + "점 입니다.");
            System.out.println("당신의 학점은 " + (spell.equals("F") ? spell : spell + detail) + "입니다.");
        }
    }
}