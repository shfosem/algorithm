# 16. 핸드폰 번호 가리기
def solution(phone_number):
    answer = ''
    for i in range(len(phone_number)-4):
        answer+='*'
    answer+=phone_number[-4:]
    return answer