
/*
    프로그래머스 실패율
    https://programmers.co.kr/learn/courses/30/lessons/42889#
    풀이과정
    1. 2중 반복문을 활용해 N단계보다 더 잘한 요소, N단계에 머물러 있는 요소를 찾는다.
    2. N단계보다 더 잘한 요소는 challenger, N단계에 머물러 있는 요소는 fail에 담는다
    3. 만약 challenger가 0이라면 0으로 나눌 수 없기에 1로 바꾼다.
    4. 이후 문제 설명에 따라 fail / challenger를 진행한 후 HashMap에 담아준다.
    5. HashMap을 value값 기준으로 정렬한 후
    6. 정렬된 Map에서 key값을 순서대로 배열에 담는다.

 */

import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Solution40 {
    public int[] solution(int N, int[] stages) {
        Map<Integer,Double> map = new HashMap<>();

        int[] answer = new int[N];
        int challenger = 0;
        int fail = 0;
        double f_c = 0;
        int a = 0;

        for(int n = 1; n < N+1; n++){
            for(int j = 0; j < stages.length; j++){
                if(stages[j] >= n){
                    challenger += 1;
                    if(stages[j] == n){
                        fail += 1;
                    }
                }
            }
            if(challenger == 0){
                challenger = 1;
            }
            f_c = (double)fail / challenger;
            map.put(n,f_c);
            challenger = 0;
            fail = 0;
        }

        // Map.Entry 리스트 작성
        List<Entry<Integer,Double>> list_entries = new ArrayList<Entry<Integer,Double>>(map.entrySet());

        // 비교함수 Comparator를 사용하여 내림 차순으로 정렬
        Collections.sort(list_entries, new Comparator<Entry<Integer,Double>>() {
            // compare로 값을 비교
            public int compare(Entry<Integer,Double> obj1, Entry<Integer,Double> obj2)
            {
                // 내림 차순으로 정렬
                return obj2.getValue().compareTo(obj1.getValue());
            }
        });

        for(Entry<Integer,Double> entry : list_entries) {
            answer[a] =entry.getKey();
            a++;
        }

        return answer;
    }
}