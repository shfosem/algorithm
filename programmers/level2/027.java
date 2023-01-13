// 27. 전화번호 목록
import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        Arrays.sort(phone_book, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                return Integer.compare(s1.length(),s2.length());
            }
        });
        
        Set<String> prefix = new HashSet<>();
        int len = phone_book[0].length();
        
        for(String phone : phone_book){
            if(!answer)
                break;
            
            prefix.add(phone);
            
            for(int i=len; i<phone.length(); i++){
                if(prefix.contains(phone.substring(0,i))){
                    answer=false;
                    break;
                }     
            }
        }       
        
        return answer;
    }
}
/*
for(String pre : prefix){
            if(!answer)
                break;
            for(String pre2 : prefix.tailSet(pre, false)){
                if(pre2.startsWith(pre)){
                    answer=false;
                    break;
                }
            } 
        }
*/
/*Arrays.sort(phone_book, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                return Integer.compare(s1.length(),s2.length());
            }
        });
*/