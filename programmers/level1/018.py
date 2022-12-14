# 18. 제일 작은 수 제거하기
def solution(arr):
    minValue = min(arr)
    arr.remove(minValue)
    if not arr:
        arr.append(-1)
    return arr