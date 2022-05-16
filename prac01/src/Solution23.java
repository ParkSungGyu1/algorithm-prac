
/*
    프로그래머스 완주하지 못한 선수
    https://programmers.co.kr/learn/courses/30/lessons/42576
    풀이과정
    1. 두개의 배열을 오름차순 정렬한다.
    2. 각 배열의 요소를 인덱스 순으로 비교한다.
    3. 만약 값이 다르다면 그 선수는 탈락, 바로 리턴한다
    4. 만약 탈락한 선수가 이름순 마지막이더라도 자연스럼게 break되면서 리턴된다.

 */

import java.util.Arrays;
class My_Solution23 {
    public String solution(String[] participant, String[] completion) {

        Arrays.sort(participant);
        Arrays.sort(completion);

        int i = 0;
        for(i = 0; i < completion.length; i++) {
            if(!participant[i].equals(completion[i])){
                break;
            }
        }

        return participant[i];

    }
}

public class Solution23 {
    public static void main(String[] args) {
        My_Solution23 a = new My_Solution23();
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        System.out.println(a.solution(participant,completion));

    }
}
