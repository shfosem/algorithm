// 15. 점프와 순간이동
import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        while(n>0){
            if(n%2==0)
                n/=2;
            else{
                n-=1;
                ans+=1;
            }
        }

        return ans;
    }
}