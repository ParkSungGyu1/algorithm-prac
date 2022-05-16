
/*
    프로그래머스 수박수박수박수박수박수?
    https://programmers.co.kr/learn/courses/30/lessons/12922
    풀이과정
    1. "수"와 "박"을 배열에 저장한다.
    2. 반복문을 활용해 "수"와 "박"을 번갈아서 담아준다.

 */

class Solution22 {
    public String solution(int n) {
        String[] w_melon = {"수","박"};
        String[] answer = new String[n];
        for(int i = 0; i < n; i++){
            answer[i] = w_melon[i%2];
        }

        return String.join("", answer);
    }
}