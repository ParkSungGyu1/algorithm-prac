
/*
    프로그래머스 문자열 내림차순으로 배치하기
    https://programmers.co.kr/learn/courses/30/lessons/12917
    풀이과정
    1. 문자열을 split하여 배열에 담아준다.
    2. Arrays.sort를 통해 정렬 후
    3. Collections를 활용하여 뒤집었다.

 */

import java.util.*;
class Solution30 {
    public String solution(String s) {
        String str[] = s.split("");
        Arrays.sort(str);
        Collections.reverse(Arrays.asList(str));
        return String.join("",str);
    }
}