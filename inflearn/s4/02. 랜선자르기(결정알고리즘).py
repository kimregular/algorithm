import sys

sys.stdin = open('02. 랜선자르기(결정알고리즘)', 'rt')
n, m = map(int ,sys.stdin.readline().split())
lst = [int(input()) for _ in range(n)]
lst.sort()
p1 = 1
p2 = lst[-1]
cnt = 0

while p1 <= p2:
    mid = (p1 + p2) // 2
    cnt = sum( line//mid for line in lst)
    if cnt < m:
        p2 = mid-1

    else:
        p1 = mid + 1


print(cnt)

# 아직 안 끝남!