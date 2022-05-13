
/*
    프로그래머스 가운데 글자 가져오기
    https://programmers.co.kr/learn/courses/30/lessons/12903

    풀이과정
    1. 문자열이 짝수일 경우와 홀수일 경우를 조건문으로 분리한다.
    2. 홀수일 경우 문자열 길이의 절반에 해당하는 문자열을 반환한다.
    3. 짝수일 경우 문자열 길이의 절반에서 -1~+1 까지 범위의 문자열을 반환한다.
   
 */
class Solution {
    String answer = "";
    public String solution(String s) {
        if(s.length() % 2 == 0){
            answer = s.substring(s.length()/2-1,s.length()/2+1);
        }else{
            answer = String.valueOf(s.charAt(s.length()/2));
        }
        return answer;
    }
}


public class prac01 {
    public static void main(String[] args) {
        Solution a = new Solution();
        String answer = a.solution("abcdeffd");
        System.out.println(answer);
    }
}
