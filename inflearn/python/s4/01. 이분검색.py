import sys

sys.stdin = open('01. 이분검색', 'rt')

n, m = map(int, sys.stdin.readline().split())
lst = list(map(int, sys.stdin.readline().split()))
lst.sort()

s = 0
e = n-1

while s <= e:
    mid = (s + e) //2
    if lst[mid] == m:
        print(mid + 1)
        break
    elif lst[mid] > m:
        e = mid - 1
    else:
        s = mid + 1