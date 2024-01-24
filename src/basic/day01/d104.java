package basic.day01;

import java.util.Scanner;

public class d104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String output="";

        char temp = ' ';    // char 홀따옴표 공백으로 초기화

        for (int i=0; i<a.length(); i++){
            temp = a.charAt(i); // 문자열 값을 문자로 하나씩 가져옴

            if ((65<=temp) && (temp<=90) && a.length()<=20){
                output += a.valueOf(temp).toLowerCase();
                // String class의 메소드, String의 객체를 형변환
            } else if ((97<=temp) && (temp<=122) && a.length()<=20){
                output += a.valueOf(temp).toUpperCase();
            }
        }
        System.out.println(output);

//        String answer = "";
//        for(Character c : a.toCharArray()){
//            // toCharArray String으로 받은 문자열을 char 문자로 쪼갠 뒤 char[]배열에 순서대로 값을 넣어 반환한다
//            if(Character.isUpperCase(c)){
//                answer += Character.toLowerCase(c);
//            }
//            else if(Character.isLowerCase(c)){
//                answer += Character.toUpperCase(c);
//            }
//        }
//        System.out.println(answer);

//        for(int i=0; i<a.length(); i++) {
//            char c = a.charAt(i);
//            if(Character.isUpperCase(c)) {
//                System.out.print((char)(c+32)); // 대문자이면 +32
//            }
//            else {
//                System.out.print((char)(c-32)); // 소문자이면 -32
//            }
//        }

    }
}
