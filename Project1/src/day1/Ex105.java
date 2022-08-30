package day1;
// 변수에 값을 저장할 때, '표현범위' 내의 값만!

// byte -----> 정수?실수? 몇 바이트?
//             정수, 1바이트
// byte의 표현범위 : -128 부터 + 127까지 // 기억!
// int ------> "4바이트 정수"
// int의 표현범위 : -21억쯤 부터 + 21억쯤까지 // 기억(권장)

public class Ex105 {
    public static void main(String[] args) {
        byte b;
        b = -128;
        b--; // (나중에) 변수b의 값을 1 감소. // 의도 : -128 -> -129
        System.out.println(b); // 이해 : 절대로, b로는 -129를 표현할 수 없음!

        int num; // 4바이트 정수
        num = -2_100_000_000; // 실행될 때, 이 언더바(_)는 무시됨.
        System.out.println(num);
    }
}
