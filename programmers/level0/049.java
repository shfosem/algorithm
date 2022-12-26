//49. 가장 큰 수 찾기
class Solution {
    public int[] solution(int[] array) {
        int maxValue = -1;
        int idx=-1;
        for(int i=0; i<array.length; i++){
            if(maxValue<array[i]){
                maxValue=array[i];
                idx=i;
            }
        }
        int[] answer = {maxValue, idx};
        return answer;
    }
}