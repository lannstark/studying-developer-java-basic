package lec10;

import java.util.Scanner;

/**
 * [정올 1번]
 * 세 개의 정수를 입력 받아서 합계와 평균을 출력하시오.
 * 단, 평균은 소수 이하를 버리고 정수 부분만 출력한다.
 *
 * 입력 예
 * 10 25 33
 *
 * 출력 예
 * sum : 68
 * avg : 22
 */
public class OperProblem1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        System.out.println(String.format("sum : %s", num1 + num2 + num3));
        System.out.println(String.format("avg : %s", (num1 + num2 + num3) / 3));
    }

}
