// 73. 잘라서 배열로 저장하기

import java.util.*;
class Solution {
    public ArrayList solution(String my_str, int n) {
        ArrayList<String> answer = new ArrayList<>();
        for(int i=0; i<my_str.length(); i+=n){
            if(i+n>my_str.length()){
                answer.add(my_str.substring(i,my_str.length()));
                break;
            }
            answer.add(my_str.substring(i,i+n));
        }
        return answer;
    }
}