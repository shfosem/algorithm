//64. 택배상자
import java.util.*;
class Solution {
    public int solution(int[] order) {
        
        int answer = 0;
        int idx = 0;
        Stack<Integer> s = new Stack<>();
        for(int i=1; i<=order.length; i++){
            if(order[idx]==i){
                answer+=1;
                idx+=1;
                continue;
            }
            while(!s.isEmpty()){
                if(s.peek()==order[idx]){
                    answer+=1;
                    idx+=1;
                    s.pop();
                }else{
                    break;
                }  
            }
            s.push(i);
        }
        
        while(!s.isEmpty()){
            if(s.peek()==order[idx]){
                answer+=1;
                idx+=1;
                s.pop();
                }else{
                    break;
                }  
            }
       
        return answer;
    }
}