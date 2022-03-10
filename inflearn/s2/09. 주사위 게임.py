import sys

sys.stdin = open('09. 주사위 게임', 'rt')
n = int(sys.stdin.readline())
lst = []
for _ in range(n):
    lst.append(list(map(int, sys.stdin.readline().split())))

price = []

for i in lst:
    if (i[0] == i[1] and i[0] == i[2]):
        price.append(10000+i[0]*1000)
    elif i[0] == i[1]:
        price.append(1000+i[0]*100)
    elif i[1] == i[2]:
        price.append(1000 + i[1] * 100)
    elif i[0] == i[2]:
        price.append(1000 + i[0] * 100)
    else:
        price.append(max(i)*100)
print(max(price))
