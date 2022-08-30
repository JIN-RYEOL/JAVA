package day2;

public class Ex210 {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(num % 2 == 0 ? "짝수" : "홀수");

        char ch = (num % 2 == 0 ? '짝' : '홀');
        System.out.println(ch + "수");
    }
}
