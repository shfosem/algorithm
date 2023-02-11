// 48. 다리를 지나는 트럭
import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();
        
        for(int truck : truck_weights){
            q.add(truck);
        }
        int nowOn = 0;
        int nowWeight = 0;
        Queue<Integer> bridge = new LinkedList<>();
        for(int i=0; i<bridge_length; i++){
            bridge.add(0);
        }
        while(!bridge.isEmpty()){
            answer+=1;
            if(bridge.peek()!=0){
                nowOn-=1;    
            }
            nowWeight-=bridge.poll();  
            if(!q.isEmpty()){
                if(nowOn<bridge_length && nowWeight+q.peek()<=weight){
                    nowWeight+=q.peek();
                    bridge.add(q.poll());
                    nowOn+=1;
                }else if(nowOn<bridge_length){
                    bridge.add(0);
                }
            }  
        }
        return answer;
    }
}