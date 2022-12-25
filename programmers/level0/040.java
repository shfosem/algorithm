// 40. 모음 제거
class Solution {
    public String solution(String my_string) {
        /*String aeiou = "aeiou";
        for(int i =0; i<aeiou.length();i++){
            String s = aeiou.substring(i,i+1);
            my_string=my_string.replace(s,"");
        }*/
        my_string= my_string.replaceAll("[aeiou]", "");
        return my_string;
    }
}