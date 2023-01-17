// 35. 주식가격
import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        final int N = prices.length;
        int[] answer = new int[N];
        Queue<Integer> q = new LinkedList<>();
        for(int p : prices){
            q.add(p);
        }
        
        int idx=0;
        while(!q.isEmpty()){
            int day = 0;
            for(int i = idx; i<N; i++){
                if(q.peek()>prices[i]){
                    answer[idx++]=day;
                    q.poll();
                    break;
                }
                else if(i==N-1){
                    answer[idx++]=day;
                    q.poll();
                }
                else{
                day+=1;
                }
                
            }
            
        }
        return answer;
    }
}