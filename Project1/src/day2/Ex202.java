package day2;

// "byte -> short" : byte가 short 쪽으로 자동형변환 될 수 있음!
// "short -> int" : short가 int쪽으로 자동형변환 될 수 있음!
// Q. byte -> int ?
// long(8byte)이고 float(4byte이지만)

// int long float double
public class Ex202 {
    public static void main(String[] args) {
        byte b = 2;
        short s = b; // byte -> short 로 자동 형 변환 되었음!
        int i = s; // short -> int 로 자동 형 변환 되었음!
        long lo = i; // int -> long 으로 자동 형 변환 되었음!
        float f = lo; // long -> float 으로 자동 형 변환 되었음!
        double d = f; // float -> double 으로 자동 형 변환 되었음!

        System.out.println(d);

        // 아래는, 자동형변환이 안되는 방향
        // f = d; // ERR. (float -> double) 의 반대방향이므로.
        // lo = f; // ERR. (long -> float) 의 반대방향이므로.
    }
}
