# 24.문자열 내림차순으로 배치하기
def solution(s):
    return ''.join(sorted(map(str,s), reverse=True))
    