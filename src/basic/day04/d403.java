package basic.day04;

public class d403 {

    public int solution(int n) {
        int answer = 0;

        if (n%2==1){
            for (int i = 0; i <= n; i++) {
                if (i%2==1){
                    answer += i;
                }

            }
        }
        else {
            for (int i = 0; i <= n; i++) {
                if(i%2==0){
//                    answer += i*i;
                    answer += Math.pow(i,2);
                }
            }
        }

        return answer;




    }
}
