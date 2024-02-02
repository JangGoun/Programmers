package basic.day07;

import java.util.ArrayList;

public class d705 {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (list.isEmpty()) {
                list.add(arr[i]);
            } else if (list.get(list.size()-1) < arr[i]) {
                list.add(arr[i]);
            } else if (list.get(list.size()-1) >= arr[i]) {
                list.remove(list.size() - 1);
                i--;
                //i--가 없으면, arr의 다음 원소로 넘어가게 되어, arr[i]와 list의 새로운 마지막 원소 사이의 필요한 비교를 건너뛰게 됩니다.
            }
        }

        int[] stk = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            stk[i] = list.get(i);
        }

        return stk;

//        Stack<Integer> stack = new Stack<>();
//      스택은 데이터를 일시적으로 저장하기 위한 컬렉션 타입 중 하나로, 후입선출(LIFO: Last In, First Out) 방식으로 작동합니다.
//        int i = 0;
//
//        while (i < arr.length) {
//            if (stack.empty() || stack.peek() < arr[i]) {
//                stack.push(arr[i]);
//                i++;
//            } else if (stack.peek() >= arr[i]) {
//                stack.pop();
//            }
//        }
//        return stack;

//        Stack<Integer> stack = new Stack<>();
//
//        for (int num : arr) {
//            while (!stack.isEmpty() && num <= stack.peek())
//                stack.pop();
//            stack.push(num);
//        }
//
//        return stack.stream().mapToInt(i -> i).toArray();

    }

}