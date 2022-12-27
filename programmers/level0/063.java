//63. A로 B 만들기
class Solution {
    public int solution(String before, String after) {
        int a=1;
        int b=1;
        int c=0;
        int d=0;
        
        for(int i=0; i<before.length();i++){
            a*=before.charAt(i);
            b*=after.charAt(i);
            c+=before.charAt(i);
            d+=after.charAt(i);
        }
        return a==b && c==d ? 1 : 0;
    }
}