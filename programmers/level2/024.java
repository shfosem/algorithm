// 24. n^2 배열 자르기
class Solution {
    public int[] solution(int n, long left, long right) {
        final int LEN = (int)(right - left) + 1;
        int[] answer = new int[LEN];
        
        for(int i = 0; i< LEN; i++){
            answer[i]= getNum((long)i+left, n);
        }
        
        return answer;
    }
    
    int getNum(long idx, int n){
        if(idx%n < idx/n)
            return (int)(idx/n)+1;
        else
            return (int)(idx%n)+1;
            
    }
}