// 75. 소인수 분해
import java.util.*;
class Solution {
    public ArrayList solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        int div = 2;
        while(n>1){
            if(n%div==0){
                if(answer.indexOf(div)==-1){
                    answer.add(div);
                }
                n/=div;
            }else{
                div++;
            }
        }
        return answer;
    }
}