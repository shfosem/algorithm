// 33. 피로도 (Upgrade)
import java.util.*;
class Solution {
        static int answer = 0;
    public int solution(int k, int[][] dungeons) {
        final int N = dungeons.length; 
        boolean[] visited = new boolean[N];
        int[][] output= new int[N][2];

        search(k, dungeons, 0, visited);
        
        return answer;
    }
    
    void search(int k,int[][] dungeons, int cnt, boolean[] visited){
        for(int i=0; i<dungeons.length; i++){
            if(!visited[i] && dungeons[i][0]<=k){
                visited[i]=true;
                search(k-dungeons[i][1], dungeons, cnt+1, visited);
                visited[i]=false;
            }
        }
        answer=Math.max(answer,cnt);
    }
}