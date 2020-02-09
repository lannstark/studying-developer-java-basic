package lec05;

import java.util.Scanner;

public class Scan3 {

    public static void main(String[] args) {
        // 스캐너를 만들어야 한다.
        Scanner scan = new Scanner(System.in);

        int number1 = scan.nextInt();
        int number2 = scan.nextInt();

        System.out.println(number2);
        System.out.println(number1);
    }

}
