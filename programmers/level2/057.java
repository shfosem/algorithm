//57. 방금 그 곡
import java.util.*;
class Solution {
    public String solution(String m, String[] musicinfos) {
        PriorityQueue<Music> list = new PriorityQueue<>();
        
        for(String musicInfo : musicinfos){
            String[] info = musicInfo.split(",");
            list.offer(new Music(info[0], info[1], info[2], info[3]));
        }
        
        String answer = "";
        String convertedM = convertScore(m);
        while(!list.isEmpty()){
            Music music = list.poll();
             if(music.find(convertedM)){
                answer = music.getTitle();
                break;
            }
        }
        if(answer.length()==0)
            return "(None)";
        else
            return answer;
    }
    public String convertScore(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='#'){
                sb.deleteCharAt(sb.length()-1);
                sb.append(Character.toLowerCase(s.charAt(i-1)));
            }
            else
                sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    public class Music implements Comparable<Music>{
        private String title;
        private String score;
        private int playTime;
        private int idx;
        
        @Override
        public int compareTo(Music b){
            return b.playTime- this.playTime;
        }
        
        public Music(String strt, String end, String title, String score){
            this.title = title;
            this.score = convertScore(score);
            this.playTime = calPlayTime(strt, end);
            if(this.getLen()< this.getPlayTime()){
                this.concatScore(this.getPlayTime()/this.getLen());
            }
        }
        
        int calPlayTime(String strt, String end){
            String[] strtTm = strt.split(":");
            String[] endTm = end.split(":");
            int str = Integer.parseInt(strtTm[0]) * 60 + Integer.parseInt(strtTm[1]);
            int en = Integer.parseInt(endTm[0]) * 60 + Integer.parseInt(endTm[1]);
            return en-str;
        }
        
        public int getLen(){
            return score.length();
        }
        public int getPlayTime(){
            return this.playTime;
        }
        public String getTitle(){
            return this.title;
        }
        public void concatScore(int n){
            StringBuilder sb = new StringBuilder(this.score);
            for(int i = 0 ; i<n; i++){
                sb.append(this.score);    
            }
            this.score = sb.toString();
            return;
        }
        public boolean find(String m){
            return this.score.substring(0, this.playTime).indexOf(m) == -1 ? false : true;
        }
    }
}





