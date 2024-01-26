package basic.day05;

import java.lang.Math;

public class d504 {

    public int solution(int[] num_list) {
        int answer = 0;
        int mul = 1;
        int sum = 0;

        for (int a : num_list) {
            mul *= a;
            sum += a;
        }
        answer = mul < Math.pow(sum, 2) ? 1 : 0;

        return answer;

//        return (Arrays.stream(numList).reduce((acc, i) -> acc * i).getAsInt() < Math.pow(Arrays.stream(numList).sum(), 2)) ? 1 : 0;

//        for(int i=0; i<num_list.length; i++){
//            temp *= num_list[i];
//            temp1 += num_list[i];
//        }


    }
}
