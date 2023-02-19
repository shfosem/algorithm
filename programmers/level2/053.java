// 53. 큰 수 만들기
import java.util.*;
class Solution {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder(number);
        int idx = 0;
        boolean isSame = false;
        while(k>0){
            if(idx==sb.length()-1){
                delete(sb,idx-1);
                k-=1;
                idx-=2;
            }
            if(sb.charAt(idx)>=sb.charAt(idx+1)){
                idx+=1;
                isSame=true;
                continue;
            }
            if(isSame){
                isSame=false;
                if(sb.charAt(idx)> sb.charAt(idx+1)){
                    idx+=1;
                    continue;
                }                   
                sb.deleteCharAt(idx);    
                k-=1;
                idx= idx-2<0? 0 : idx-2;
                continue;
            }
            delete(sb, idx);
            k-=1;
            idx= idx-2<0? 0 : idx-2;
        }
        
        return sb.toString();
    }
    
    void delete(StringBuilder sb, int idx){
        int del = sb.charAt(idx)< sb.charAt(idx+1) ? idx : idx+1;
        sb.deleteCharAt(del);
        return;
    }
}



// 스택 활용 풀이
import java.util.*;
class Solution {
    public String solution(String number, int k) {
        char[] result = new char[number.length() - k];
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<number.length(); i++) {
            char c = number.charAt(i);
            while (!stack.isEmpty() && stack.peek() < c && k-- > 0) {
                stack.pop();
            }
            stack.push(c);
        }
        for (int i=0; i<result.length; i++) {
            result[i] = stack.get(i);
        }
        return new String(result);
    }
}