package lec6;

import java.util.Scanner;

public class PrintProblem8 {

    /**
     * Formatting : 출력을 예쁘게 해주는 것.
     *   // Hello World
     *   String.format("%s %s", "Hello", "World");
     *
     *   // 나의 이름은 OOO이고, 나이는 OO입니다.
     *   String.format("내 이름은 %s이고, 나이는 %s입니다", name, age);
     *
     *   // 10칸, 5칸을 각각 정렬해준다.
     *   %s -> %10s %5s
     */
    public static void main(String[] args) {
        System.out.println(String.format("%10s%10s%10s", "item", "count", "price"));
        System.out.println(String.format("%10s%10s%10s", "pen", "20", "100"));
        System.out.println(String.format("%10s%10s%10s", "note", "5", "95"));
        System.out.println(String.format("%10s%10s%10s", "eraser", "110", "97"));
    }

}
