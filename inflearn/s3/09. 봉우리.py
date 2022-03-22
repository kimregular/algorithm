import sys

sys.stdin = open('09. 봉우리', 'rt')

n = int(input())
lst = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]

lst.insert(0, [0]*n)
lst.append([0]*n)
for i in lst:
    i.insert(0, 0)
    i.append(0)

cnt = 0
x = [0, 1, 0, -1]
y = [1, 0, -1, 0]

for i in range(1, n+1):
    for j in range(1, n+1):
        if all(lst[i][j] > lst[i+x[k]][j+y[k]] for k in range(4)):
            cnt += 1

print(cnt)