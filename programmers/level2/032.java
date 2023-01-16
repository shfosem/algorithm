// 32. 더 맵게
import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int sco : scoville){
            pq.add(sco);
        }
        
        while(pq.peek()<K){
            try{
            int first = pq.poll();
            int second = pq.poll();
            pq.add(first + second*2);
            answer+=1;
            }catch(Exception e){
                answer=-1;
                break;
            }
        }
        return answer;
    }
}