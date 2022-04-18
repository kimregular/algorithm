import sys

sys.stdin = open('04. 두 리스트 합치기', 'rt')

n = int(input())
alst = list(map(int, sys.stdin.readline().split()))
m = int(input())
blst = list(map(int, sys.stdin.readline().split()))
q = p = 0
lst = []
i = 0
while i < (n + m):
    if q >= len(alst) :
        lst += blst[p:]
        break
    elif p >= len(blst):
        lst += alst[q:]
        break
    if alst[q] < blst[p]:
        lst.append(alst[q])
        q += 1
    else:
        lst.append(blst[p])
        p += 1

print(*lst)
