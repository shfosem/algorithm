// 46. 2 x n 타일링
class Solution {
    public int solution(int n) {
        final int DIV = 1000000007;
        int answer = 0;
        
        int dp[] = new int[60001];
        dp[1]=1;
        dp[2]=2;
        for(int i=3; i<=n; i++){
            dp[i]= (dp[i-1]+dp[i-2])%DIV;
        }
        return dp[n];
    }
}