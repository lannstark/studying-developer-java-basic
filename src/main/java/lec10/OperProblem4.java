package lec10;

import java.util.Scanner;

/**
 * [정올 4번]
 * 두 개의 정수를 입력 받아 각각 '후치 증가 연산자'와 '전치 감소 연산자'를 사용하여
 * 두 수의 곱을 구한 후 각각의 값을 출력하는 프로그램을 작성해라
 *
 * 입력 예
 * 10 20
 *
 * 출력 예
 * 11 19 190
 *
 */
public class OperProblem4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int result = num1++ * --num2;
        System.out.println(String.format("%s %s %s", num1, num2, result));
    }

}
