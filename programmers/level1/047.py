# 047. 소수 만들기
from itertools import combinations

def isPrime(n):
    if n == 2:
        return True
    for i in range(2,int(n**0.5)+1):
        if n%i==0:
            return False
    return True

def solution(nums):
    primes = []
    for comb in combinations(nums,3):
        if isPrime(sum(comb)):
            primes.append(sum(comb))
    
    return len(primes)