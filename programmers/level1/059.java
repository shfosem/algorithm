// 59. 숫자 짝궁
class Solution {
    public String solution(String X, String Y) {
        int[][] numCnt = new int[10][2];
        
        for(int i=0; i<X.length();i++){
            numCnt[Character.getNumericValue(X.charAt(i))][0]+=1;
        }
        for(int i=0; i<Y.length();i++){
            numCnt[Character.getNumericValue(Y.charAt(i))][1]+=1;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=9; i>=0; i--){
            for(int j=0; j<Math.min(numCnt[i][0], numCnt[i][1]); j++){
                sb.append(i);
            }
        }
        if(sb.length()==0){
            return "-1";
        }
        if(sb.charAt(0)=='0'){
            return "0";
        }
        return sb.toString();
    }
}