package chap01;

import java.util.Scanner;

public class Min4Ex03 {

   /*
   연습문제 (p19)
   Q3. 네 값의 최솟값을 구하는 min4 메서드를 작성하세요.
    */

    static int min4 (int a, int b, int c, int d) {

        int min4 = a;

        if (min4 > b) {
            min4 = b;
        }
        if (min4 > c) {
            min4 = c;
        }
        if (min4 > d) {
            min4 = d;
        }

        return min4;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, d;

        System.out.println("네 정수의 최솟값을 구합니다.");
        System.out.println("a 값은 : ");
        a = sc.nextInt();
        System.out.println("b 값은 : ");
        b = sc.nextInt();
        System.out.println("c 값은 : ");
        c = sc.nextInt();
        System.out.println("d 값은 : ");
        d = sc.nextInt();

        int min = min4(a,b,c,d);
        System.out.println("최솟값은 " + min + "입니다." );


    }
}
