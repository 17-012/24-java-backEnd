package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력해 주세요 : ");
        String input = scanner.nextLine();
        int pars = Integer.parseInt(input);
        System.out.printf(pars == 0 ? "입력하신 숫자는 0입니다."
                : "입력하신 숫자는 0이 아닙니다.\n입력하신 숫자는 %d 입니다.\n", pars);

        String result = switch (pars){
            case 0 -> "입력하신 숫자는 0입니다.";
            default -> String.format("입력하신 숫자는 0이 아닙니다." +
                    "\n입력하신 숫자는 %d 입니다.", pars);
        };
        System.out.println(result);

    }
}
