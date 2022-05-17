
/*
    프로그래머스 같은 숫자는 싫어
    https://programmers.co.kr/learn/courses/30/lessons/12906
    풀이과정
    1. arr의 i번째와 i+1번째의 인덱스를 비교해가면서 만약 다르다면 my_arr에 저장해준다.
    2. 만약 같다면 continue를 해준다.
    3. 공통 조건으로 마지막 2개의 인덱스를 비교할 때에는 꼭 값을 넣어주도록 한다.

 */

import java.util.*;

public class Solution34 {
    public int[] solution(int []arr) {
        ArrayList<Integer> my_arr = new ArrayList<>();
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                if(i == arr.length-2){
                    my_arr.add(arr[i+1]);
                }else{
                    continue;
                }
            }else{
                my_arr.add(arr[i]);
                if(i == arr.length-2){
                    my_arr.add(arr[i+1]);
                }
            }
        }
        return my_arr.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}