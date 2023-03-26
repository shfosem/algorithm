import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 1476. 날짜 계산 (너무 naive풀이)
public class P1476 {


    public static void main(String[] args) throws IOException {
        final int E = 15, S=28, M=19;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int ie = Integer.parseInt(st.nextToken()),is = Integer.parseInt(st.nextToken()), im = Integer.parseInt(st.nextToken());

        boolean checkE = false, checkS = false, checkM=false;
        for(int i=1; i<=E*S*M; i++){
            checkE = false;
            checkS = false;
            checkM = false;
            if(ie==15 && i%E==0){
                checkE=true;
            }else if(i%E==ie){
                checkE=true;
            }

            if(is==28 && i%S==0){
                checkS=true;
            }else if(i%S==is){
                checkS=true;
            }

            if(im==19 && i%M==0){
                checkM=true;
            }else if(i%M==im){
                checkM=true;
            }

            if(checkE && checkS && checkM) {
                System.out.println(i);
                return;
            }
        }

    }

}
