
/*
    프로그래머스 약수의 개수와 덧셈
    https://programmers.co.kr/learn/courses/30/lessons/77884#
    풀이과정
    1. 2중 반복을 통해 left와 right 사이에 있는 약수를 구해서 cnt를 높혀준다
    2. 문제 안내에 따라 answer에 더하거나 빼준다.
 */

class Solution41 {
    public int solution(int left, int right) {
        int answer = 0;

        for(int i = left; i <= right; i++) {
            int cnt = 0;

            for(int j = 1; j <= i; j++) {
                if(i % j == 0){
                    cnt++;
                }
            }

            if(cnt % 2 == 0){
                answer += i;
            }
            else{
                answer -= i;
            }
        }

        return answer;
    }
}