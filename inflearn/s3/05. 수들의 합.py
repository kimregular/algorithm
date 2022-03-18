import sys

sys.stdin = open('05. 수들의 합', 'rt')

n, m = map(int, input().split())
lst = list(map(int, input().split()))

p = 0
q = 1
cnt = 0
flag = True
while q < len(lst):
    # q 혼자서 m과 값이 같다면 p = q + 1, q = p + 1
    if lst[q] == m:
        cnt += 1
        p = lst.index(lst[q]) + 1
        q = p + 1
    elif sum(lst[p:q + 1]) == m:
        cnt += 1
        if p - q == 1:
            q += 1
        else:
            p += 1
    elif sum(lst[p:q + 1]) < m:
        q += 1
    elif sum(lst[p:q + 1]) > m:
        p += 1

print(cnt)



