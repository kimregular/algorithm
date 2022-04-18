import sys

sys.stdin = open('02. k번째 수')

n = int(input())

for i in range(n):
    l, s, e, th = map(int, input().split())
    lst = list(map(int, input().split()))
    print(f'# {sorted(lst[s-1:e])[th-1]}')
    # print(l,s,e,th)