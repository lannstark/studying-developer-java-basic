package lec6;

import java.util.Scanner;

public class ScanProblem8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double number1 = scan.nextDouble(); // 12.2536 들어왔다 (엔터)
        double number2 = scan.nextDouble(); // 526.129535 들어왔다 (엔터)
        scan.nextLine(); // 위에서 입력한 (엔터)가 여기에 들어올거고, 아래 str에는 우리가 원하는 게 들어간다

        String str = scan.nextLine();

        /**
         * String.format 에서 %.2f를 쓰면 소수점 둘째자리까지 반올림이 된다.
         * %.3f를 하면 셋째자리
         */
        System.out.println(String.format("%.2f", number1));
        System.out.println(String.format("%.2f", number2));
        System.out.println(str);
    }

}
