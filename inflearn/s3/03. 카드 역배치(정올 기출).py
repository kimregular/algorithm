import sys

sys.stdin = open('03. 카드 역배치(정올 기출)', 'rt')

lst = list(range(1,21))

for i in range(10):
    a, b = map(int, sys.stdin.readline().split())
    nlst = lst[a-1:b]
    lst[a-1:b] = nlst[::-1]

print(*lst)