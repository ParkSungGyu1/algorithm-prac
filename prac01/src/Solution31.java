
/*
    프로그래머스 시저 암호
    https://programmers.co.kr/learn/courses/30/lessons/12926#
    풀이과정
    1. 문자열을 char 배열에 담아준다.
    2. 반복문을 통해 만약 공백이라면 continue 해준다.
    3. 아스키코드상 대문자는 65~90번 소문자는 97~122번이다.
    4. 만약 소문자일 경우(chs[i] < 91)와 대문자일 경우(else)로 나눈다.
    5. 만약 현재 내 아스키 코드와 shift할 n의 값을 더한것이 90이 넘는다면
    ==> 대문자 Z를 넘어간다면
    6. 90부터 넘어간 차이를 25로 나눈 나머지를 63(대문자 A)부터 shift한다.
    7. 소문자도 동일

 */

class Solution31 {
    public String solution(String s, int n) {
        int new_n = 0;
        char[] chs = s.toCharArray();

        for(int i = 0; i <chs.length; i++){
            if(chs[i] == 32){
                continue;
            }
            if(chs[i] < 91){
                if(chs[i]+n > 90){
                    new_n = (chs[i]+n-90)%25;
                    chs[i] =(char)(64+new_n);
                }else{
                    chs[i] =(char)(chs[i]+n);
                }
            }else{
                if(chs[i]+n > 122){
                    new_n = (chs[i]+n-122)%25;
                    chs[i] =(char)(96+new_n);
                }else{
                    chs[i] =(char)(chs[i]+n);
                }
            }
        }
        return new String(chs);
    }
}