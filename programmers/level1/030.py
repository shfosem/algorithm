# 30. 최대공약수와 최소공배수
def solution(n, m):
    answer = []
    maxCom=1
    for i in range(1,max(n,m)):
        if n % i ==0 and m % i ==0:
            maxCom=i
    minCom=n*m//maxCom
    answer.append(maxCom)
    answer.append(minCom)
    return answer