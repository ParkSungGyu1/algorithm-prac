class Solution {
    String answer = "";
    public String solution(String s) {
        if(s.length() % 2 == 0){
            answer = s.substring(s.length()/2-1,s.length()/2+1);
        }else{
            answer = String.valueOf(s.charAt(s.length()/2));
        }
        return answer;
    }
}


public class prac01 {
    public static void main(String[] args) {
        Solution a = new Solution();
        String answer = a.solution("abcdeffd");
        System.out.println(answer);
    }
}
