// 81. 컨트롤 제트
class Solution {
    public int solution(String s) {
        String[] input = s.split(" ");
        int answer = 0;
        
        for(int i=0; i<input.length; i++){
            if(input[i].equals("Z"))
                answer-=Integer.parseInt(input[i-1]);
            else{
                answer+=Integer.parseInt(input[i]);
            }
        }
        return answer;
    }
}