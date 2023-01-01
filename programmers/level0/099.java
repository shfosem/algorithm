//99. 평행
import java.util.*;
class Solution {
    public int solution(int[][] dots) {
        Map<Double, Integer> hm = new HashMap<>();
        
        for(int i=0;i<dots.length-1; i++){
            for(int j=i+1; j<dots.length; j++){
                if(hm.containsKey(getGradient(dots[i],dots[j])))
                    return 1;
                else
                    hm.put(getGradient(dots[i],dots[j]),1);
            }
        }
        return 0;
    }
    
    double getGradient(int[] a, int[] b){
        return (double)(b[1]-a[1])/(b[0]-a[0]);
    }
}