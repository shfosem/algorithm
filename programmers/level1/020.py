# 20. 없는 숫자 더하기
def solution(numbers):
    return sum([x for x in range(10) if x not in numbers])