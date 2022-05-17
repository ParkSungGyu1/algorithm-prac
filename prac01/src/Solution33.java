
/*
    프로그래머스 3진법 뒤집기
    https://programmers.co.kr/learn/courses/30/lessons/68935
    풀이과정
    1. 입력받은 수를 3으로 나누어 가며 그 나머지를 ArrayList에 담는다.
    2. 이후 하나씩 불러오며 10진법으로 만들어준다.

 */

import java.util.*;
class Solution33 {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> temp = new ArrayList<>();
        while(true){
            if(n<3){
                temp.add(n);
                break;
            }
            temp.add(n%3);
            n = n/3;
        }
        for(int i=0; i<temp.size(); i++){
            answer += (Math.pow(3,temp.size()-i-1)*temp.get(i));
        }
        return answer;
    }
}