
/*
    프로그래머스 행렬의 덧셈
    https://programmers.co.kr/learn/courses/30/lessons/12950
    풀이과정
    1. 2차원 배열 answer를 인스턴스화 할 때 입력받는 행렬의 길이가 일정하다는 점에 착안해서 길이를 부여했다.
    2. 반복문을 활용해 배열의 각 요소에 접근에 aswer 배열에 담아 주었다.
 */

class Solution13 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        for(int a = 0; a < arr1.length; a++){
            for(int b = 0; b < arr1[a].length; b++){
                answer[a][b] = arr1[a][b] + arr2[a][b];
            }

        }
        return answer;
    }
}