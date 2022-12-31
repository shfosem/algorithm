// 92. 다항식 더하기
class Solution {
    public String solution(String polynomial) {
        String[] polys = polynomial.split(" [+] ");
        int xCnt = 0;
        int cCnt = 0;
        for(String s : polys){
            if(s.contains("x")){
                if(s.equals("x"))
                    xCnt+=1;
                else{
                    xCnt+=Integer.parseInt(s.substring(0,s.length()-1));
                }
            }
            else{
                cCnt+=Integer.parseInt(s);
            }
        }
        
        
        StringBuilder sb = new StringBuilder();
        if(xCnt>0){
        if(xCnt>1)
            sb.append(xCnt);
        sb.append("x");
        }
        if(xCnt>0 && cCnt>0){
        sb.append(" + ");
        }
        if(cCnt>0){
        sb.append(cCnt);
        }
        return sb.toString();
    }
}