# 35. 시저 암호
def solution(s, n):
    answer = ''
    
    for i in s:
        if i.isalpha(): #알파벳인 경우
            nextOrd=ord(i)+n
            if ord('a')<= ord(i) <= ord('z'): # 소문자
                if nextOrd > ord('z'):
                    nextOrd=ord('a')-1+nextOrd-ord('z')
            else: # 대문자
                if nextOrd > ord('Z'):
                    nextOrd=ord('A')-1+nextOrd-ord('Z')
            answer+=chr(nextOrd)
        else : answer+=i

    return answer