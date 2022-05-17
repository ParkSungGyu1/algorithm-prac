
/*
    프로그래머스 하샤드 수
    https://programmers.co.kr/learn/courses/30/lessons/12947
    풀이과정
    1. my_x 배열이 입력받은 x를 잘라서 넣어준다.
    2. 배열의 합을 구한다.
    3. 입력받은 정수와 배열의 나머지를 구해서 하샤드 수를 판별한다.

 */

import java.util.*;
import java.util.stream.Stream;
class Solution32 {
    public boolean solution(int x) {
        int[] my_x = Stream.of(String.valueOf(x).split("")).mapToInt(Integer::parseInt).toArray();
        int x_sum = Arrays.stream(my_x).sum();

        if(x % x_sum == 0){
            return true;
        }else{
            return false;
        }
    }
}