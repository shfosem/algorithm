// 93. OX퀴즈
import java.util.*;
class Solution {
    public ArrayList solution(String[] quiz) {
        ArrayList<String> answer = new ArrayList<>();
        for(String s : quiz){
            answer.add(getOX(s));
        }
        return answer;
    }
    
    static String getOX(String s){
        String rslt = "";
        String[] polys = s.split(" ");
        int left = 0;
        boolean isMinus = false;
        boolean isLeft = true;
        
        for(String poly : polys){
            if(poly.equals("=")){
                isLeft=false;
                continue;
            }
            else if(poly.equals("+")){
                isMinus = false;
                continue;
            }
            else if(poly.equals("-")){
                isMinus=true;
                continue;
            }
            else{ //digit
                int num = Integer.parseInt(poly);
                if(isLeft){
                    if(!isMinus){
                        left+=num;
                    }else{
                        left-=num;
                    }
                }else{
                    if(num==left)
                        rslt="O";
                    else{
                        rslt="X";
                    }
                }
            }
        }
        return rslt;
    }
}