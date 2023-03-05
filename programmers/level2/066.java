// 66. 전력망을 둘로 나누기
// union-find
import java.util.*;
class Solution {
    static int[] root = new int[101];
    public int solution(int n, int[][] wires) {
             
        int answer = n;
    
        for(int i=0; i<wires.length; i++){
            answer = Math.min(answer, getSub(n,wires,i));
        }
        
        return answer;
    }
    int getSub(int n, int[][] wires, int idx){
        for(int i=1; i<=n; i++){
            root[i]=i;
        }
        
        for(int i=0; i<wires.length; i++){
            if(i==idx)
                continue;
            union(wires[i][0], wires[i][1]);
        }
        
        int cntA=0, cntB=0;
        for(int i=1; i<=n;i++){
            if(find(1)==find(i))
                cntA+=1;
            else
                cntB+=1;
        }
        
        return Math.abs(cntA-cntB);
    }
    
    int find(int x){
        if(root[x]==x)
            return x;
        else{
            return root[x] = find(root[x]);
        }
            
    }
    void union(int x, int y){
        x=find(x);
        y=find(y);
        if(x==y)
            return;
        root[y]=x;
    }
}