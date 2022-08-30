package day2;

// (비교연산자) > < >= <= == != ------> 연산의 결과, true 또는 false
public class Ex206 {
    public static void main(String[] args) {
        System.out.println(3 + 3); // 6
        System.out.println(3 == 3); // true
        System.out.println(3 > 4); // false
        System.out.println(3 != 4); // true
        System.out.println(3 != 3); // false

        // 연습.
        // a=3, b=6, c=9 일 때 (---> 각각의 변수 선언 후 초기화)
        // a+b가 c와 같은지? 를 출력.(true / false)
        int a = 3, b = 6, c = 9;
        System.out.println(a + b == c);
    }
}
