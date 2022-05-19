import java.util.*;

public class Main {
    public String[] solution(String[] arr, int n) {
        String[] answer = {};
        String garb = "";
        Arrays.sort(arr);
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> garbList = new ArrayList<>();

        for(String item : arr){
            if(!arrayList.contains(item))
                arrayList.add(item);
            else{
                garbList.add(item);
            }
        }

        arrayList.removeAll(garbList);

        for(int i = 1; i < arrayList.size(); i++){
            for(int j = 0; j < arrayList.size() - i; j++){
                if(arrayList.get(j).charAt(n) > arrayList.get(j+1).charAt(n)){
                    garb = arrayList.get(j);
                    arrayList.set(j,arrayList.get(j+1));
                    arrayList.set(j+1,garb);
                }
            }


        }
        answer = new String[arrayList.size()];
        int size=0;

        for(String temp : arrayList){
            answer[size++] = temp;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        String[] arr = {"coke", "water", "glass", "dog", "dog", "yogurt", "vitamin"};
        int n = 2;
        System.out.println(Arrays.toString(method.solution(arr, n)));
    }
}