package day2;

import java.util.Scanner;

public class Ex213 {
    public static void main(String[] args) {

        /*
         * Scanner sc = new Scanner(System.in);
         * System.out.print("입력:");
         * int n = sc.nextInt();
         * 
         * for (int i = 1; i <= n; i++) {
         * System.out.print(i + " ");
         * }
         * System.out.println(); // 줄바꿈
         */

        // 연습2. 5 6 7 8 9
        for (int i = 5; i <= 9; i++) { // (초기값; 조건식; 증감식)
            System.out.print(i + " ");
        }
        System.out.println(); // 줄바꿈

        // 연습3. 9 8 7 6 5
        for (int i = 9; i >= 5; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 연습4. 1 3 5 7 9 11
        for (int i = 1; i <= 11; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 연습5. -2 -4 -6 -8
        for (int i = -2; i >= -8; i -= 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
