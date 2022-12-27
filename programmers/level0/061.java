// 61. 모스부호(1)
import java.util.*;
class Solution {
    public String solution(String letter) {
        String[] letters = letter.split(" ");
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        StringBuilder sb = new StringBuilder();
        for(String s : letters){
            for(int i=0; i<morse.length;i++){
                if(s.equals(morse[i])){
                    sb.append((char)('a'+i));
                }
            }
        }
        return sb.toString();
    }
}