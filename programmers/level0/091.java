// 91. 최빈값 구하기

import java.util.*;
import java.util.stream.*;
class Solution {
    public int solution(int[] array) {
       int[] cnt = new int[1000];
        for(int i : array){
            cnt[i]+=1;
        }
        int maxCnt=0;
        
        for(int c : cnt){
            if(maxCnt<c)
                maxCnt=c;
        }
        
        int maxCntVal=0;
        for(int c: cnt){
            if(c==maxCnt)
                maxCntVal+=1;
            if(maxCntVal>1)
                return -1;
        }
        
        ArrayList<Integer> lst = new ArrayList<>();
        for(int c : cnt){
            lst.add(c);
        }
        return lst.indexOf(maxCnt);
        }
}