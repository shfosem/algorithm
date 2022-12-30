// 83. 로그인 성공?
class Solution {
    public String solution(String[] id_pw, String[][] db) {
        final int ID = 0;
        final int PASSWORD = 1;
        for(String[] user : db){
            if(id_pw[ID].equals(user[ID])){
                if(id_pw[PASSWORD].equals(user[PASSWORD]))
                    return "login";
                return "wrong pw";
            }
        }
        return "fail";
    }
}