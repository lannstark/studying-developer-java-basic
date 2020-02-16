package lec08;

public class Oper3 {

    public static void main(String[] args) {

        /**
         * 논리 비교 (논리 연산자)
         *
         * 그리고 : &&
         *  true && true => true
         *  true && false => false
         *  false && true => false
         *  false && false => false
         *
         * 또는 : ||
         *  true || true => true
         *  true || false => true
         *  false || true => true
         *  false || false => false
         *
         * 아니면 : !
         *   !true => false
         *   !false => true
         */

        System.out.println((7 > 4) || (2 > 3));
    }

}
