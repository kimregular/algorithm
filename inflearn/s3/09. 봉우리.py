import sys

sys.stdin = open('09. 봉우리', 'rt')

n = int(input())
lst = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]

lst.insert(0, [0]*n)
lst.append([0]*n)
for i in lst:
    i.insert(0,0)
    i.append(0)

for i in lst:
    print(*i)