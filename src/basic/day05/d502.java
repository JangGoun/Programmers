package basic.day05;

public class d502 {

    public int solution(int a, int d, boolean[] included) {
        int answer = 0;

        // 누적계산 a+d+d+d+d+d

        for (int i = 0; i < included.length; i++) {

            if(included[i]){
                answer+=a+(d*i);
            }


        }
        return answer;

//        return IntStream.range(0, included.length).map(idx -> included[idx]?a+(idx*d):0).sum();

//        for (int i = 0; i < included.length; i++) {
//            if (included[i]) {
//                answer += a;
//            }
//            a += d;
//        }

    }
}
