package basic.day04;

public class d404 {

    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;

        if (ineq.equals(">") && eq.equals("=")) {
            answer = n >= m ? 1 : 0;
        } else if (ineq.equals("<") && eq.equals("=")) {
            answer = n <= m ? 1 : 0;
        } else if (ineq.equals(">") && eq.equals("!")) {
            answer = n > m ? 1 : 0;
        } else {
            answer = n < m ? 1 : 0;
        }

        return answer;

//        Map<String, BiFunction<Integer, Integer, Boolean>> functions = Map.of(
//                ">=", (a, b) -> a >= b,
//                "<=", (a, b) -> a <= b,
//                ">!", (a, b) -> a > b,
//                "<!", (a, b) -> a < b
//        );
//
//        return functions.get(ineq + eq).apply(n, m) ? 1 : 0;
//
//        return (">".equals(ineq) ? n > m : n < m) || ("=".equals(eq) ? n == m : false) ? 1 : 0;

    }
}
