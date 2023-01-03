// 60. 신규아이디 추천
class Solution {
    public String solution(String new_id) {
        new_id= new_id.toLowerCase();
        // regex 특수문자 먼저, [^ regex]  regex안에 포함 안되는
        new_id = new_id.replaceAll("[^-_.a-z0-9]", "");
        new_id = new_id.replaceAll("[.][.]+", ".");
        // ^. .으로시작하는지 / .$  .으로 끝나는지
        new_id = new_id.replaceAll("^[.]|[.]$", "");

        if(new_id.length()>15){
            new_id= new_id.substring(0,15);
        }
        
        try{
        if(new_id.charAt(new_id.length()-1) == '.'){
            new_id= new_id.substring(0,new_id.length()-1);
        }
        }catch(Exception e){ // 빈 문자열일 때
            new_id="a";
        }
        StringBuilder sb = new StringBuilder(new_id);
        while(sb.length()<3){
            sb.append(sb.charAt((sb.length()-1)));
        }   
        
        return sb.toString();
    }
}