// 77.혼자 놀기의 달인
import java.util.*;
class Solution {
    public int solution(int[] cards) {
        int answer = 0;
        
        boolean[] box = new boolean[101];
        boolean[] visited = new boolean[101];
        for(int card : cards){
            box[card]=true;
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a,b) -> {
                return b-a;
            }
        );
        
        for(int card : cards){
            pq.offer(dfs(cards, box, visited, card));
        }
        
        if(pq.size()>=2){
            int a = (int)pq.poll(), b= (int)pq.poll();
            answer=a*b;
        }            
        
        return answer;
    }
    
    int dfs(int[] cards, boolean[] box, boolean[] visited, int idx){
        if(!box[idx]){ 
            return 0;
        }else{
            if(!visited[idx] && box[cards[idx-1]]){
                visited[idx]= true;
                return 1 + dfs(cards, box, visited, cards[idx-1]);
            }else if(!visited[idx]){
                return 1;
            }
            else
                return 0;
        }
    }
}