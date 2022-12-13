# 15. 서울에서 김서방 찾기
def solution(seoul):
    answer = ''
    where = 0 
    for i in range(len(seoul)):
        if seoul[i] == 'Kim':
            where=i
    answer = "김서방은 "+ str(where)+ "에 있다"
    return answer