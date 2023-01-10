// 17. H-Index
import java.util.*;
class Solution {
    public int solution(int[] citations) {
        if(citations.length==1)
            return citations[0];
        
        Arrays.sort(citations);
        final int MAX = citations[citations.length-1];
        
        
        int[] nums = new int [MAX+1];
        for(int i = citations.length-1; i>=0; i--){
            nums[citations[i]]+=1;
        }
        
        for(int i=MAX; i>0; i--){
            if(i==MAX)
                continue;
            nums[i]=nums[i]+nums[i+1];
        }
        int answer = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i]>=i){
                answer = i;     
            }
        }
        return answer;
    }
}