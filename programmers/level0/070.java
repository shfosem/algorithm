//70. 이진수 더하기
class Solution {
    public String solution(String bin1, String bin2) {
        return getBinStr(getBinNum(bin1)+getBinNum(bin2));
    }
    
    static int getBinNum(String s){
        int rslt = 0;
        for(int i=0; i<s.length(); i++){
            rslt += Character.getNumericValue(s.charAt(s.length()-1-i)) * (int)Math.pow(2,i);
        }
        return rslt;
    }
    
    static String getBinStr(int num){
        if(num==0){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while(num>0){
            sb.append(num%2);
            num/=2;
        }
        return sb.reverse().toString();
    }
}