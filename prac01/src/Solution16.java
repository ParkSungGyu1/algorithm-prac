
/*
    프로그래머스 나누어 떨어지는 숫자 배열
    https://programmers.co.kr/learn/courses/30/lessons/12910
    풀이과정
    1. 결과값을 받아줄 ArrayList를 선언한다. ArrayList를 사용하면 메모리를 지정해주지 않아도 되서 편리하다.
    2. 만약 arr 배열 내의 값이 divisor의 약수라면 ArrayList에 담아주고, 만약 ArrayList가 비었다면 -1만 넣어준다.
    3. Arrays.sort를 통해 정렬한다.

 */

import java.util.*;
class Solution16 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> a1 = new ArrayList<Integer>();

        for(int i = 0; i <arr.length; i++){
            if(arr[i]%divisor == 0){
                a1.add(arr[i]);
            }
        }

        if(a1.isEmpty()){
            a1.add(-1);
        }

        answer = new int[a1.size()];

        for(int i = 0; i<a1.size() ; i++){
            answer[i] = a1.get(i);
        }

        Arrays.sort(answer);
        return answer;
    }
}