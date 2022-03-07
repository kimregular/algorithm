import sys
sys.stdin = open('04. 대표값', 'rt')

n = int(input())
lst = list(map(int, input().split()))

ave = int(sum(lst)/len(lst) +0.5)
cn = 200
maxx = 0
num = 0
for idx, i in enumerate(lst):
    if abs(i - ave) < cn:
        maxx = i
        cn = abs(i - ave)
        num = idx
    elif cn == abs(i - ave):
        if maxx < i:
            maxx = i
            num = idx

print(ave, num+1)
