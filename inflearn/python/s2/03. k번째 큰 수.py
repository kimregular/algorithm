import sys

sys.stdin = open('03. k번째 큰 수', 'rt')

n, k = map(int, input().split())
lst = sorted(list(map(int, input().split())))
nlst = set()

for i in range(len(lst)):
    for j in range(int(i)+1,len(lst)):
        for x in range(int(j)+1,len(lst)):
            nlst.add(sum([lst[i], lst[j], lst[x]]))
nlst = list(nlst)
nlst.sort(reverse=True)


print(nlst[k-1])

#  조합사용하자!