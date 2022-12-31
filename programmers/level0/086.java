// 86. 유한소수 판별하기
class Solution {
    public int solution(int a, int b) {
        int idx=2;
        while(idx<=Math.min(a,b)){
            if(a%idx==0 && b%idx==0){
                a/=idx;
                b/=idx;
                idx=2;
                continue;
            }
            idx++;
        }
        idx=2;
        while(b>1 && idx<=5){
            if(idx==2){
                if(b%idx==0){
                    b/=idx;
                    continue;
                }
            }
            if(idx==5){
                if(b%idx==0){
                    b/=idx;
                    continue;
                }
            }
            idx++;
        }
        return b>1? 2:1;
    }
   
}