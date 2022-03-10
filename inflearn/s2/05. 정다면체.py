import sys

sys.stdin = open('05. 정다면체', 'rt')
n,m = map(int, input().split())
lst = [0 for _ in range(n+m+3)]
for i in range(1,n+1):
    for j in range(1, m+1):
        lst[i+j] += 1

for idx, i in enumerate(lst):
    if i == max(lst):
        print(idx, end = ' ')