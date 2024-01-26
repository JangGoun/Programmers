package basic.day05;

public class d501 {

    public String solution(String code) {
        String answer = "";
        int mode = 0;
        // 코드를 잘라서 배열에 넣음
        String[] array = code.split("");

        for (int i = 0; i < array.length; i++) {

            if (mode==0){
                if (array[i].equals("1")){mode=1;}  // 배열에 1이 나오면 mode를 1로 변경
                answer = (!array[i].equals("1"))&&(i%2==0) ? answer.concat(array[i]):answer;
            } else if (mode==1) {
                if (array[i].equals("1")){mode=0;} // 배열에 1이 나오면 mode를 0로 변경
                answer = (!array[i].equals("1"))&&(i%2==1) ? answer.concat(array[i]):answer;

            }
        }
        return answer=="" ? "EMPTY": answer;
//       return 하려는 ret가 만약 빈 문자열이라면 대신 "EMPTY"를 return 합니다.

//        StringBuilder answer = new StringBuilder();
//        int mode = 0;
//        for (int i = 0; i < code.length(); i++) {
//            char current = code.charAt(i);
//            if (current == '1') {
//                mode = mode == 0 ? 1 : 0;
//                continue;
//            }
//
//            if (i % 2 == mode) {
//                answer.append(current);
//            }
//        }
//        return answer.length() == 0 ? "EMPTY" : answer.toString();

    }

}
