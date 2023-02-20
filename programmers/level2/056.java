// 56. 롤 케이크 자르기
import java.util.*;
class Solution {
    public int solution(int[] topping) {   

        final int LEN = topping.length;
        boolean isFind = false;
        int l = 0 , r = LEN;
        int idx = (l+r)/2;
        int left = getTypeCnt(topping,0,idx), right = getTypeCnt(topping, idx+1, LEN-1);
        while(!isFind && l <= r){
            if(left == right)
                isFind=true;
            else if (left < right)
                l = idx+1;
            else
                r = idx-1;
            
            idx = (l+r)/2;
            left = getTypeCnt(topping,0,idx); 
            right = getTypeCnt(topping,idx+1, LEN-1);
        }
        int answer = 0;
        if(l>r)
            return answer;
        answer=1;
        HashMap<Integer, Integer> james = getCake(topping, 0, idx);
        HashMap<Integer, Integer> brother = getCake(topping, idx+1, LEN-1);
        
        for(int i = idx; i>=0; i--){
            if(james.get(topping[i])==1)
                break;
            if(!brother.containsKey(topping[i])){
                break;
            }
            answer+=1;
            james.put(topping[i], james.get(topping[i])-1);
        }
        
        for(int i=idx+1; i<LEN; i++){
            if(brother.get(topping[i])==1)
                break;
            if(!james.containsKey(topping[i])){
                break;
            }
            answer+=1;
            brother.put(topping[i], brother.get(topping[i])-1);
        }
        
        return answer;
    }
    
    public int getTypeCnt(int[] topping, int strt, int end){
        HashMap<Integer, Integer> type = new HashMap<>();
        for(int i= strt; i<=end; i++){
            type.put(topping[i], type.getOrDefault(topping[i],0)+1);
        }
        return type.size();
    }
    public HashMap getCake(int[] topping, int strt, int end){
        HashMap<Integer, Integer> cake = new HashMap<>();
        for(int i= strt; i<=end; i++){
            cake.put(topping[i], cake.getOrDefault(topping[i],0)+1);
        }
        return cake;
    }
}