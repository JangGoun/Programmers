package basic.day06;

public class d604 {

    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        // 임시변수 선언
        int temp = 0;
        for (int i = 0; i < queries.length; i++) {
            temp = arr[queries[i][0]];// 쿼리 i번째에 0번째 인덱스 값이 arr의 인덱스 값과 같은 경우
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]]=temp;
        }
        answer = arr;
        return answer;

//        int[] answer = Arrays.copyOf(arr, arr.length);
//
//        for (int[] query : queries) {
//            int i = query[0];
//            int j = query[1];
//
//            int temp = answer[i];
//            answer[i] = answer[j];
//            answer[j] = temp;
//        }
//
//        return answer;
    }
}
