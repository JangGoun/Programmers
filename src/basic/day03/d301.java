package basic.day03;

public class d301 {

    public static void main(String[] args) {
        String str1="aaaaa";
        String str2="bbbbb";
        String answer = "";

        String[] list1 = str1.split("");
        String[] list2 = str2.split("");

        for (int i = 0; i < str1.length(); i++) {
            answer += list1[i]+list2[i];
        }
        System.out.println(answer);

//        for(int i = 0; i < str1.length(); i++){
//            answer+= str1.charAt(i);
//            answer+= str2.charAt(i);
//        }

//        for(int i = 0; i < str1.length(); i++) {
//            answer += String.valueOf(str1.charAt(i));
//            answer += String.valueOf(str2.charAt(i));
//        }
//        value of char를 String으로 형변환

//        char[] chars1 = str1.toCharArray();
//        // String으로 받은 문자열을 char 문자로 쪼갠 뒤 char[]배열에 순서대로 값을 넣어 반환한다
//        char[] chars2 = str2.toCharArray();
//
//        StringBuilder sb = new StringBuilder();
//        for (int i=0; i<chars1.length; i++) {
//            sb.append(chars1[i]).append(chars2[i]);
//            // 기존 문자열의 뒤쪽에 문자열을 추가하는 기능
//        }
//
//        return sb.toString();
    }

}
