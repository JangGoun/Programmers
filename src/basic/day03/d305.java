package basic.day03;

public class d305 {

    public int solution(int a, int b) {
        int answer = 0;
        int mul = 0;

        String plus = String.valueOf(a)+String.valueOf(b);

        mul = 2*a*b;

        return Math.max(Integer.parseInt(plus), mul) ;

//        return Math.max(Integer.parseInt(String.valueOf(a)+String.valueOf(b)),2*a*b);

//        int ab = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
//        int ab2 = 2 * a * b;
//        return ab == ab2 ? ab : Math.max(ab, ab2);

//        int add = Integer.parseInt(a+""+b);
//        int mul = 2 * a * b;
//        return Math.max(add, mul);
    }

}
