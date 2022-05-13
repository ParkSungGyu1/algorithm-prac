
/*
    프로그래머스 없는 숫자 더하기
    https://programmers.co.kr/learn/courses/30/lessons/86051

    풀이과정
    1. 문제에 nubmers의 모든 원소는 서로 다르다는 큰 힌트가 있다.
    2. 0~9 까지의 합은 45임으로, 45 - numbers 배열 요소의 합이 답이 된다.

 */

import java.util.Arrays;
class Solution2 {
    public int solution(int[] numbers) {
        int answer = 45 - Arrays.stream(numbers).sum();
        return answer;
    }
}


public class prac02 {
    public static void main(String[] args) {
        Solution2 a = new Solution2();

    }
}
