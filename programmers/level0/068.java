// 68. 한 번만 등장한 문자
import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character,Integer> tm = new TreeMap<>();
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(!tm.containsKey(c)){
                tm.put(c,1);
            }else{
                tm.put(c, tm.get(c)+1);
            }
        }
        for(Map.Entry<Character, Integer> entry : tm.entrySet()){
            if(entry.getValue()==1){
                sb.append(entry.getKey());
            }
        }
        return sb.toString();
    }
}