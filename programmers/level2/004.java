// 4. 올바른 괄호
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int state =0;
        if(s.length()%2!=0)
            return false;
            
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(')
                state+=1;
            else{
                state-=1;
                if(state<0)
                    return false;
            }
        }
        return state==0;
    } 
}
    