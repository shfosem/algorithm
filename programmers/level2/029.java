// 29. 귤 고르기
import java.util.*;
class Solution {    
    public int solution(int k, int[] tangerines) {
        int answer = 0;
        Map<Integer, Integer> tm = new TreeMap<>();
        
        for(int t : tangerines){
            if(tm.containsKey(t))
                tm.put(t,tm.get(t)+1);
            else
                tm.put(t,1);
        }        
        int[] sizes = tm.values().stream().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
        for(int i=0; i<sizes.length ; i++){
            k-=sizes[i];
            answer+=1;
            if(k<=0)
                break;
        }
        

        return answer;
    }
}