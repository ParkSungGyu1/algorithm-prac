
/*
    프로그래머스 두 정수 사이의 합
    https://programmers.co.kr/learn/courses/30/lessons/12912
    풀이과정
    1. 만약 a 와 b가 같다면 a를 반환한다.
    2. 만약 a가 b보다 크다면 반복문에 들어갈 위치 조정을 위해 자리를 바꾸어 준다.
    3. 반복문을 활용해 결과값에 더해준다.

 */

class Solution6{
    public long solution6(int a, int b) {
        long answer = 0;
        int my_a = 0;
        int my_b = 0;
        if(a == b){
            return a;
        }

        if(a > b){
            my_a = b;
            my_b = a;
        }else{
            my_a = a;
            my_b = b;
        }

        for(long i = my_a; i <= my_b; i++){
            answer += i;
        }
        return answer;
    }
}