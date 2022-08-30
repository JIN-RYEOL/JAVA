package day1;
// 문자열 데이터, 정수 데이터, 실수 데이터, 문자 데이터

// 문자열 : 문자들의 나열 ----> String (스트링) ---------> 따옴표(")를 사용
// 문자 : 딱 한 글자 ----> char(캐릭터) // '차' 라고 읽지마세요.
//                                       ---------> 홑따옴표(')를 사용
// 정수 : 소수점(.)이 없는 수 ex) 5 ------------> int
// 실수 : 소수점(.)이 있는 수 ex) 5.15, 5.0 ----> double

public class Ex102 {
    public static void main(String[] args) {
        int n = 5; // (표현 이해) "변수의 선언과 동시에 초기화"
        System.out.println("n : " + n);

        double n2 = 5.15;
        System.out.println("n2 : " + n2);

        String s = "저장할 문자열";
        System.out.println("s : " + s);

        char c = 'A';
        System.out.println("c : " + c);

        // 연습1. 5+7을 저장할 변수를 num1이라는 이름으로 선언하고
        // 5+7을 저장한 후, "num1 : 12"의 형식으로 출력해보세요
        int num1 = 5 + 7;
        System.out.println("num1 : " + num1);

        // 연습2. 5.15 + 5를 저장할 변수를 num2라는 이름으로 선언하고
        // 5.15 + 5를 저장한 후, "num2 : 10.15"의 형식으로 출력
        double num2 = 5.15 + 5;
        System.out.println("num2 : " + num2);

    }
}
