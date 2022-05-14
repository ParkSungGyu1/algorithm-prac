
/*
    프로그래머스 x만큼 간격이 있는 n개의 숫자
    https://programmers.co.kr/learn/courses/30/lessons/12954
    풀이과정
    1. answer 배열의 길이를 n만큼 설정해 준다.
    2. answer 배열의 0번부터 n-1번까지 증가되는 값을 저장해 준다.
 */

class Solution14 {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];

        for(int i = 0; i < n; i++){
            answer[i] = x * (i+1);
        }
        return answer;
    }
}