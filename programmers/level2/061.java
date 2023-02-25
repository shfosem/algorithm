// 61. 숫자 변환하기
import java.util.*;
class Solution {
    public int solution(int x, int y, int n) {
        
        Queue<int[]> q = new LinkedList<>();
        
        q.offer(new int[] {x,0});
        while(!q.isEmpty()){
            int[] a = q.poll();
            if(a[0]==y)
                return a[1];
            else if(a[0]>y){
                continue;
            }
            q.offer(new int[] {a[0]*3, a[1]+1});    
            q.offer(new int[] {a[0]*2, a[1]+1});    
            q.offer(new int[] {a[0]+n, a[1]+1});
        }
        return -1;
    }
}