// 10. 짝지어 제거하기
import java.util.*;
class Solution
{
    public int solution(String s)
    {
        Stack<Character> st = new Stack<>();
        int idx=0;
        while(idx<s.length()){
            if(!st.empty()){
                if(s.length()-idx < st.size())
                    break;
                
                if(st.peek() == s.charAt(idx)){
                    st.pop();
                    idx+=1;
                    continue;
                }else{
                    st.push(s.charAt(idx));
                    idx+=1;
                    continue;
                }
            }else{
                st.push(s.charAt(idx));
                idx+=1;
            }
            
        }
        return st.empty()? 1: 0;
    }
}