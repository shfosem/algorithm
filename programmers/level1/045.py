# 045. 소수 찾기
def solution(n):
    answer = set(range(3,n+1,2))
    print(answer)
    for i in range(3, int(n**(1/2))+1):
        if i in answer:
            answer -= set(range(2*i,n+1,i))
    return len(answer)+1