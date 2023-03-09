// 071. 하노이의 탑
import java.util.*;
class Solution {
    static ArrayList<int[]> answer = new ArrayList<>();
    public ArrayList solution(int n) {
        hanoi(1,3,2,n);
        return answer;
    }
    
    void hanoi(int strt, int end, int sub, int n){
        
        if(n==1){
           answer.add(new int[]{strt, end}); 
        }else{
            hanoi(strt, sub, end, n-1);
            answer.add(new int[] {strt, end});
            hanoi(sub, end, strt, n-1);
        }
        
    }
}