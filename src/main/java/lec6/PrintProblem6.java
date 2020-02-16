package lec6;

import java.util.Scanner;

public class PrintProblem6 {

    public static void main(String[] args) {
        System.out.print("height = ");

        Scanner scan = new Scanner(System.in);
        int height = scan.nextInt();
        System.out.println(String.format("Your height is %scm.", height));
    }

}
