
/*
    프로그래머스 콜라츠 추측
    https://programmers.co.kr/learn/courses/30/lessons/12943
    풀이과정
    1. 연산 과정 중 *3 + 1이 있기 떄문에 오버플로우를 대비해서 long에 값을 저장한다.
    2. 500번을 반복해도 1이 되지않는다면 -1을 리턴하도록 for문을 설정한다.
    3. 만약 a가 1이라면 연산하면 안되기 때문에 0을 리턴한다.
    4. 이후에는 주어진 계산식에 따라 계산하면서 계산 결과값이 1일경우 answer를 리턴한다.

 */

class Solution21 {
    public int solution(int num) {
        int answer = 0;

        long a = (long)num;

        for(int i = 0; i< 500; i++){
            if(a == 1){
                return 0;

            }

            if(a % 2 == 0){
                a /= 2;
                answer += 1;
                if(a == 1){
                    return answer;
                }


            }else{
                a = (a*3) + 1;
                answer += 1;
                if(a == 1){
                    return answer;
                }

            }

        }
        return -1;
    }
}