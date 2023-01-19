// 39. 땅따먹기
class Solution {
    int solution(int[][] land) {
        final int N = land.length;    
        int[][] dp = new int[N][4];
        for(int i=0;i<4; i++){
            dp[0][i]= land[0][i];
        }
        for(int i=1 ; i<N; i++){
            for(int j=0; j<4; j++){
                for(int k=0; k<4; k++){
                    if(k!=j){
                        dp[i][j]=Math.max(dp[i-1][k]+land[i][j],dp[i][j]);
                    }
                }
            }
        }
        int answer =0;
        for(int i=0; i<4; i++){
            answer = Math.max(answer,dp[N-1][i]);
        }
        return answer;
    }
}