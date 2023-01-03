// 64.  성격 유형 검사하기
class Solution {
    public String solution(String[] survey, int[] choices) {
        final int N = survey.length;
        final int STD = 4;
        
        KakaoMBTI rslt = new KakaoMBTI();
        for(int i=0; i<N; i++){
            if(choices[i]==4)
                continue;
            //RT
            if(survey[i].charAt(0)=='R'){
                rslt.setRt(STD-choices[i]);
            }
            if(survey[i].charAt(0)=='T'){
                rslt.setRt(choices[i]-STD);
            }
            //CF
            if(survey[i].charAt(0)=='C'){
                rslt.setCf(STD-choices[i]);
            }
            if(survey[i].charAt(0)=='F'){
                rslt.setCf(choices[i]-STD);
            }
            //JM
            if(survey[i].charAt(0)=='J'){
                rslt.setJm(STD-choices[i]);
            }
            if(survey[i].charAt(0)=='M'){
                rslt.setJm(choices[i]-STD);
            }
            //AN
            if(survey[i].charAt(0)=='A'){
                rslt.setAn(STD-choices[i]);
            }
            if(survey[i].charAt(0)=='N'){
                rslt.setAn(choices[i]-STD);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append(rslt.getRt());
        sb.append(rslt.getCf());
        sb.append(rslt.getJm());
        sb.append(rslt.getAn());
        return sb.toString();
    }
    public static class KakaoMBTI{
        private int rt = 0;
        private int cf = 0;
        private int jm = 0;
        private int an = 0;
        
        public void setRt(int val){
            this.rt+=val;
        }
        public void setCf(int val){
            this.cf+=val;
        }
        public void setJm(int val){
            this.jm+=val;
        }
        public void setAn(int val){
            this.an+=val;
        }
        
        public String getRt(){
            return this.rt>=0? "R" : "T";
        }
        public String getCf(){
            return this.cf>=0? "C" : "F";
        }
        public String getJm(){
            return this.jm>=0? "J" : "M";
        }
        public String getAn(){
            return this.an>=0? "A" : "N";
        }
        
        
    }
}