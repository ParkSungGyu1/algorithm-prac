
/*
    프로그래머스 최소직사각형
    https://programmers.co.kr/learn/courses/30/lessons/86491
    풀이과정
    1. 최소 직사각형을 구하기 위해선 가로길이와 세로길이의 정렬이 필요하다.
    2. 각 명함의 가로, 세로 길이를 비교하여 더 큰쪽이 가로길이로 오도록 정렬한다.
    3. 이후 가로길이와 세로길이의 가장 긴 값을 곱한다.

 */

class Solution28 {
    public int solution(int[][] sizes) {
        int garb = 0;
        int f_max = 0;
        int s_max = 0;
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                garb = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = garb;
            }
            if(f_max < sizes[i][0]){
                f_max = sizes[i][0];
            }
            if(s_max < sizes[i][1]){
                s_max = sizes[i][1];
            }

        }
        return f_max * s_max;
    }
}