
/*
    프로그래머스 K번째수
    https://programmers.co.kr/learn/courses/30/lessons/42748
    풀이과정
    1. 문제 설명에서 안내하는대로 진행한다.
    2. Arrays.copyOfRange , sort를 사용했다.

 */

class Solution39 {
    public int solution(int n) {
        int answer = 0;

        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }

        for(int i = 1; i <= (n/2+1); i++){
            if(n % i == 0){
                answer += i;
            }
        }
        return answer+n;
    }
}