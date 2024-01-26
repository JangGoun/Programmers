package basic.day05;

public class d505 {

    public int solution(int[] num_list) {
        int answer = 0;
        String list1= "";
        String list2 = "";

        for (int a : num_list){
           if (a%2==0){
               // 방법1 concat 사용해서 문자열 붙이기
               list1=list1.concat(Integer.toString(a));
           } else{
               // 방법2 연산자로 문자열 붙이기(사용 가능)
               list2+=Integer.toString(a);
           }
        }
        answer = Integer.parseInt(list1) + Integer.parseInt(list2);


        return answer;

//        return Integer.parseInt(Arrays.stream(numList).filter(value -> value % 2 != 0).mapToObj(String::valueOf).collect(Collectors.joining())) + Integer.parseInt(Arrays.stream(numList).filter(value -> value % 2 == 0).mapToObj(String::valueOf).collect(Collectors.joining()));
//        뭐래는 거야 이해 안감

//        int answer = 0;
//        String even = "";
//        String odd= "";
//        for(int i : num_list) {
//            if(i%2==0) even += i + ""; // 방법3 "" 붙여서 문자열로 만들기
//            else odd += i + "";
//        }
//        answer = Integer.parseInt(even) + Integer.parseInt(odd);
//        return answer;

//        for ( int i = 0; i < num_list.length; i++ ) {
//            if ( num_list[i] % 2 == 1 ) {
//                odd += num_list[i];
//            } else even += num_list[i];
//        }

    }


}
