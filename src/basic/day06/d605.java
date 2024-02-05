package basic.day06;

import java.util.ArrayList;

public class d605 {

    public int[] solution(int[] arr, int[][] queries) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int[] query: queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];

            int min = Integer.MAX_VALUE;// 기본값으로 최대값 넣어놓고 비교

            for (int i = s; i <= e; i++) {
                if (arr[i]>k && arr[i]<min){
                    // 최소값보다 작으면 최소값 변경
                    min = arr[i];
                }
            }
            // 두 값이 같으면 조건문 통과 못한거니까 -1
            list.add(min==Integer.MAX_VALUE ? -1: min);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;


//        int[] answer = new int[queries.length];
//        Arrays.fill(answer, -1);
//
//        for (int idx = 0; idx < queries.length; idx++) {
//            int[] query = queries[idx];
//            int s = query[0], e = query[1], k = query[2];
//
//            for (int i = s; i <= e; i++) {
//                if (k < arr[i]) {
//                    answer[idx] = answer[idx] == -1 ? arr[i] : Math.min(answer[idx], arr[i]);
//                }
//            }
//
//        }

//        int idx = 0;
//        int[] answer = new int[queries.length];
//
//        for (int[] query : queries) {
//            int s = query[0], e = query[1], k = query[2];
//            int min = Integer.MAX_VALUE;
//
//            for (int i = s;i <= e;i++)
//                if (arr[i] > k)
//                    min = Math.min(arr[i], min);
//
//            answer[idx++] = min == Integer.MAX_VALUE ? -1 : min;
//        }
    }

}
