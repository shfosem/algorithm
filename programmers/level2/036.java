// 36. 주차 요금 계산
import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        final int DEFAULT_MIN = fees[0];
        final int DEFAULT_FEE = fees[1];
        final int STD_MIN = fees[2];
        final int STD_FEE = fees[3];
        Map<String, Car> tm = new TreeMap<>();
        
        for(String record : records){
            String[] info = record.split(" ");
            if(info[2].equals("IN")){
                if(tm.containsKey(info[1])){
                    tm.get(info[1]).park(info[0]);
                }else{
                Car car = new Car();
                car.park(info[0]);
                tm.put(info[1], car);
                }
            }else{
                tm.get(info[1]).out(info[0]); 
            }
        }
        int[] answer = new int[tm.size()];
        int idx=0;
        for(Car car : tm.values()){
            car.notOut();
            int fee=DEFAULT_FEE;
            int parkingMin = car.getParkingMinute();
            if(parkingMin > DEFAULT_MIN){
                parkingMin-=DEFAULT_MIN;
                fee += parkingMin % STD_MIN ==0 ? 
                    (parkingMin/STD_MIN) * STD_FEE :
                    (parkingMin/STD_MIN + 1) * STD_FEE;
            }
            answer[idx++]=fee;
        }
        
        return answer;
    }
    
    class Car{
        private boolean isPark = false;
        private int parkH=0;
        private int parkM=0;
        private int parkingMinute = 0;
        
        public int getParkingMinute(){
            return this.parkingMinute;
        }

        public void park(String time){
            String[] hm = time.split(":");
            isPark=true;
            parkH=Integer.parseInt(hm[0]);
            parkM=Integer.parseInt(hm[1]);
        }
        
        public void out(String time){
            String[] hm = time.split(":");
            isPark=false;
            int outH=Integer.parseInt(hm[0]);
            int outM=Integer.parseInt(hm[1]);
            parkingMinute += (outH - this.parkH) * 60 + outM-this.parkM;
        }
        
        public void notOut(){
            if(isPark)
                parkingMinute+= (23 - this.parkH) * 60 + 59- this.parkM;
        }
    }
}