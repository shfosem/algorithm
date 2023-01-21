// 42. 할인 행사
import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String, Integer> goal = new HashMap<>();
        HashMap<String, Integer> buying = new HashMap<>();
        
        for(int i=0; i<want.length; i++){
            goal.put(want[i],number[i]);
        }
        
        for(int i=0; i< discount.length; i++){
            if(i<10){
                buying.put(discount[i], buying.getOrDefault(discount[i],0)+1);
                if(i==9){
                    if(isSignIn(goal, buying))
                        answer+=1;
                }
            }else{
                buying.put(discount[i-10], buying.get(discount[i-10])-1);
                buying.put(discount[i], buying.getOrDefault(discount[i],0)+1);
                if(isSignIn(goal, buying))
                        answer+=1;
            }
        }
        return answer;
    }
    
    boolean isSignIn(HashMap<String,Integer> goal, HashMap<String,Integer> buying){
        boolean rslt = true;
        for(String s : goal.keySet()){
            if(goal.get(s)!=buying.get(s)){
                rslt= false;
                break;
            }
        }
        return rslt;
    }
}