package basic.day02;

import java.util.Scanner;

public class d204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n%2==0){
            System.out.println(n + " is even");
        } else if (n%2==1){
            System.out.println(n + " is odd");
        }

//        System.out.print(n + " is "+(n % 2 == 0 ? "even" : "odd"));
//
//        if(n % 2 == 0) {
//            System.out.printf("%d is even",n);
//        } else {
//            System.out.printf("%d is odd",n);
//        }

    }
}
