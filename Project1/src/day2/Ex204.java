package day2;

// 대입 연산자
// 1) 언제? (오른쪽을 다 정리한 후에 실행됨)
// 2) 타입? 일치 ---> 불일치하는 경우에는 자동형변환을 고려해줌

public class Ex204 {
    public static void main(String[] args) {
        int num;
        num = 2 - 3;

        num += 3; // 2
        num -= 1; // 1
        num *= 7; // 7
        num /= 3; // 2
        num %= 5; // 2
        System.out.println(num); // 2
    }
}
