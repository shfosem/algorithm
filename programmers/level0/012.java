// 12. 양꼬치
class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        answer += 12000*n;
        int service = n/10;
        if(service>k)
            return answer;
        else{
            k-=service;
            answer+=2000*k;
        }
        return answer;
    }
}