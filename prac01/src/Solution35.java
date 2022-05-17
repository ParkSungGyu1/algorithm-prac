
/*
    프로그래머스 두 개 뽑아서 더하기
    https://programmers.co.kr/learn/courses/30/lessons/68644
    풀이과정
    1. 2중 반복문을 활용해 배열 내에 가능한 합을 모두 구해서 arraylist에 저장한다.
    2. 만약 합한결과가 arraylist에 있으면 contiue한다.

 */

import java.util.*;
class Solution35{
    public int[] solution(int[] numbers) {
        ArrayList<Integer> answer = new ArrayList<>();
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            for(int a = numbers.length-1; a > i ; a--){
                sum = numbers[i] + numbers[a];
                if(answer.contains(sum)){
                    continue;
                }else{
                    answer.add(sum);
                }
            }
        }
        Collections.sort(answer);
        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}