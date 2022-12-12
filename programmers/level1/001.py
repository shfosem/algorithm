#평균 구하기
def solution(arr): 
    answer = 0
    sum = 0
    for num in arr:
        sum+=num
    answer = sum/len(arr)
    return answer