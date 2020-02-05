package lec04;

import java.util.Scanner;

public class Scan2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 문장이랑 숫자를 각각 입력 받는 방법
        String name = scan.nextLine();
        int age = scan.nextInt();

        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
    }

    /**
     * 숫자 입력 받는 방법
     * Scanner scan = new Scanner(System.in);
     *
     * 문장 : String str = scan.nextLine();
     * 작은 정수 : int number = scan.nextInt();
     * 큰 정수 : long number = scan.nextLong();
     * 작은 실수 : float number = scan.nextFloat();
     * 큰 실수 : double number = scan.nextDouble();
     */

}
