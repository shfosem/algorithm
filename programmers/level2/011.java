// 11. 영어 끝말잇기
import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        char last = words[0].charAt(0);
        Set<String> spoken = new HashSet<>();
        
        for(int i=0; i<words.length; i++){
            if(words[i].length()==1 || spoken.contains(words[i]) || last != (words[i].charAt(0))){
                answer[0]=(i%n)+1;
                answer[1]=(i/n)+1;
                break;
            }else{
                spoken.add(words[i]);
                last = words[i].charAt(words[i].length()-1);
            }
        }
        return answer;
    }
}