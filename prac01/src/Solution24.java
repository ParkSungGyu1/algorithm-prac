
/*
    프로그래머스 자연수 뒤집어 배열로 만들기
    https://programmers.co.kr/learn/courses/30/lessons/12932
    풀이과정
    1. n의 자릿수만큼 k를 증가시킨다.
    2. k의 길이만큼의 배열을 선언한다.
    3. 입력받은 정수를 10의 단위로 잘라가면서 저장한다.

 */

import java.util.*;
class Solution24 {
    public int[] solution(long n) {
        int[] answer = {};
        int k = 0;
        long num = n;

        while(n>0){
            k++;
            n = n/10;
        }

        answer = new int[k];

        for(int i=0; i<k; i++){
            answer[i] = (int)(num%10);
            num = num/10;
        }

        return answer;
    }
}