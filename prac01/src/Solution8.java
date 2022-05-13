
/*
    프로그래머스 음양 더하기
    https://programmers.co.kr/learn/courses/30/lessons/76501
    풀이과정
    1. 반복문 속에서 signs[i]가 false일 경우 absolutes[i]의 값을 음수로 바꾸어 준다.

 */

class Solution8 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i = 0; i < absolutes.length; i++){
            if(!signs[i]){
                absolutes[i] *= -1;
            }
            answer += absolutes[i];
        }
        return answer;
    }
}