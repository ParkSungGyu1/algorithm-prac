
/*
    프로그래머스 문자열 내 p와 y의 개수
    https://programmers.co.kr/learn/courses/30/lessons/12916
    풀이과정
    1. replaceAll(정규표현식)을 활용해  p,P를 공백으로 바꾼 길이와 y,Y를 공백으로 바꾼 길이가 같다면 true를 반환한다.

 */

class Solution17 {
    boolean solution(String s) {

        if(s.replaceAll("p|P", "").length() == s.replaceAll("y|Y", "").length()){
            return true;
        }else{
            return false;
        }


    }
}