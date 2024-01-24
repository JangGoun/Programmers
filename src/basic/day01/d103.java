package basic.day01;

import java.util.Scanner;

public class d103 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        for (int i=0 ; i<n ; i++){
            System.out.print(str);
        }

        sc.close();

//        System.out.println(str.repeat(n));

//        StringBuilder sb = new StringBuilder();
//        StringBuilder는 String과 문자열을 더할 때 새로운 객체를 생성하는 것이 아니라 기존의 데이터에 더하는 방식을 사용하기 때문에 속도도 빠르며 상대적으로 부하가 적다.
//        따라서 긴 문자열을 더하는 상황이 발생할 경우 StringBuffer 또는 StringBuilder를 적극적으로 사용해보자.
//        for(int i=0; i<n; i++){
//            sb.append(str);   // StringBuilder 문자열 추가
//        }
//        String s = sb.toString();
//        System.out.println(s);
    }
}
