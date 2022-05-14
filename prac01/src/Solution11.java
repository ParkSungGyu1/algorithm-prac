
/*
    프로그래머스 내적
    https://programmers.co.kr/learn/courses/30/lessons/70128
    풀이과정
    1. 반복문을 활용해 각 배열의 요소에 접근하여 곱해준 후 정답에 더해준다.

 */

class Solution11 {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i = 0 ; i< a.length; i++){
            answer += a[i] * b[i];
        }
        return answer;
    }
}
