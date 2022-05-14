
/*
    프로그래머스 문자열 다루기 기본
    https://programmers.co.kr/learn/courses/30/lessons/12918
    풀이과정
    1. Integer.parsInt를 수행하다 NumberFormatException이 발생하면 false를 리턴한다.

 */

class Solution18 {
    public boolean solution(String s) {
        if(s.length() == 4 || s.length() == 6){
            try{
                int x = Integer.parseInt(s);
                return true;
            } catch(NumberFormatException e){
                return false;
            }
        }
        else{
            return false;
        }
    }
}