# 40. 숫자 문자열과 영단어
def solution(s):
    answer = 0
    dict = ['zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight','nine']
    for i in range(len(dict)):
        s=s.replace(dict[i],str(i))
    answer=int(s)
    return answer