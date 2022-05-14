
/*
    프로그래머스 부족한 금액 계산하기
    https://programmers.co.kr/learn/courses/30/lessons/82612
    풀이과정
    1. price가 배수로 늘어나면서 답에 더해져야 한다.
    2. 반복문을 활용해 i를 count만큼 늘려주면서 답에 더해주었다.
    3. 만약 합한 결과가 내가가진 돈보다 작으면 부족한 만큼 값을 반환한다.

 */

class Solution10 {
    public long solution(int price, int money, int count) {
        long answer = 0;

        for(int i = 1; i <= count; i++){
            answer += price*i;
        }

        if(money < answer){
            return answer - money;
        }else{
            return 0;
        }


    }
}

