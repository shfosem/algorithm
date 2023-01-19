// 38. 스킬트리

import java.util.*;
class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        String[] skills = skill.split("");
        
        for(String tree : skill_trees){
            if(isPossible(skills, tree))
                answer+=1;
        }
        
        return answer;
    }
    boolean isPossible(String[] skills, String tree){
        Queue<Integer> q = new LinkedList<>();
        for(String s : skills){
            q.add(tree.indexOf(s));
        }
        
        boolean state = true;
        int idx=-1;
        while(!q.isEmpty()){
            if(q.peek()==-1){
                state=false;
                q.poll();
                continue;
            }
            if(!state){
                if(q.poll()>=0)
                    return false;
            }else{
                if(idx>q.peek()){
                    return false;
                }else{
                    idx=q.poll();    
                }   
            }
        }
        return true;
    
        
    }
}