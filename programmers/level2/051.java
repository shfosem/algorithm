// 51. 쿼드압축 후 개수 세기
class Solution {
    public int[] solution(int[][] arr) {
        final int N = arr.length;
        int[] answer = {0, 0};
        divide(arr,N,0,0,answer);
        return answer;
    }
    
    void divide(int[][] arr, int len, int x, int y, int[] answer){
        int num = arr[x][y];
        if(check(arr,len,x,y)){
            answer[num]+=1;
            return;
        }
        else{
            int divLen = len/2;
            divide(arr, divLen, x,        y,        answer);
            divide(arr, divLen, x+divLen, y,        answer);
            divide(arr, divLen, x,        y+divLen, answer);
            divide(arr, divLen, x+divLen, y+divLen, answer); 
        }
    }
    
    boolean check(int[][] arr, int len, int x, int y){
        int num = arr[x][y];
        for(int i=0; i<len; i++){
            for(int j=0; j<len;j++){
                if(num!=arr[x+i][y+j])
                    return false;
            }
        }
        return true;
    }
}