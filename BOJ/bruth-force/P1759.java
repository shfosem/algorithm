import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
// 1759. 암호 만들기
public class Main {

    static ArrayList<Character> MO_LIST = new ArrayList<Character>();


    public static void main(String[] args) throws IOException {
    // 1개의 모음(a e i o u) 2개 이상의 자음 정렬된 순서
        MO_LIST.add('a');
        MO_LIST.add('e');
        MO_LIST.add('i');
        MO_LIST.add('o');
        MO_LIST.add('u');

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        final int L = Integer.parseInt(st.nextToken()), C=Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        char[] alpha = new char[C];
        for(int i=0; i<C; i++) {
            alpha[i] = st.nextToken().charAt(0);
        }
        Arrays.sort(alpha);

        StringBuilder sb = new StringBuilder();

        dfs(sb, alpha, 0, L);
    }

    static void dfs(StringBuilder sb, char[] alpha, int idx, int L){

        // len==C -> check condition true -> print, else return;
        if(sb.length()==L){
            if(checkCondition(sb.toString())) {
                System.out.println(sb.toString());
            }
            return;
        }

        for(int i=idx; i<alpha.length; i++){
            sb.append(alpha[i]);
            dfs(sb,alpha,i+1,L);
            sb.deleteCharAt(sb.length()-1);
        }

    }

    static boolean checkCondition(String str){
        boolean containMo = false;
        int containJa = 0;

        for(int i=0; i<str.length(); i++){
            if(MO_LIST.indexOf(str.charAt(i))==-1){
                containJa+=1;
            }else{
                containMo=true;
            }
        }

        if(containMo && containJa>1)
            return true;
        else{
            return false;
        }
    }




}
