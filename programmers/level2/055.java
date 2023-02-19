// 55. 메뉴 리뉴얼
import java.util.*;
class Solution {
    public ArrayList solution(String[] orders, int[] course) {
        ArrayList<String> answer = new ArrayList<>();
        Map<String, Integer> tm = new TreeMap<>();
        
        for(String order : orders){
            String[] menus = order.split("");
            Arrays.sort(menus);
            addCourses(menus, tm, course);
        }
        
        Map<Integer, Integer> maxCourse = new HashMap<>();
        
        for(Map.Entry<String,Integer> entry : tm.entrySet()){
            int cnt = maxCourse.getOrDefault(entry.getKey().length(),0);
            if(cnt< entry.getValue()){
                maxCourse.put(entry.getKey().length(), entry.getValue());
            }
        }
    
        for(Map.Entry<String,Integer> entry : tm.entrySet()){
            if(entry.getValue() == maxCourse.get(entry.getKey().length()) && entry.getValue() >=2 )
                answer.add(entry.getKey());
        }
        
        return answer;
    }
    
    void addCourses(String[] menus, Map tm, int[] course){
        final int N = menus.length;
        for(int i=2; i<=N; i++){
            boolean isContain = false;
            for(int j=0; j<course.length; j++){
                if(i == course[j]){
                    isContain = true;
                    break;
                }
            }
            if(isContain){
                StringBuilder sb = new StringBuilder();
                getCombination(menus, tm, sb, i, 0);
            }
        }
    }
    void getCombination(String[] menus, Map tm, StringBuilder sb,int len, int strtIdx){
        if(len == sb.length()){
            tm.put(sb.toString(), (int)tm.getOrDefault(sb.toString(),0)+1);
        }
        else{
            for(int i=strtIdx; i< menus.length; i++){
                sb.append(menus[i]);
                getCombination(menus, tm, sb, len, i+1);
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
    
}