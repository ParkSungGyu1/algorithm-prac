
/*
    프로그래머스 문자열 내 마음대로 정렬하기
    https://programmers.co.kr/learn/courses/30/lessons/12915
    풀이과정
    1. 제한사항에 따라 strings를 사전순으로 정렬한다.
    2. 이후 반복문을활용해 char를 비교하며 정렬한다.

 */

import java.util.*;
class Solution37 {
    public String[] solution(String[] strings, int n) {
        String garb = "";
        Arrays.sort(strings);
        for(int i = 1; i < strings.length; i++){

            for(int j = 0; j < strings.length - i; j++){

                if(strings[j].charAt(n) > strings[j+1].charAt(n)){
                    garb = strings[j];
                    strings[j] = strings[j+1];
                    strings[j+1] = garb;
                }
            }


        }

        return strings;
    }
}