package day2;

import java.util.Scanner;

// 연습. num의 값을 키보드입력받아서....
// 힌트1. Scanner sc = new Scanner(System.in);
// 힌트2. sc.nextInt()

public class Ex211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("num: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("양수임.");
        } else if (num < 0) {
            System.out.println("음수임.");
        } else {
            System.out.println("힝");
        }

        /*
         * if (num % 2 == 0) { // 만약에 num이 짝수라면
         * System.out.println("짝수임!");
         * } else { // 그게 아니라면
         * System.out.println("홀수임!");
         * }
         */

    }// main
}
