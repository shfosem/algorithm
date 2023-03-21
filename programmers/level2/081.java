// 81. 시소 짝궁
import java.util.*;
class Solution {
    public long solution(int[] weights) {
        long answer = 0;
        Arrays.sort(weights);
        
        HashMap<Double, Integer> hm = new HashMap<>();
        
        for(int weight : weights){
            
            double w = Double.valueOf(weight);
            answer += hm.getOrDefault(w, 0);
            hm.put(w, hm.getOrDefault(w,0)+1);
            for(int i=4; i>=2; i--){
                hm.put(w*i/(i-1), hm.getOrDefault(w*i/(i-1),0)+1);    
            }
            
        }
        
        /*for(int i=0; i<weights.length-1; i++){
            for(int j=i+1; j<weights.length; j++){
              
              if(weights[i]==weights[j]){
                   answer+=1;
                   continue;
               }else if(4*weights[i] == 3*weights[j]){
                   answer+=1;
                   continue;
               }else if(3*weights[i]==2*weights[j]){
                   answer+=1;
                   continue;
               }else if(2*weights[i]<weights[j]){
                   break;
               }else if(2*weights[i]==weights[j]){
                   answer+=1;
                   continue;
               }
               
            }
        }*/
        
        return answer;
    }
}