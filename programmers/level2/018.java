// 18. 캐시 
import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        ArrayList<String> cache = new ArrayList<>();
        for(String city : cities){
            if(cache.indexOf(city.toLowerCase())==-1){
                answer+=5;
                cache.add(city.toLowerCase());
                if(cache.size()>cacheSize)
                    cache.remove(0);
            }else{
                answer +=1;
                cache.remove(city.toLowerCase());
                cache.add(city.toLowerCase());
            }
        }
        return answer;
    }
}