package basic.day03;

public class d302 {
    public String solution(String[] arr) {
        String answer = "";

        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }

        return answer;

//        return String.join("", arr);

//        for(String a : arr) {
//            answer += a;
//        }

//        return Arrays.stream(arr).collect(Collectors.joining());

//        StringBuilder sb = new StringBuilder();
//        for (String s: arr) {
//            sb.append(s);
//        }
//        return sb.toString();
    }

}
