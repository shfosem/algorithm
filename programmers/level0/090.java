// 90. 저주의 숫자 3
class Solution {
    public int solution(int n) {
        int answer = 1;
        int idx = 1;
        while(true){
            if(answer%3==0 || String.valueOf(answer).contains("3")){
                answer+=1;
                continue;
            }
            if(idx==n)
                break;
            answer+=1;
            idx+=1;
        }
        
        return answer;
    }
}