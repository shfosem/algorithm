// 21. 위장
import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
    
        final int TYPE = 1;
        Map<String, Integer> hm = new HashMap<>();
        for(String[] cloth : clothes){
            if(hm.containsKey(cloth[TYPE])){
                hm.put(cloth[TYPE], hm.get(cloth[TYPE])+1);    
            }else{
                hm.put(cloth[TYPE], 1);    
            }
        }
        
        int answer=1;
        for(Integer i :hm.values()){
            answer *= (i+1);
        }
        
        return answer-1;
    }
}