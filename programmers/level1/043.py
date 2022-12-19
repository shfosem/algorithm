# 43. 2016년
def solution(a, b):
    answer = ''
    day = ['FRI', 'SAT', 'SUN', 'MON', 'TUE', 'WED', 'THU']
    days = [0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    sumDay = 0
    for i in range(a):
        sumDay+=days[i]
    sumDay+=b-1
    return day[sumDay%7]