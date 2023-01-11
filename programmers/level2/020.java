// 20. 괄호 회전하기
import java.util.*;

class Solution {
    public int solution(String s) {
        final int LEN = s.length();
        StringBuilder sb = new StringBuilder(s);
        sb.append(s);
        
        int answer = 0;
        for(int i = 0 ; i< LEN; i++){
            if(isCorrect(sb.toString().substring(i,i+LEN)))
                answer+=1;
        }
        return answer;
    }
    boolean isCorrect(String s){
        if (s.length()%2!=0)
            return false;
        
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                st.push(s.charAt(i));
            }else if(st.empty()){
                return false;
            }
            else if(s.charAt(i)==')'){
                if(st.peek()=='('){
                    st.pop();
                }else{
                    return false;
                }
            }else if(s.charAt(i)=='}'){
                if(st.peek()=='{'){
                    st.pop();
                }else{
                    return false;
                }
            }else{ // case : ] 
                if(st.peek()=='['){
                    st.pop();
                }else{
                    return false;
                }
            }
        }
        
        return st.empty();
    }
}