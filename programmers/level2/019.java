// 19. 행렬의 곱셈 
class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        final int A = arr1.length;
        final int B = arr2.length;
        final int C = arr2[0].length;
        int[][] answer = new int[A][C];
        
        for(int i = 0 ; i<A; i++){
            for(int j=0; j<C; j++){
                for(int k=0; k<B; k++){
                    answer[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }
        return answer;
    }
}

/*
n * m   m * l  = n * l
1 4     3 3
3 2     3 3
4 1

2 3 2   5 4 3
4 2 4   2 4 1
3 1 4   3 1 1

*/