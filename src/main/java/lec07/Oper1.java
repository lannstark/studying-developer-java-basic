package lec07;

public class Oper1 {

    public static void main(String[] args) {
        int num1 = 11;
        int num2 = 3;

        /**
         * + : 더하기이다
         * - : 빼기이다
         * * : 곱하기이다
         * / : 정수끼리 / 를 사용하면 '몫'이 구해진다,
         *     실수끼리 / 를 사용하면 우리가 아는 그 나누기가 된다.
         * % : 정수끼리 % 를 사용하면 '나머지'가 구해진다
         *     실수끼리 % 를 사용하면 실수의 '나머지'가 구해진다.
         *
         * 하지만, 나는 정수끼리 나눠서 실수를 보고 싶은걸?
         * '형변환' 정수 -> 실수, 실수 -> 정수
         *
         * (바꾸고 싶은 타입) 변수이름
         */


        System.out.println((double) num1 / num2);
    }

}
