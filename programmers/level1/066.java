// 66. 신고 결과 받기
import java.util.*;
class Solution {
    
    static class UserData{
        private int reported = 0;
        private HashSet<String> reporting = new HashSet<>();
        private int email=0;
        private boolean stopped = false;
        
        public void setStop(){
            this.stopped=true;
        }
        public boolean isStopped(){
            return this.stopped;
        }
        
        public int getReported(){
            return this.reported;
        }
        public void addReported(){
            this.reported+=1;
        }
        
        public void addReporting(String s){
            this.reporting.add(s);
        }
        public int getReporting(String[] reportedList){
            for(String s : reportedList){
                if(this.reporting.contains(s))
                    email+=1;
            }
            return email;
        }
        
    }
    
    public int[] solution(String[] id_list, String[] report, int k) {
        final int N = id_list.length;
        
        
        HashMap<String, UserData> users = new HashMap<>();
        for(String id : id_list){
            users.put(id ,new UserData());
        }
        
        HashSet<String> delOverLap = new HashSet<>();
        for(String s : report){
            delOverLap.add(s);
        }
        
        for(String s : delOverLap){
            String[] rprt = s.split(" ");
            users.get(rprt[0]).addReporting(rprt[1]);
            users.get(rprt[1]).addReported();
        }  
        
        String[] stopId = new String[N];
        int idx=0;
        for(Map.Entry<String, UserData> entry : users.entrySet()){
            if(entry.getValue().getReported()>=k){
                stopId[idx++]=entry.getKey();
            }
        }
        
        int[] answer = new int[N];
        for(int i=0; i<N; i++){
            answer[i]=users.get(id_list[i]).getReporting(stopId);
        }
        
        return answer;
    }
}