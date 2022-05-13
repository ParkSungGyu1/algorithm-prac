
/*
    프로그래머스 평균 구하기
    https://programmers.co.kr/learn/courses/30/lessons/12944
    풀이과정
    1. Arrays.stream.sum을 이용해 합계를 구헤준 후 arr의 길이로 나누어서 결과를 도출한다.

 */

import java.util.Arrays;
class Solution9 {
    public double solution(int[] arr) {
        double sum = Arrays.stream(arr).sum();
        return sum / arr.length;
    }
}