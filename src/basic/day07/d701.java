package basic.day07;

public class d701 {

    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            for (int j = s; j <= e ; j++) {
                if (j%k==0){
                    arr[j] += 1;
                }
            }
        }

        return arr;

//        for (int i = 0; i < queries.length; i++) {
//            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
//                if (j % queries[i][2] == 0) arr[j] += 1;
//            }
//        }

//        answer = arr;
//        return answer;

    }
    
}
