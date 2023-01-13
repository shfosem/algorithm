// 26. 뉴스 클러스터링
import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        Map<String, Integer> strSet1 = getMultiSet(str1.toLowerCase());
        Map<String, Integer> strSet2 = getMultiSet(str2.toLowerCase());
        
        Set<String> keys = new HashSet<>();
        keys.addAll(strSet1.keySet());
        keys.addAll(strSet2.keySet());
        
        int union = 0;
        int inter = 0;
        
        for(String key : keys){
            if(strSet1.containsKey(key) && strSet2.containsKey(key)){
                union += Math.max(strSet1.get(key),strSet2.get(key));
                inter += Math.min(strSet1.get(key),strSet2.get(key));
            }else if(strSet1.containsKey(key)){
                union += strSet1.get(key);
            }else{
                union += strSet2.get(key);
            }
        }
        
        return union==0? 65536 : (int)(inter*65536/union);
    }
    
    Map<String, Integer> getMultiSet(String str){
        Map<String, Integer> rslt = new HashMap<>();
        for(int i=0; i<str.length()-1; i++){
            if(Character.isAlphabetic(str.charAt(i)) && Character.isAlphabetic(str.charAt(i+1))){
                if(rslt.containsKey(str.substring(i,i+2))){
                    rslt.put(str.substring(i,i+2), rslt.get(str.substring(i,i+2))+1);
                }else{
                    rslt.put(str.substring(i,i+2),1);
                }
            }
        }
        
        return rslt;
    }
}