#25. 약수의 개수와 덧셈
def solution(left, right):
    answer = 0
    for i in range(left, right+1):
        if (i**0.5) == int(i**0.5):
            answer-= i
        else :
            answer +=i
    return answer