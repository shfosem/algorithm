// 70. 점 찍기
class Solution {
    public long solution(int k, int d) {
        long answer = 0;
         
        for(long i=0; i<=d; i+=k){
            answer +=(long)Math.sqrt((long)d*d-i*i)/(long)k+1;
        }        
        return answer;
    }
}