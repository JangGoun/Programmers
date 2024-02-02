package basic.day07;

import java.util.ArrayList;

public class d704 {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(n); // 첫 숫자열 넣기

        // 1이 될 때까지 무한 반복
        while (n!=1){
            if (n%2==0){
                n = n/2;
                list.add(n);
            } else {
                n = 3*n+1;
                list.add(n);
            }
        }

        // 배열 사이즈를 list 사이즈로 정의
        int[] answer = new int[list.size()];

        // 리스트 값을 배열에 넣기
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;

//        String str = n+",";
//        while(n!=1){
//            n = n%2==0 ? n/2 : 3*n+1;
//            str += n+",";
//        }
//        String[] arr = str.split(",");
//        int[] answer = new int[arr.length];
//        for(int i=0; i<answer.length; i++){
//            answer[i] = Integer.parseInt(arr[i]);
//        }
//        return answer;

//        ArrayList<Integer> al = new ArrayList<>();
//        al.add(n);
//        while (n != 1) {
//            n = n % 2 == 0 ? n / 2 : (3 * n + 1);
//            al.add(n);
//        }
//
//        return al.stream().mapToInt(i -> i).toArray();
    }
}
