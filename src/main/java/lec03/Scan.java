package lec03;


import java.util.Scanner;

public class Scan {

    // main 치시면, 여기서부터 프로그램이 시작해~
    public static void main(String[] args) {
        // 입력을 받을 스캐너를 만든다, new : 새로운, System.in : 시스템 안으로 데이터를 입력 받는다
        Scanner scan = new Scanner(System.in);

        // String : 문장이라는 뜻.
        // str : 저희가 입력받은 '문장의 이름'입니다.
        // tony.nextLine() : 한 줄을 입력받는다
        String str = scan.nextLine();

        // str 을 출력해라
        System.out.println(str);
    }

    /**
     * tony.nextLine(); 을 하는 순간
     *
     * str 이라는 이름표가 붙은 상자가 하나 생긴다.
     * 이 상자에는 '문장'만 들어올 수 있다.
     *
     * System.out.println(str); 을 하게 되면 상자 안에 있는 '문장'을 가져와서 출력합니다.
     * System.out.println("str");
     */

}
