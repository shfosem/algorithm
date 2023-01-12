// 23. 기능개발
import java.util.*;
class Solution {
    public ArrayList solution(int[] progresses, int[] speeds) {
        final int COMPLETE = 100;
        ArrayList<Integer> answer = new ArrayList<>();
        int idx = 0;
        int total = 0;
        //날짜 설정 나누기로 증발되는 것 고려..
        int day = (COMPLETE-progresses[0])%speeds[0]==0?
            (COMPLETE-progresses[0])/speeds[0] : (COMPLETE-progresses[0])/speeds[0]+1;
        
        int cnt = 0;
        while(idx<progresses.length){
            for(int i=idx; i<progresses.length; i++){
                progresses[i]+= day*speeds[i];
            }            
            
            for(int i=idx; i<progresses.length; i++){
                if(progresses[i]>=COMPLETE){
                    cnt+=1;
                    total+=1;
                }else{
                    idx=i;
                    answer.add(cnt);
                    day = (COMPLETE - progresses[i]) % speeds[i] == 0 ? 
                          (COMPLETE-progresses[i])/speeds[i] 
                        : (COMPLETE-progresses[i])/speeds[i] + 1;   
                    cnt=0;
                    break;
                }
            }
            if(total == progresses.length)
                break;
        }
        if(cnt!=0)
            answer.add(cnt);
        
        return answer;
    }
}