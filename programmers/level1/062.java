// 62. 옹알이 (2)
class Solution {
    public int solution(String[] babbling) {
        String[] canSpk = {"aya", "ye", "woo", "ma"};
        for(int i=0 ; i<babbling.length; i++){
            for(int j=0; j<canSpk.length; j++){
                babbling[i]=babbling[i].replace(canSpk[j], String.valueOf(j));
            }
        }
        
        int answer = 0;
        for(int i=0; i<babbling.length; i++){
            try{
                Integer.parseInt(babbling[i]);
            }catch(Exception e){
                continue;
            }
            if(babbling[i].length() == babbling[i].replaceAll("00+|11+|22+|33+","").length())
                answer+=1;
        }
        
        return answer;
    }
}