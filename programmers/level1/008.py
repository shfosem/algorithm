#8. x만큼 간격이 있는 n개의 숫자
def solution(x, n):
    answer = []
    num=0
    for _ in range(n):
        num+=x
        answer.append(num)
    return answer