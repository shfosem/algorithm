// 2. JadenCase 문자열 만들기 
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean isFirst = true;
        for(String ch : s.toLowerCase().split("")){
            if(ch.equals(" ")){
                isFirst=true;
                sb.append(" ");
                continue;
            }
            if(isFirst){
                sb.append(ch.toUpperCase());
                isFirst=false;
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}