// 31. 압축 
import java.util.*;

class Solution {
    public ArrayList solution(String msg) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<String, Integer> dict = new HashMap<>();
        
        for(int i =0; i<26; i++){
            dict.put(String.valueOf((char)('A'+i)),i+1);
        }
        
        int dictIdx=27;
        int idx = 0;
        while(idx<msg.length()){
            int temp=1;
            for(int i = 1; i<msg.length()-idx+1; i++){
                String tmpKey = msg.substring(idx,idx+i);
                if(idx+i==msg.length()){ // 마지막 긴 단어가 사전에 있을 경우
                    if(dict.containsKey(tmpKey)){
                        answer.add(dict.get(tmpKey));
                        return answer;
                    }
                }
                if(!dict.containsKey(tmpKey)){
                    dict.put(tmpKey, dictIdx++);
                    temp=i-1;
                    break;
                }
            }
            answer.add(dict.get(msg.substring(idx,idx+temp)));
            idx+=temp;
        }
        return answer;
    }
}