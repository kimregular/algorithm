import sys

sys.stdin = open('08. 뒤집은 소수', 'rt')

n = int(sys.stdin.readline())
lst = list(map(int, sys.stdin.readline().split()))

def reverse(x):
    num = ''
    while x:
        num += str(x%10)
        x = x//10
    return int(num)

def is_prime(x):
    for i in range(2,(x//2)+1):
        if x % i == 0:
            return False
    else:
        return x




nlst = []
for i in lst:
    a = reverse(i)
    if is_prime(a):
        nlst.append(a)

print(*nlst)




