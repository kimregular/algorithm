import sys

sys.stdin = open('10. 점수계산', 'rt')

n = int(sys.stdin.readline())
lst = list(map(int, sys.stdin.readline().split()))

score = 0
cnt = 0

for i in lst:
    if i != 0:
        cnt += 1
        score += cnt
    else:
        cnt = 0
print(score)