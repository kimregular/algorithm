import sys

sys.stdin = open('04. 두 리스트 합치기' ,'rt')
n1 = int(input())
lst1 = list(map(int, sys.stdin.readline().split()))
n2 = int(input())
lst2 = list(map(int, sys.stdin.readline().split()))
p = q = 0
nlst = []

while len(nlst) < len(lst1 + lst2):
    if lst1[p] < lst2[q]:
        nlst.append(lst1[p])
        p += 1
    else:
        nlst.append(lst2[q])
        q += 1
print(nlst)