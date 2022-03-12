package chap01;

import java.util.Scanner;

public class Min3Ex02 {

   /*
   연습문제 (p19)
   Q2. 세 값의 최솟값을 구하는 min3 메서드를 작성하세요.
    */

    static int min3 (int a, int b, int c) {

        int min3 = a;

        if (min3 > b) {
            min3 = b;
        }
        if (min3 > c) {
            min3 = c;
        }

        return min3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.println("세 정수의 최솟값을 구합니다.");
        System.out.println("a 값은 : ");
        a = sc.nextInt();
        System.out.println("b 값은 : ");
        b = sc.nextInt();
        System.out.println("c 값은 : ");
        c = sc.nextInt();

        int min = min3(a,b,c);
        System.out.println("최솟값은 " + min + "입니다." );
    }
}
