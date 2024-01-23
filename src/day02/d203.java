package day02;

import java.util.Scanner;

public class d203 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        for (int i = 0; i< a.length(); i++){
            System.out.println(a.charAt(i));
        }

//        for (char ch : a.toCharArray())
//            System.out.println(ch);
//        }
//
//        for(String s : a.split("")){
//        System.out.println(s);
//        }

    }
}
