
/*
    프로그래머스 직사각형 별찍기
    https://programmers.co.kr/learn/courses/30/lessons/12969
    풀이과정
    1. 입력 받은 값을 이용해 *을 반복 출력한다.
 */

import java.util.Scanner;

class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i = 1; i <= b; i++){
            System.out.println("*".repeat(a));
        }

    }
}