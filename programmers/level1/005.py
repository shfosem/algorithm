#자연수 뒤집어 배열로 만들기
def solution(n):
    answer = []
    strNum=str(n)
    for i in strNum:
        answer.append(int(i))
    answer.reverse()
    return answer