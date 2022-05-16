
/*
    프로그래머스 자릿수 더하기
    https://programmers.co.kr/learn/courses/30/lessons/12931
    풀이과정
    1. Stream을 활용하여 n을 list화 해준다.
    2. stream.sum을 이용해 합을 구한다.

 */

import java.util.Arrays;
import java.util.stream.Stream;

public class Solution24 {
    public int solution(int n) {

        int[] cal = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();

        return Arrays.stream(cal).sum();
    }
}