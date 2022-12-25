// 37. 옷가게 할인 받기
class Solution {
    public int solution(int price) {

        if( price < 300000 && price >= 100000){
                price *= 0.95;    
        }else if(price <500000 && price >= 300000){
                price*=0.9;
        }else if ( price >= 500000){
                price*=0.8;
        }
        return price;
    
    }
}