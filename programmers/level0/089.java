// 89. 특이한 정렬
import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        final int OUT_OF_RANGE = -1;
        
        Arrays.sort(numlist);
        int lIdx = OUT_OF_RANGE;
        int rIdx = OUT_OF_RANGE;
        for(int i = 0; i<numlist.length; i++){
            if(numlist[i]>=n){
                rIdx=i;
                if(i==0)
                    break;
                lIdx=i-1; 
                break;
            }
        }
        
        int[] answer = new int[numlist.length];
        if(rIdx==OUT_OF_RANGE){
            for(int i = 0; i< numlist.length; i++){
                answer[numlist.length-1-i]=numlist[i];
            }
            return answer;
        }
        if(lIdx==OUT_OF_RANGE){
            return numlist;
        }
        
        int aIdx=0;
        while(lIdx>=0 || rIdx<numlist.length){
            if(rIdx==numlist.length){//왼쪽만 남았을 경우
                answer[aIdx]=numlist[lIdx];
                aIdx+=1;
                lIdx-=1;
            }
            else if(lIdx==OUT_OF_RANGE){//오른쪽만 남았을 경우
                answer[aIdx]=numlist[rIdx];
                aIdx+=1;
                rIdx+=1;
            }
            else{
                if(numlist[rIdx]-n<=n-numlist[lIdx]){
                    answer[aIdx]=numlist[rIdx];
                    aIdx+=1;
                    rIdx+=1;
                }else{
                    answer[aIdx]=numlist[lIdx];   
                    aIdx+=1;
                    lIdx-=1;
                }
            }
        }
        
        
        return answer;
    }
}