
/*
    프로그래머스 예산
    https://programmers.co.kr/learn/courses/30/lessons/12982
    풀이과정
    1. d 배열을 오름차순으로 정리한다.
    2. 가장 적은 수 부터 빼가면서 budget이 오버되는 순간 break 한다.
 */

import java.util.Arrays;
class Solution42 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);

        for(int i = 0; i < d.length; i++){
            budget -= d[i];
            if(budget < 0){
                break;
            }

            answer += 1;
        }

        return answer;
    }
}