//78. 테이블 해시 함수
import java.util.*;
class Solution {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;
        
        PriorityQueue<Tuple> pq = new PriorityQueue<>();
        
        for(int[] d : data){
            pq.offer(new Tuple(d, col-1));
        }
        
        int idx=1;
        while(idx<=row_end){
            if(idx<row_begin){
                pq.poll();
            }
            else{
                Tuple tuple = pq.poll();
                answer = answer ^ tuple.getHashValue(tuple.getData(), idx);
            }
            idx+=1;
        }
        
        return answer;
    }
    
    class Tuple implements Comparable<Tuple>{
        
        private int[] data;
        private int col;
        
        Tuple(int[] d, int col){
            this.data = d;
            this.col = col;
        } 
        
        public int[] getData(){
            return this.data;
        }
        
        public int getHashValue(int[] data, int idx){
            int rslt= 0;
            for(int d : data){
                rslt+= d % idx;
            }
            return rslt;
        }
        
        public int getCol(){
            return this.col;
        }
        
        @Override
        public int compareTo(Tuple o){
           if(this.data[this.col] != o.getData()[o.getCol()]){
               return this.data[this.col] - o.getData()[o.getCol()];
           }else{
               return o.getData()[0] - this.data[0];
           }
        }
            
    }
    
}