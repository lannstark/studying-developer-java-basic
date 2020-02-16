package lec10;

import java.util.Scanner;

/**
 * [정올 6번]
 * 두 개의 정수를 입력 받아서 다음과 같이 4가지 관계 연산자의 결과를 출력해라
 *
 * 입력 예
 * 4 5
 *
 * 출력 예
 * 4 > 5 --- false
 * 4 < 5 --- true
 * 4 >= 5 --- false
 * 4 <= 5 --- true
 */
public class OperProblem6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        // == : 같다  != : 다르다
        System.out.println(String.format("%s > %s --- %s", num1, num2, num1 > num2));
        System.out.println(String.format("%s < %s --- %s", num1, num2, num1 < num2));
        System.out.println(String.format("%s >= %s --- %s", num1, num2, num1 >= num2));
        System.out.println(String.format("%s <= %s --- %s", num1, num2, num1 <= num2));
    }

}
