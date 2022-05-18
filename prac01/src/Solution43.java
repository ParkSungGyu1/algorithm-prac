
/*
    프로그래머스 나머지가 1이 되는 수 찾기
    https://programmers.co.kr/learn/courses/30/lessons/87389
    풀이과정
    1. 반복문을 n까지 증가시키며 타겟 넘버와 나눈 나머지를 확인해서 1이 되면 리턴한다.
 */

class Solution43 {
    public int solution(int n) {
        for(int i = 1; i < n; i++){
            if(n % i == 1){
                return i;
            }
        }
        return 0;
    }
}