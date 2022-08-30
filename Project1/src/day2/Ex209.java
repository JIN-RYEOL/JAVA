package day2;

public class Ex209 {
    public static void main(String[] args) {
        int num = 5;

        ++num;
        System.out.println(num); // 6
        ++num;
        System.out.println(num); // 7
        System.out.println(num++); // 7
        System.out.println(num); // 8
        System.out.println(++num); // 9
        System.out.println(num); // 9

        num = 5;
        int num2 = num--;
        System.out.println(num); // 4
        System.out.println(--num2); // 4

    }
}
