import sys, os

os.chdir('./s3')

sys.stdin = open('07. 사과나무(다이아몬드)' ,'rt')
n = int(input())
lst = []
for _ in range(n):
    lst.append(list(map(int, input().split())))

cnt = 0
s = e = n//2

for i in range(n):
    for j in range(s, e+1):
        cnt += lst[i][j]
    if i < n//2 :
        s -= 1
        e += 1
    else:
        s += 1
        e -= 1
print(cnt)

