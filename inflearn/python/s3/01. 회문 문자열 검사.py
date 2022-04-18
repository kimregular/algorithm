import sys

sys.stdin = open('01. 회문 문자열 검사', 'rt')
n = int(input())
for i in range(n):
    a = input().lower()
    if a == a[::-1]:
        print(f'#{i+1} YES')
    else:
        print(f'#{i+1} NO')