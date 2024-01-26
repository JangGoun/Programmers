package basic.day05;

public class d503 {

    public int solution(int a, int b, int c) {
        int answer = 0;

        if (a==b && a==c) {
            answer = (int) ((a + b + c)
                    * (Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2))
                    *(Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3)));
        }
        else if (a!=b && a!=c && b!=c){
            answer = a + b + c;
        }
        else if (a==b || a==c || b==c) {
            answer = (int) ((a + b + c)
                    *(Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2)));
        }

        return answer;

//        int answer = a+b+c;
//        if(a==b&&b==c){
//            answer = answer * (a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c);
//        }else if(a==b||a==c||b==c){
//            answer = answer * (a*a+b*b+c*c);
//        }

//        Set<Integer> numbers = Stream.of(a, b, c).collect(Collectors.toSet());
//
//        return (a + b + c) *
//                (numbers.size() < 3 ? a * a + b * b + c * c : 1) *
//                (numbers.size() < 2 ? a * a * a + b * b * b + c * c * c : 1);
    }
}

//class Solution {
//    public int solution(int a, int b, int c) {
//        int answer = 1;
//
//        int count = 1;
//        if(a == b || a == c || b == c) {
//            count++;
//        }
//
//        if(a == b && b == c) {
//            count++;
//        }
//
//        for(int i = 1; i <= count; i++) {
//            answer *= (pow(a,i)+pow(b,i)+pow(c,i));
//        }
//
//        return answer;
//    }
//
//    private int pow(int a, int b) {
//        if(b == 0) return 1;
//        return a * pow(a, b-1);
//    }
//}

