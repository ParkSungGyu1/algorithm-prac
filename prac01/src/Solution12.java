
/*
    프로그래머스 서울에서 김서방 찾기
    https://programmers.co.kr/learn/courses/30/lessons/12919
    풀이과정
    1. Arrays.asList.indexof를 활용해서 원하는 값의 인덱스 번호를 받아서 적용한다.
 */

import java.util.Arrays;
class Solution12 {
    public String solution(String[] seoul) {
        String answer ="김서방은 "+ Arrays.asList(seoul).indexOf("Kim")+"에 있다";
        return answer;
    }
}