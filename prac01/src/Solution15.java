
/*
    프로그래머스 2016년
    https://programmers.co.kr/learn/courses/30/lessons/12901
    풀이과정
    1. 요일과 달별 끝나는 일자를 배열에 담아준다.
    2. 만약 5월 24일 을 입력받게 되면 이는 4월 30일 까지의 모든 일수 + 24일 로 해석할 수 있다.
    3. 타겟일까지 모든 일수가 합해졌다면 일주일 단위로 요일이 초기화 되기 때문에 count에서 %7한 값을 리턴하되,
    금요일 부터 시작이기 떄문에 count에 4를 더해줬다.
 */

class Solution15 {
    public String solution(int a, int b) {
        String[] day =new String[] { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT",};
        int[] date =new int[] {0,31,29,31,30,31,30,31,31,30,31,30,31};
        int count = 0;

        for(int i = 1; i < a; i++){
            count += date[i];
        }
        count += b;
        return day[(count + 4) % 7];
    }
}