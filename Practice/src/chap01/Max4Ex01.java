package chap01;

import java.util.Scanner;

public class Max4Ex01 {

   /*
   연습문제 (p19)
   Q1. 네 값의 최대값을 구하는 max4 메서드를 작성하시오
    */

    static int max4 (int a, int b, int c, int d) {

        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, d;
        System.out.println("네 정수의 최대값을 구합니다.");
        System.out.println("a의 값 : ");
        a = sc.nextInt();
        System.out.println("b의 값 : ");
        b = sc.nextInt();
        System.out.println("c의 값 : ");
        c = sc.nextInt();
        System.out.println("d의 값 : ");
        d = sc.nextInt();

        int max = max4(a, b, c, d);

        System.out.println("최대값은" + max + "입니다.");
    }
}
