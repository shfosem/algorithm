# 28. 행렬의 덧셈
def solution(arr1, arr2):
    answer = []
    for i,j in zip(arr1, arr2):
        answer.append([x+y for x,y  in zip(i,j)])
    return answer
