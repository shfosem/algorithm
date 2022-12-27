//65. 가까운 수
import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int idx=0;
        for(idx=0;idx<array.length;idx++){
            if(n<array[idx]){
                break;
            }
        }
        if(idx==0)
            return array[idx];
        if(idx==array.length)
            return array[idx-1];
        if(n-array[idx-1]==array[idx]-n || n-array[idx-1]<array[idx]-n){
            return array[idx-1];
        }else {
            return array[idx];
        }
    }
}