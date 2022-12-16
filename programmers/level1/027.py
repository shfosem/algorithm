# 27. 부족한 금액 계산하기
def solution(price, money, count):
    answer = -1
    need = price*(count*(count+1)//2)
    if money >= need:
        answer = 0
    else:
        answer = need-money
    return answer