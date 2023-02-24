// 60. 뒤에 있는 큰 수 찾기
import java.util.*;
// >> 이중 for 문 시 시간 초과
class Solution {
    public int[] solution(int[] numbers) {
        final int N = numbers.length;
        int[] answer = new int[N];
        Stack<Num> st = new Stack<>();
        
        for(int i=0; i<N; i++){
            if(st.isEmpty()){
                st.push(new Num(i, numbers[i]));
            }else{
                while(!st.isEmpty() && st.peek().getValue()<numbers[i] ){
                    answer[st.pop().getIdx()]=numbers[i];
                }
                st.push(new Num(i, numbers[i]));
            } 
        }
        
        while(!st.isEmpty()){
            answer[st.pop().getIdx()] = -1;
        }
        return answer;
    }
    class Num{
        private int value;
        private int idx;
        
        Num(int idx, int value){
            this.idx = idx;
            this.value = value;
        }
        
        public int getValue(){
            return this.value;
        }
        
        public int getIdx(){
            return this.idx;
        }
    }
}