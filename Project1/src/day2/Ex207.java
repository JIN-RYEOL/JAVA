package day2;

import org.omg.Messaging.SyncScopeHelper;

public class Ex207 {
    public static void main(String[] args) {
        // int n = 5;
        // System.out.println(n > 3 && n > 6);
        // System.out.println(true && false);

        // && (AND연산자) : 둘 다 true여야만 true
        // true && true -----> (이 연산의 결과가) true
        int n = 4;
        System.out.println(n > 3 && n < 10); // true

        // 연습. "num이 짝수이면서 (num이) 0보다 크냐"
        System.out.println(n % 2 == 0 && n > 0); // true

        // || (OR연산자) : 둘 중 하나라도 true이면 true
        System.out.println(true || false); // true

        // 연습1. 해석.
        // S.C.E (Short-Circuit Evaluation)
        System.out.println(n > 10 || n % 2 == 0); // true
        System.out.println(n > 5 || n % 2 != 0); // false

        // 연습2. "num이 홀수이거나 5 이상이냐"
        System.out.println(n % 2 == 1 || n > 5); // false

        // 연습3. "num이 0보다 작거나 짝수냐?"
        System.out.println(n < 0 || n % 2 == 0); // true

        // 연습4. "num이 7의 배수냐?"
        System.out.println(n % 7 == 0); // false

        // a가 5 또는 6 또는 7이냐
        System.out.println();

        int a = 57;
        System.out.println("a의 일의 자리 숫자는 : " + a % 10);
    }
}
