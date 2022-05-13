
/*
    프로그래머스 짝수와 홀수
    https://programmers.co.kr/learn/courses/30/lessons/12937
    풀이과정
    1. 2로 나누었을 때 나머지가 0 이면 짝수이기 때문에 Even을 리턴한다.
    2. 아닐경우 홀수이기 때문에 Odd를 리턴한다.

 */

class Solution5 {
    public String solution(int num) {
        if(num % 2 == 0){
            return "Even";
        }else{
            return "Odd";
        }

    }
}