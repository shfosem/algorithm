// 25. 프린터
import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int[] order = new int[10];
        LinkedList<Paper> que = new LinkedList<>();
        
        for(int i = 0 ; i< priorities.length; i++){
            order[priorities[i]]+=1;
            que.add(new Paper(i, priorities[i]));
        }
        
        int answer=1;
        int ordIdx=9;
        while(!que.isEmpty()){
            if(order[ordIdx]<=0){
                ordIdx-=1;
                continue;
            }
            
            if(ordIdx==que.peek().getPriority()){
                if(que.peek().getIdx()==location){
                    break;
                }
                else{
                    que.poll();
                    answer+=1;
                    order[ordIdx]-=1;
                    continue;
                }
            }else{
                que.add(que.peek());
                que.poll();
            }   
        }
        return answer;
    }
    
     class Paper{
        private int priority;
        private int index;
        
        public Paper(int index, int priority){
            this.index = index;
            this.priority = priority;
        }
        
        public int getIdx(){
            return this.index;
        }
        public int getPriority(){
            return this.priority;
        }
    }
}