
/*
    프로그래머스 약수의 합
    https://programmers.co.kr/learn/courses/30/lessons/12928
    풀이과정
    1. A라는 숫자의 약수는 A/2보다 클 수 없다.
    2. A의 약수는 A를 꼭 포함한다.
    3. 위 두가지의 조건으로 식을 완성한다.

 */

class Solution38 {
    public int solution(int n) {
        int answer = 0;

        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }

        for(int i = 1; i <= (n/2+1); i++){
            if(n % i == 0){
                answer += i;
            }
        }
        return answer+n;



    }
}