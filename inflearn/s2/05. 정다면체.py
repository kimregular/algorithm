import sys

sys.stdin = open('05. 정다면체', 'rt')

n, m = map(int, sys.stdin.readline().split())

nlst = list(range(1,n+1))
mlst = list(range(1, m+1))
lst = [0] * (n+m+3)
for i in nlst:
    for j in mlst:
       lst[i+j] += 1

maxx = 0
for i in lst:
    if i > maxx:
        maxx = i

for i in range(len(lst)):
    if maxx == lst[i]:
        print(i, end = ' ')