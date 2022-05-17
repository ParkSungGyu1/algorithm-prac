public class Main {
    public String solution(int month, int day) {
        int[] my_day = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        int left_day = 98 - (my_day[month]-day);
        month += 1;
        while(true){
            if(left_day - my_day[month] < 0){
                break;
            }
            left_day -=  my_day[month];
            month += 1;
            if(month > 12){
                month = 1;
            }
        }
        String answer = Integer.toString(month)+"월 "+Integer.toString(left_day)+"일";
        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        System.out.println(method.solution(1, 18));
    }
}