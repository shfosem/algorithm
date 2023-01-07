// 6. 숫자의 표현
class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i+=2){
            if(n%i==0)
                answer+=1;            
        }
        return answer;
    }
}