
/*
    프로그래머스 크레인 인형뽑기 게임
    https://programmers.co.kr/learn/courses/30/lessons/64061
    풀이과정
    1. 인형을 뽑은후 담을 stack을
    2. 뽑는다 라는 개념은 해당 인덱스에 접근한다로 해석한 후 moves에 담긴 요소를 타깃 위치로 잡는다.
    3. 타깃 위치에서 0을 만난다면 한칸 아래로 움직여서 0이 아닌 수를 만날때 까지 반복한다
    4. 만났다면 stack의 peek값과 동일한지 확인한다.
    5. 동일하다면 answer를 증가시키고 동일하지 않는다면 stack에 쌓는다.
 */

import java.util.ArrayList;
import java.util.Stack;

public class Solution45 {
    public int solution(int[][] board, int[] moves) {
        //stack은 하나만 이용한다.
        //굳이 가로로된걸 세로로 바꿀 필요가 없다.
        int move = 0;
        int garb = 0;
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < moves.length; i++){
            move = moves[i];
            for(int j = 0; j<board.length; j++){
                if(board[j][move-1] == 0){
                    continue;
                }else{
                    if(stack.empty()){
                        stack.push(board[j][move-1]);
                    }else{
                        if(stack.peek() == board[j][move-1]){
                            garb = stack.pop();
                            answer += 1;
                        }else {
                            stack.push(board[j][move-1]);
                        }
                    }
                    board[j][move-1] = 0;
                    break;
                }
            }
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        Solution45 a = new Solution45();
        a.solution(new int[][]{{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}}, new int[]{1,5,3,5,1,2,1,4});
    }
}