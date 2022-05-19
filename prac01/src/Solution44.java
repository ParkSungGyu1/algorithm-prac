
/*
    프로그래머스 [1차] 비밀지도
    https://programmers.co.kr/learn/courses/30/lessons/17681
    풀이과정
    1. toBinaryString을 이용해 2진법으로 나타낸다.
    2. 이후 조건문을 활용해서 모든 요소의 길이를 같게 해준다 ex) 101 ==> 00101
    3. 반복문 안에서 각각의 요소를 확인해 조건에 맞ㄱ게 #과 공백을 넣어준다
 */

public class Solution44 {

        public String[] solution(int n, int[] arr1, int[] arr2) {
            //입력받은 수를 2진수로 나타낸다
            //반복문을 통해 값을 비교해서 둘중 하나라도 1이면 # 추가 아니라면 공백을 추가한다

            StringBuilder sb = new StringBuilder();
            String[] answer = new String[n];

            String compare1 = "";
            String compare2 = "";


            for(int i = 0; i < n; i++){
                compare1 = Integer.toBinaryString(arr1[i]);
                compare2 = Integer.toBinaryString(arr2[i]);

                if(compare1.length() < n ){
                    compare1 = "0".repeat(n-(compare1.length()))+compare1;
                }

                if(compare2.length() < n){
                    compare2 = "0".repeat(n-(compare2.length()))+compare2;
                }

                if(compare1.equals("1")){
                    compare1 = "0".repeat(n-(compare1.length()))+compare1;
                }
                if(compare2.equals("1")){
                    compare2 = "0".repeat(n-(compare2.length()))+compare1;
                }

                for(int j = 0; j < compare1.length(); j++) {
                    if (compare1.charAt(j) == '1' || compare2.charAt(j) == '1'){
                        sb.append("#");
                    }else{
                        sb.append(" ");
                    }

                }

                answer[i] = sb.toString();
                sb.setLength(0);
            }

            return answer;
        }

    public static void main(String[] args) {
        Solution44 a = new Solution44();
        a.solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28});
    }
}