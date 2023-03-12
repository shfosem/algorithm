// 73. 후보키
import java.util.*;
class Solution {
    static Queue<String> keySet = new LinkedList();
    public int solution(String[][] relation) {
        
        final int N = relation[0].length;
        final int ROW = relation.length;
        for(int i=1; i<=N; i++){
            offerKeySet(i, 0, N, new StringBuilder());
        }
        
        HashSet<String> answer = new HashSet<>();
        
        while(!keySet.isEmpty()){
            String key = keySet.poll();
            
            boolean isCandi = true;
            for(String s : answer){ 
                if(isContain(s, key)){
                    isCandi=false;
                    break;
                }
            }
            if(!isCandi) //최소조건 만족 여부 판단
                continue;
            else if(ROW == checkCandidate(relation, key)){
                answer.add(key); 
                System.out.println(key);
            }     
        }
        
        return answer.size();
    }
    
    
    int checkCandidate(String[][] relation, String key){
        String[] col = key.split("");
        HashSet<String> hs = new HashSet<>();
        
        for(String[] row : relation){
            StringBuilder sb = new StringBuilder();
            for(String idx : col){
                sb.append(row[Integer.parseInt(idx)]);
            }
            hs.add(sb.toString());
        }
        return hs.size();
    }
    
    
    boolean isContain(String small, String big){
        boolean rslt = true;
        for(int i=0; i<small.length();i++){
            if(big.indexOf(small.charAt(i))<0){
                rslt=false;
                break;
            }
        }
        return rslt;
    }
    
    void offerKeySet(int n, int k, int N, StringBuilder sb){
        if(n==sb.length()){
            keySet.offer(sb.toString());
            return;
        }
        else{
            for(int i=k; i<N; i++){
                sb.append(i);
                offerKeySet(n, i+1, N, sb);
                sb.deleteCharAt(sb.length()-1);
            }
            
        }
    }
}
