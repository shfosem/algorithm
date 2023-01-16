// 34. 오픈채팅방
import java.util.*;
class Solution {
    
    public String[] solution(String[] records) {
        final int OPTION = 0;
        final int ID = 1;
        final int NICKNM = 2;
        final int MSG = 1;
        
        Map<String, String> users = new HashMap<>();
        
        ArrayList<String> answer = new ArrayList<>();
        StringBuilder sb = null;
        for(String record : records){
            String[] log = record.split(" ");
            if(log[OPTION].equals("Enter")){
                sb = new StringBuilder();
                users.put(log[ID],log[NICKNM]);
                sb.append(log[ID]+"!님이 들어왔습니다.");
                answer.add(sb.toString());
            }
            else if(log[OPTION].equals("Leave")){
                sb = new StringBuilder();
                sb.append(log[ID]+"!님이 나갔습니다.");
                answer.add(sb.toString());
            }
            else{ //Change
                users.put(log[ID],log[NICKNM]);
            }
        }
        
        String[] rslt = new String[answer.size()];
        int idx=0;
        for(String logs: answer){
            String[] tmp = logs.split("!");
            sb = new StringBuilder();
            sb.append(users.get(tmp[0]));
            sb.append(tmp[MSG]);
            
            rslt[idx++]=sb.toString();
        }
        
        return rslt;
    }
}