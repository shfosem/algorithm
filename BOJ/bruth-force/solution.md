BOJ bruth-force 문제 풀이(JAVA)
================================================
    1182. 부분수열의 합
        > 주어진 조건대로 부분 수열이 목표값(s)와 같을 때 전역 변수 answer+=1;
        > 단, 합계 초기값이 0이므로 s가 0일 때, answer-=1;
    1476. 날짜 계산
        > dfs를 통해 1부터 7980(E*S*M)까지 조건을 만족하는지 확인
        > 나누어 떨어질 때, 1로 될 수 있도록 별도 처리 필요
    1759. 암호 만들기
        > 알파벳 정렬 후 만들 수 있는 모든 경우의 수 dfs로 탐색
        > 주어진 조건을 만족하는지 확인하는 checkCondition() 함수 만들어서 조건 확인
        > 만족할 경우 print
    2309. 일곱 난쟁이
        > 키를 정렬하여 적은 키부터 더해가서 100이 완성되면 해당 답을 return
    2468. 안전 영역
        > 아무 지역도 물에 잠기지 않을 수 있으므로, 최솟값-1부터 시작
        > 최솟값-최댓값을 넣으며, 실제로 잠겼을 때 몇 개의 구역으로 나눠지는지 구하고, 해당 값의 최댓값을 리턴
        > dfs() 구현 
         1. dfs 내부인지 아닌지 구분(count로)
         2. 다음 좌표로 넘어가서, 조건에 맞으면 방문처리하여 다음좌표로 넘어감. 조건을 맞추지 못하면(좌표가 넘어가거나 물에 잠겼을 때 0 리턴)


