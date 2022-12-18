# 37. 비밀지도
def binary(num,n):
    binary = ''
    while num>0:
        binary= str(num%2) + binary
        num//=2
    binary=binary.rjust(n,'0')
    return binary

def solution(n, arr1, arr2):
    answer = []
    code =''
    for a,b in zip(arr1,arr2):
        code=bin(a|b)[2:].rjust(n,'0')
        code=code.replace('1','#')
        code=code.replace('0',' ')

        answer.append(code)
    return answer