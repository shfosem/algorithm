//53. 외계행성의 나이
class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        String tmp = String.valueOf(age);
        for(int i=0; i<tmp.length(); i++){
            sb.append((char)('a'+Character.getNumericValue(tmp.charAt(i))));
        }
        return sb.toString();
    }
}