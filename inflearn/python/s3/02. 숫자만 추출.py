import sys

sys.stdin = open('02. 숫자만 추출', 'rt')
n = sys.stdin.readline()

num = ''
for i in n:
    if i.isdigit():
        num += i
num = int(num)
cnt = 0
for i in range(1, num+1):
    if num%i == 0:
        cnt += 1

print(num)
print(cnt)