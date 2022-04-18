import sys

sys.stdin = open('02. 랜선자르기(결정알고리즘)', 'rt')
n, m = map(int, sys.stdin.readline().split())
li = sorted([int(input()) for _ in range(n)])
s = 1
e = li[-1]

while s <= e:
    mid = (s + e) // 2
    cnt = sum(line // mid for line in li)
    if cnt < m :
        e = mid - 1
    else:
        s = mid + 1
print(e) # 최대 개수 출력