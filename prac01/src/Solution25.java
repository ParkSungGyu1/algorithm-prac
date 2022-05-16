
/*
    프로그래머스 정수 제곱근 판별
    https://programmers.co.kr/learn/courses/30/lessons/12934
    풀이과정
    1. 입력받은 n의 제곱근을 구한다.
    2. 만약 15.123.. 이런식으로 소숫점이 나올 수 있으니 (long)형변환을 통해 정수만 남긴다.
    3. 정수만 남은 num*num 이 입력받은 n과 같은지 판별한다.

 */

class Solution25 {
    public long solution(long n) {
        long num = (long)(Math.sqrt(n));
        if(num*num == n){
            return (num+1)*(num+1);
        }else{
            return -1;
        }
    }
}