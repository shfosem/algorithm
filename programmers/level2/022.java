// 22. 튜플
import java.util.*;

class Solution {
    public int[] solution(String s) {
        s=s.replace("{", "");
        s=s.replace("}", "");
        
        // <원소, 등장횟수>
        Map<Integer, Integer> hm  = new HashMap<>();
        for(String num : s.split(",")){
            int n = Integer.parseInt(num);
            if(hm.containsKey(n)){
                hm.put(n, hm.get(n)+1);
            }else{
                hm.put(n, 1);
            }
        }
        
        // <등장횟수, 원소> & TreeMap 정렬
        //Map<Integer, Integer> tm = new TreeMap<>();
        // >> 정렬할 필요 없이 value로 index 얻을 수 있음!
        int[] answer = new int[hm.size()];
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            answer[hm.size()-entry.getValue()]=entry.getKey();
            //tm.put(entry.getValue(), entry.getKey());
        }
        return answer;
     
        
        
    }
}