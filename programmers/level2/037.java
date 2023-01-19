// 37. n진수 게임
class Solution {
    public String solution(int n, int t, int m, int p) {        
        int num = 0;
        StringBuilder sb = new StringBuilder();
        while(sb.toString().length()<t*m+p){
            sb.append(getNnum(n, num++));
        }
        
        StringBuilder answer = new StringBuilder();
        for(int i=0; i<t; i++){
            answer.append(sb.charAt(getCallIdx(i,m,p)));
        }
        return answer.toString();
    }
    
    String getNnum(int n, int num){
        if (num==0)
            return "0";
        StringBuilder sb = new StringBuilder();
        while(num>0){
            
            if(num%n<10){
                sb.append(num%n);
            }else{
                sb.append((char)(num%n - 10 + (int)'A'));
            }
            num/=n;
        }
        return sb.reverse().toString();
    }
    
    int getCallIdx(int t, int m, int p){
        return t*m+p-1;
    }
}