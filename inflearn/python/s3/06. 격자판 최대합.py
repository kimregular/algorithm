import sys

sys.stdin = open('06. 격자판 최대합' ,'rt')
n = int(input())
lst = []
for _ in range(n):
    lst.append(list(map(int, input().split())))

totals = 0
totalh = 0
maxx = []
for i in range(n):
    totalx = 0
    totaly = 0
    totals += lst[i][i]
    totalh += lst[i][n-i-1]
    for j in range(n):
        totalx += lst[i][j]
        totaly += lst[j][i]

    maxx.append(totalx)
    maxx.append(totaly)
    maxx.append(totals)
    maxx.append(totalh)

print(max(maxx))
