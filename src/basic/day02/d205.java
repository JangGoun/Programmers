package basic.day02;

public class d205 {

    public String solution(String my_string, String overwrite_string, int s) {

        String answer = "";
        int behind = my_string.length()-s-overwrite_string.length();

        String first = my_string.substring(0,s);
        String second = overwrite_string;
        String third = my_string.substring(s+overwrite_string.length());

        answer = first+second+third;

        return answer;

//        String before = my_string.substring(0, s);
//        String after = my_string.substring(s + overwrite_string.length());
//        return before + overwrite_string + after;

//        if(my_string.length() > answer.length()) {
//            answer += my_string.substring(answer.length());
//        }

//        StringBuilder sb = new StringBuilder(my_string);
//        sb.replace(s, s + overwrite_string.length(), overwrite_string);
//        return sb.toString();

    }

}
