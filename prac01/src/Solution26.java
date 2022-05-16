
/*
    프로그래머스 제일 작은 수 제거하기
    https://programmers.co.kr/learn/courses/30/lessons/12935
    풀이과정
    1. 입력받은 arr을 arraylist에 담아준다.
    2. 만약 arraylist의 값이 1보다 작거나 같으면 -1이 담긴 배열을 리턴한다.
    3. collections를 활용해 arraylist의 가장 작은값을 찾아 제거한 후 배열에 담아 리턴한다.

 */

import java.util.ArrayList;
import java.util.Collections;

class Solution27 {
    public int[] solution(int[] arr) {
        ArrayList<Integer> integerArray = new ArrayList<>(arr.length);
        int[] low_size = {-1};

        for (int i : arr) {
            integerArray.add(i);
        }

        if(integerArray.size() <= 1){
            return low_size;
        }

        integerArray.remove((Integer)Collections.min(integerArray));

        int[] arr1 = new int[integerArray.size()];

        for (int i = 0 ; i < integerArray.size() ; i++) {
            arr1[i] = integerArray.get(i).intValue();
        }

        return arr1;
    }
}