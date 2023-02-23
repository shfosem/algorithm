//59. 행렬 테두리 회전하기
import java.util.*;
class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        TreeSet<Integer> ts = new TreeSet<>();
        
        int[][] matrix = new int[rows][columns];
        int num = 1;
        for(int i=0;i<rows; i++){
            for(int j=0; j<columns; j++){
                matrix[i][j]=num;
                num+=1;
            }
        }
        
        int[] answer = new int[queries.length];
        
        for(int i=0; i<queries.length; i++){
            answer[i] = rotate(matrix, queries[i], rows*columns+1);
        }
        
        return answer;
    }
    
    public int rotate(int[][] matrix, int[] query, int max){
        int min = max;
        
        int[] strt = {query[0]-1, query[1]-1}, end = {query[2]-1, query[3]-1};
        
        int[] now = strt;
        int preValue = matrix[now[0]][now[1]];
        now=getNext(now, strt, end);
        int tempValue = matrix[now[0]][now[1]];
        while(!isSame(strt, now)){
            if(preValue<min){
                min=preValue;
            }
            matrix[now[0]][now[1]] = preValue;
            preValue= tempValue;
            now=getNext(now, strt, end);
            tempValue=matrix[now[0]][now[1]];
        }
        if(preValue<min){
                min=preValue;
            }
        matrix[now[0]][now[1]] = preValue;
        return min;
    }
    public int[] getNext(int[] now, int[] strt, int[] end){
        
        if(now[0]==strt[0] && now[1]<end[1])
            return new int[] {now[0], now[1]+1};
        if(now[1]==end[1] && now[0]< end[0])
            return new int[]  { now[0]+1, now[1]};
        if(now[0]==end[0] && now[1]>strt[1])
            return new int[] {now[0], now[1]-1};
        else //(now[1]==strt[1] && now[0]>strt[0])
            return new int[] {now[0]-1, now[1]};
       
            
        
    }
    
    boolean isSame(int[] left, int[] right){
        boolean rslt = true;
        for(int i=0; i<2; i++){
            if(left[i]!=right[i]){
                rslt=false;
                break;
            }
        }
        return rslt;
    }
}