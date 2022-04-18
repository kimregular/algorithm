import sys, os

os.chdir('./s3')

sys.stdin = open('08. 곳감(모래시계)', 'rt')

n = int(input())
lst = [list(map(int, input().split())) for _ in range(n)]

m = int(input())
order = [list(map(int, input().split())) for _ in range(m)]

for i in order:
    if i[1] == 1:
        for j in range(i[2]):
            a = lst[i[0]-1].pop()
            lst[i[0]-1].insert(0, a)

    else:
        for j in range(i[2]):
            a = lst[i[0]-1].pop(0)
            lst[i[0]-1].append(a)


s = 0
e = n
cnt = 0

for i in range(n):
    for j in range(s, e):
        cnt += lst[i][j]
    if i < n//2:
        s += 1
        e -= 1
    else:
        s -= 1
        e += 1

print(cnt)


