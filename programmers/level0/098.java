// 98. 겹치는 선분의 길이
class Solution {
    public int solution(int[][] lines) {
        int[] comLine = new int[201];
        
        int answer = 0;
        answer += getComLength(lines[0],lines[1]);
        answer += getComLength(lines[0],lines[2]);
        answer += getComLength(lines[1],lines[2]);
        
        for(int[] line : lines){
            for(int i= line[0]; i<=line[1]; i++){
                comLine[i+100]+=1;
            }
        }
        
        int comThr = 0;
        boolean started=false;
        for(int com : comLine){
            if(com>2){
                if(started){
                    comThr+=1;
                }else{
                    started=true;
                }
            }else{
                started=false;
            }
        }
        answer -= comThr * 2;
        return answer;
    }
    
    int getComLength(int[] a, int[] b){
        int strt = Math.max(a[0],b[0]);
        int end = Math.min(a[1],b[1]);
        if(end-strt < 0)
            return 0;
        else{
            return end-strt;
        }   
    }
}