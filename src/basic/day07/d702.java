package basic.day07;

public class d702 {

    public int[] solution(int l, int r) {
        int[] answer = {};

        for (int i = l; i <= r ; i++) {
            if (String.valueOf(i) == "0" || String.valueOf(i) == "5"){
                answer[i] += answer[i];
            }
            else {
                answer[i] = -1;
            }
            }

        return answer;

//        int[] answer = {};
//        ArrayList<Integer> list = new ArrayList<>();
//        int a = 0;
//        for(int i = l; i <= r; i++) {
//            String num =  String.valueOf(i);
//            String[] nums = num.split("");
//            int numLength =  nums.length;
//            int count = 0;
//            for (int j = 0; j < numLength; j++) {
//                if (nums[j].equals("0") || nums[j].equals("5")) {
//                    count++;
//                }
//            }
//            if(count == numLength) {
//                list.add(i);
//            }
//        }
//        answer = list.stream().mapToInt(Integer::intValue).toArray();
//        if(answer.length == 0) {
//            answer = new int[] {-1};
//            return answer;
//        }
//        return answer;

//        ArrayList<Integer> list = new ArrayList<>();
//
//        for (int i = 1; i < 64; i++) {
//            int num = Integer.parseInt(Integer.toBinaryString(i)) * 5;
//            if (l <= num && num <= r)
//                list.add(num);
//        }
//
//        return list.isEmpty() ? new int[] { -1 } : list.stream().mapToInt(i -> i).toArray();


//        List<Integer> filtered = IntStream.rangeClosed(l, r)
//                .filter(num -> String.valueOf(num).chars().allMatch(ch -> ch == '0' || ch == '5'))
//                .boxed()
//                .collect(Collectors.toList());
//        return filtered.isEmpty() ? new int[] {-1} : filtered.stream().mapToInt(Integer::intValue).toArray();

        // 이진법 활용
        // l = 5, r = 555
        // 5,   50,   55,   500,   505,   550,   555
        // 1    10    11    100    101    110    111
        // 1     2     3      4      5      6      7

        // 지수는 자릿수
        // 2^0 <= x < 2^3
//        int digit = String.valueOf(r).length();
//        int exponent = (int)Math.pow(2.0, digit);
//
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < exponent; i++) {
//            String binaryString = Integer.toBinaryString(i);
//            int target = Integer.parseInt(binaryString) * 5;
//            if (target >= l && target <= r)
//                list.add(target);
//        }
//
//        if (list.isEmpty())
//            return new int[] {-1};
//        else
//            return list.stream().mapToInt(i -> i).toArray();

    }

}
