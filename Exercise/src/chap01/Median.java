package chap01;

import java.util.Scanner;

// 3개의 정수값을 입력하고 중앙값을 구한 다음 출력한다.
public class Median {
    static int med3(int a, int b, int c) {
        if(a >= b) {
            if (b >= c) {
                return b;
            } else if (a <= c) {
                return a;
            } else {
                return c;
            }
        } else if (a > c) {
            return a;
        } else if (b > c) {
            return c;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        System.out.println("세 정수의 중앙값을 구합니다.");
        System.out.println("a 값 : ");
        a = sc.nextInt();
        System.out.println("b 값 : ");
        b = sc.nextInt();
        System.out.println("c 값 : ");
        c = sc.nextInt();

        System.out.println("중앙값은" + med3(a, b, c) + "입니다."  );
    }
}
