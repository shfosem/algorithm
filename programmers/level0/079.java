// 79. 외계어 사전
import java.util.*;
class Solution {
    public int solution(String[] spell, String[] dic) {
        Arrays.sort(spell);
        for(String s : dic){
            String[] tmp = s.split("");
            Arrays.sort(tmp);
            if(String.join("",spell).equals(String.join("",tmp)))
                return 1;
        }
        return 2;
    }
}