// 44. 모음사전
import java.util.*;
class Solution {
    static ArrayList<String> arr = new ArrayList<>();
    static char[] ch = {'A', 'E', 'I', 'O', 'U'};
    public int solution(String word) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        insert(sb,0);
        return arr.indexOf(word);
    }
    void insert(StringBuilder sb, int len){
        arr.add(sb.toString());
        if(len==5){
            return;
        }else{
            for(int i=0; i<5; i++){
                insert(sb.append(ch[i]),len+1);
                sb.deleteCharAt(sb.length()-1);                
            }
        }
    }
}