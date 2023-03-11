// 72. 무인도 여행
import java.util.*;
class Solution {
    public int[] solution(String[] maps) {
        int[][] iMap = new int[maps.length][maps[0].length()];
        for(int i=0 ;i<maps.length; i++){
            for(int j=0; j<maps[0].length(); j++){
                if(maps[i].charAt(j)=='X')
                    iMap[i][j]=-1;
                else{
                    iMap[i][j]=Character.getNumericValue(maps[i].charAt(j));
                }
            }
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<maps.length; i++){
            for(int j=0; j<maps[0].length(); j++){
                if(iMap[i][j]==-1 || iMap[i][j]==0)
                    continue;
                pq.offer(dfs(iMap, i, j));
            }
        }
        
        if(pq.size()==0)
            return new int[] {-1};
        
        int[] answer = new int[pq.size()];
        int idx=0;
        while(!pq.isEmpty()){
            answer[idx++]=pq.poll();
        }
        return answer;
    }
    static int[] dx = {0, 1, -1 ,0};
    static int[] dy = {-1, 0, 0 , 1};
    
    int dfs(int[][] maps, int x, int y){
        if(maps[x][y]==-1){
            return 0;
        }else{
            int rslt =  maps[x][y];
            maps[x][y]=-1;
            for(int i=0 ; i < 4; i++){
                if(x+dx[i]>=0 && y+dy[i]>=0 && x+dx[i]< maps.length && y+dy[i]<maps[0].length)
                    rslt+=dfs(maps,x+dx[i], y+dy[i]);
            }
            return rslt;       
        }
    }
}