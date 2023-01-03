// 65. 햄버거 만들기 
class Solution {
    public int solution(int[] ingredient) {
        final String HMBRGR = "1231";
        StringBuilder sb = new StringBuilder();
        
        for(int i : ingredient){
            sb.append(i);
        }
        
        int idx= sb.indexOf(HMBRGR);
        int answer = 0;
        
        while(idx>=0){
            sb = sb.replace(idx, idx+4, "");
            answer+=1;
            try{
            idx=sb.indexOf(HMBRGR, idx-2);
            }catch(Exception e){
                idx=sb.indexOf(HMBRGR);
            }
        }
        
        return answer;
    }
}