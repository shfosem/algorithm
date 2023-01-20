// 40. 방문 길이
class Solution {
    public int solution(String dirs) {
        // U:0, D:1, L:2, R:3
        final int UP = 0, DOWN = 1, LEFT=2, RIGHT =3;
        
        boolean[][][] visited = new boolean[11][11][4];
        
        int[] dx = {0, 0, -1, 1}, dy ={1, -1, 0, 0};
        
        int xPos = 5, yPos =5;
        
        int answer = 0;
        for(int i=0; i<dirs.length();i++){
            if(dirs.charAt(i)=='U'){
                if(yPos+dy[UP]>10)
                    continue;
                if(!visited[xPos][yPos][UP]){
                    visited[xPos][yPos][UP]=true;
                    visited[xPos+dx[UP]][yPos+dy[UP]][DOWN]=true;
                    answer+=1;
                }
                xPos+=dx[UP];
                yPos+=dy[UP];
            }
            else if(dirs.charAt(i)=='D'){
                if(yPos+dy[DOWN]<0)
                    continue;
                if(!visited[xPos][yPos][DOWN]){
                    visited[xPos][yPos][DOWN]=true;
                    visited[xPos+dx[DOWN]][yPos+dy[DOWN]][UP]=true;
                    answer+=1;
                }
                xPos+=dx[DOWN];
                yPos+=dy[DOWN];
            }
            else if(dirs.charAt(i)=='L'){
                if(xPos+dx[LEFT]<0)
                    continue;
                if(!visited[xPos][yPos][LEFT]){
                    visited[xPos][yPos][LEFT]=true;
                    visited[xPos+dx[LEFT]][yPos+dy[LEFT]][RIGHT]=true;
                    answer+=1;
                }
                xPos+=dx[LEFT];
                yPos+=dy[LEFT];
            }
            else {
                if(xPos+dx[RIGHT]>10)
                    continue;
                 if(!visited[xPos][yPos][RIGHT]){
                    visited[xPos][yPos][RIGHT]=true;
                    visited[xPos+dx[RIGHT]][yPos+dy[RIGHT]][LEFT]=true;
                    answer+=1;
                }
                xPos+=dx[RIGHT];
                yPos+=dy[RIGHT];
            }
        }
        return answer;
    }
}