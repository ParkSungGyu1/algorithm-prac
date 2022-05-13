
/*
    프로그래머스 핸드폰 번호 가리기
    https://programmers.co.kr/learn/courses/30/lessons/12948
    풀이과정
    1. 전화번호의 뒤에서 4자리 전까지는 * 을 반복한다.
    2. 나머지 뒤 4자리는 substring을 통해 살려둔다
    3. 두개를 합친다.

 */

import java.util.Arrays;
class Solution3 {
    public String solution(String phone_number) {
       String answer = "*".repeat(phone_number.length()-4) + phone_number.substring(phone_number.length()-4, phone_number.length());
        return answer;
    }
}


public class prac03 {
    public static void main(String[] args) {
        Solution3 a = new Solution3();
        System.out.println(a.solution("01025776879"));
    }
}
