// 63. 줄서는 방법
class Solution {
    public int[] solution(int n, long k) {
        int[] answer = new int[n];
        boolean[] visited = new boolean[n+1];
        for(int i=n-1; i>=0; i--){
            long div = factorial(i);
            if(k%div!=0 && div!=1) {
                int nextNum = getNextNum((int)(k/div), n, visited);   
                answer[n-1-i]= nextNum;
                visited[nextNum]=true;
                if(div>1)
                    k=k%div;
           }else{
                if(k%div==0){
                    int nextNum = getNextNum((int)(k/div)-1, n, visited);       
                    answer[n-1-i]= nextNum;
                    visited[nextNum]=true;
                    for(int j = n-1-i+1; j<n; j++){
                        for(int q=n; q>0; q--){
                            if(!visited[q]){
                                answer[j]=q;
                                visited[q]=true;
                                break;
                            }
                        }
                    }
                    break;
                }
               int nextNum = getNextNum((int)k-1, n, visited);
               answer[n-1-i] = nextNum;
               visited[nextNum] = true;
            }
       }
        
        return answer;
    }
    
    long factorial(int n){
        long rslt = 1;
        if(n<2)
            return rslt;
        for(int i=2; i<=n; i++){
            rslt*=i;
        }
        return rslt;
    }
    
    int getNextNum(int idx, int n, boolean[] visited){
        int rslt = 0;
        for(int i=1; i<=n; i++){
            if(visited[i])
                continue;
            if(idx==0){
                rslt=i;
                break;
            }
            idx-=1;
        }
        return rslt;
    }
}