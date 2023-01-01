// 100. 옹알이 (1)
class Solution {
    public int solution(String[] babbling) {
        String[] canSpk = {"aya", "ye", "woo", "ma"};
        
        int answer = 0;
        for(String s: babbling){
            int[] cnt = {0,0,0,0};
            for(int i=0; i<4; i++){
                s= s.replace(canSpk[i], String.valueOf(i));
            }
            try{ 
                int n = Integer.parseInt(s);
                answer+=1;
            }
            catch(Exception e){
                continue;
            }
               
        }

        return answer;
    }
}