import sys

sys.stdin = open('06. 자릿수의 합', 'rt')
n = int(input())
lst = list(map(int, sys.stdin.readline().split()))

nlst = []
for i in range(n):
    num = lst[i]
    total = 0
    while num:
        total = total + num%10
        num //= 10
    nlst.append(total)

print(lst[nlst.index(max(nlst))])

