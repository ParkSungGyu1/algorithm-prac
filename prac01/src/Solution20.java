
/*
    프로그래머스 정수 내림차순으로 배치하기
    https://programmers.co.kr/learn/courses/30/lessons/12933
    풀이과정
    1. 입력받은 정수 n을 String으로 바꾼 후 split하여 배열에 담아준다.
    2. Arrays.sort 및 Collection.reverseOrder를 이용해 내림차순 정렬한다.
    3. StringBuilder를 선언하고 append 해준다.

 */

import java.util.Arrays;
import java.util.Collections;
class Solution20 {
    public long solution(long n) {
        String[] arr = Long.toString(n).split("");

        Arrays.sort(arr, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();

        for(String i : arr) {
            sb.append(i);
        }

        return Long.parseLong(sb.toString());
    }
}