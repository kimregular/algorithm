import sys, os

sys.stdin = open('01. k번째 약수', 'rt')
n, m = map(int, sys.stdin.readline().split())
cnt = 0
for i in range(1, n+1):
    if n%i == 0:
        cnt += 1
    if cnt == m:
        print(i)
        break