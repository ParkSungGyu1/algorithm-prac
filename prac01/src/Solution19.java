
/*
    프로그래머스 이상한 문자 만들기
    https://programmers.co.kr/learn/courses/30/lessons/12930
    풀이과정
    1. 입력되는 s의 값을 str 배열에 split 하여 담아준다.
    2. 반복문 속에서 배열의 값을 하나씩 확인한다.
    3. 만약 공백일 경우 index를 0으로 초기화 하고, 아닐 경우 index가 짝수면 대문자, 홀수면 소문자로 바꾸어 준다.

 */

class Solution19 {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        int index = 0;
        for(int i=0; i<str.length; i++) {
            if(str[i].equals(" ")) {
                index = 0;
            } else if(index % 2 == 0) {
                str[i] = str[i].toUpperCase();
                index++;
            } else if(index % 2 != 0) {
                str[i] = str[i].toLowerCase();
                index++;
            }
            answer += str[i];
        }

        return answer;
    }
}