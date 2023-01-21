// 43. 파일명 정렬
import java.util.*;
class Solution {
    public String[] solution(String[] files) {
        final int N = files.length;
        String[] answer = new String[N];
        
        ArrayList<File> arr = new ArrayList<>();
        for(int i=0; i<N; i++){
            arr.add(new File(files[i], i));
        }
        
        Collections.sort(arr);
        for(int i=0 ;i<N;i++){
            answer[i]=arr.get(i).getFileNm();
        }
        return answer;
    }
    
    class File implements Comparable<File>{
        private String fileNm;
        private String head;
        private int number;
        private int idx;
        
        
        @Override
        public int compareTo(File f){
            if(!f.head.equalsIgnoreCase(this.head))
                return head.compareToIgnoreCase(f.head);
            else if(f.number != this.number){
                return number - f.number;
            }
            else{
                return idx-f.idx;
            }
        }
        
        File(String fileNm, int idx){
            this.fileNm = fileNm;
            this.idx= idx;
            
            String[] tmp = fileNm.split("[0-9]");
            this.head = tmp[0];
            
            tmp = fileNm.replaceFirst("[^0-9]+","").split("[^0-9]");
            this.number = Integer.parseInt(tmp[0]);
        }
        
        
        public String getFileNm(){
            return this.fileNm;
        }
            
    }
}