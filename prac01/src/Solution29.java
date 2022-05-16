
/*
    프로그래머스 로또의 최고 순위와 최저 순위
    https://programmers.co.kr/learn/courses/30/lessons/77484
    풀이과정
    1. lottos 배열에 0이 몇개가 있는지 zeroCount로 세어준다
    2. win_nums와  lotto번호가 일치할 경우 count를 높혀준다
    3. count와 zerocountdml 이 최대일 경우 ==> 나의 최고등수
    4. count만 있을 경우 ==> 나의 최저 등수 로 계산해 리턴한다.

 */

class Solution29 {
    public int[] solution(int[] lottos, int[] win_nums) {

        int count = 0;
        int zeroCount = 0;

        for(int lotto: lottos){
            if(lotto == 0){
                zeroCount += 1;
                continue;
            }

            for(int win_num: win_nums){
                if(lotto == win_num){
                    count += 1;
                    break;
                }
            }
        }
        return new int[]{7-Math.max(count+zeroCount,1), 7-Math.max(count,1)};
    }
}