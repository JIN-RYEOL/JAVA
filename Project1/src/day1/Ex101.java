package day1;
// 변수 : 값을 저장할 수 있는 그릇.

// 변수를 사용하기 위해서 : "변수의 선언"이 필요.
// 변수의 "초기화" : 선언된 변수에 처음으로 값을 담아주는 사건.
//					(그때의 값 : 초기값)

public class Ex101 {

	public static void main(String[] args) {

		int num; // num이라는 이름의 정수형 변수를 선언.
		num = 5; // = ------> "대입연산자" (오른쪽을 정리해서 왼쪽에 담는다)
					// 5라는 값을 변수 num에 담는다
		System.out.println("num:" + num); // 변수 num을 사용.

		// 연습1. 정수형 변수 a를 선언하고, 10이라는 값으로 초기화한 후,
		// "a : 10" 이렇게 출력해보세요.
		int a;
		a = 10;
		System.out.println("a : " + a);

		// 연습2. 실수형 변수 b를 선언하고(double b;), 3.14라는 값으로 초기화 후
		// "b : 3.14" 이렇게 출력해보세요
		double b;
		b = 3.14;
		System.out.println("b : " + b);

	} // main

}
