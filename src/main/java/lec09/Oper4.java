package lec09;

public class Oper4 {

    public static void main(String[] args) {
        int number = 10;
        // number 에다가 1을 더해서 다시 number 에 넣는다.

        /**
         * 대입연산자
         * A = A + 10  ->  A += 10
         * A = A - 10  ->  A -= 10
         */

        /**
         * 증감연산자
         * A = A + 1  ->  A += 1  ->  A++
         * ++ 앞 뒤 차이점
         * ++가 앞에 있으면 먼저 더해지고
         * ++가 뒤에 있으면 나중에 더해진다
         */

        number %= 5;
        System.out.println(number);
    }


}
