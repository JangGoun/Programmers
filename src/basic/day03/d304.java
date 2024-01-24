package basic.day03;

public class d304 {

    public int solution(int a, int b) {
        int answer = 0;
        String plus1 = "";
        String plus2 = "";
            plus1 = String.valueOf(a)+String.valueOf(b);
            plus2 = String.valueOf(b)+String.valueOf(a);

        if (Integer.parseInt(plus1)>Integer.parseInt(plus2))
        {
            return Integer.parseInt(plus1);
        } else if (Integer.parseInt(plus1)<Integer.parseInt(plus2)) {
            return Integer.parseInt(plus2);
        } else {
            return Integer.parseInt(plus1);
        }

//        int answer = 0;
//        int aLong = Integer.parseInt(""+a+b);
//        int bLong = Integer.parseInt(""+b+a);
//        answer = aLong > bLong ? aLong : bLong;
//
//        return answer;

//        String strA = String.valueOf(a);
//        String strB = String.valueOf(b);
//        String strSum1 = strA + strB;
//        String strSum2 = strB + strA;
//        return Math.max(Integer.valueOf(strSum1), Integer.valueOf(strSum2));
        //parseInt(): 원시데이터인 int 타입을 반환
        //valueOf(): Integer 래퍼(wrapper)객체를 반환

//        return Math.max(Integer.parseInt(a + "" + b), Integer.parseInt(b + "" + a));


//        int answer = 0;
//
//        String q = String.valueOf(a);
//        String w = String.valueOf(b);
//
//        answer = (Integer.parseInt(q+w) > Integer.parseInt(w+q) ? Integer.parseInt(q+w) : Integer.parseInt(w+q));
//
//        return answer;

    }
}
