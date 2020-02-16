package lec10;

import java.util.Scanner;

/**
 * [정올 2번]
 * 정수 2개를 입력 받아서 첫 번째 수에는 100을 증가시켜 저장하고
 * 두 번째 수는 10으로 나눈 나머지를 저장한 후 두 수를 차례로 출력하는 프로그램을 작성해라
 *
 * 입력 예
 * 20 35
 *
 * 출력 예
 * 120 5
 */
public class OperProblem2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        num1 += 100;
        num2 %= 10;

        System.out.println(String.format("%s %s", num1, num2));
    }

}
