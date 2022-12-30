// 80. 캐릭터의 좌표
class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        // 상, 하, 좌, 우
        final int[] dx = {0, 0, -1, 1};
        final int[] dy = {1, -1, 0, 0};
        int[] answer = {0, 0};
        
        for(String key : keyinput){
            int direct=-1;
            if(key.equals("up")) direct=0;
            else if(key.equals("down")) direct=1;
            else if(key.equals("left")) direct=2;
            else if(key.equals("right")) direct=3;
            
            if(answer[0]+dx[direct]>(int)board[0]/2 || answer[0]+dx[direct]< (int)board[0]/2*(-1))
                continue;
            else if(answer[1]+dy[direct]>(int)board[1]/2 || answer[1]+dy[direct]< (int)board[1]/2*(-1))
                continue;
            answer[0]+=dx[direct];
            answer[1]+=dy[direct];
            
        }
        return answer;
    }
}