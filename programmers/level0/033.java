// 33. 순서쌍의 개수
import java.util.stream.*;
class Solution {
    public int solution(int n) {
        return (int)IntStream.rangeClosed(1,n).filter(i -> n%i==0).count();
        /*int answer = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0)
                answer+=1;
        }
        return answer;*/
    }
}