// 8. 다음 큰 숫자
class Solution {
    public int solution(int n) {
        int ONES = 0;
        for(char c : Integer.toString(n,2).toCharArray()){
            if(c=='1')
                ONES+=1;
        }
        while(++n>0){
            int nextOnes = 0;
            for(char c : Integer.toString(n,2).toCharArray()){
            if(c=='1')
                nextOnes+=1;
            }
            if(ONES==nextOnes)
                break;
        }
        return n;
    }
}