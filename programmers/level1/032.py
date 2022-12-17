# 32. 이상한 문자 만들기
def solution(arr):
    answer = []
    answer.append(arr[0])
    j=0
    for i in range(1,len(arr)):
        if answer[j] == arr[i]:
            continue
        answer.append(arr[i])
        j+=1
            
    return answer