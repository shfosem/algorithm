// 35-1. 주식가격
class Solution {
    public int[] solution(int[] prices) {
        final int N = prices.length;
        int[] answer = new int[N];

        for(int i=0; i<N; i++){
            for(int j=i; j<N; j++){
                if(j== N-1)
                   answer[i] = j-i;
                if(prices[i]>prices[j]){
                    answer[i]= j-i;
                    break;
                }
            }
        }
        return answer; 
    }
}