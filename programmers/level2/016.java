// 16. 멀리 뛰기
class Solution {
    public int solution(int n) {
        final int DIV = 1234567;
        int[] dp = new int[n+1];
        for(int i=1; i<=n; i++){
            if(i<3)
                dp[i]=i;
            else{
                dp[i]=(dp[i-1]+dp[i-2])% DIV;
            }
        }
        return dp[n];
    }
}