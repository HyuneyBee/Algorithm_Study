import sys
# sys.stdin = open("input.txt", "rt")
n = int(input())
a = []
for _ in range(n):
    a.append(list(map(int, input().split())))

result = []
for i in a:
    if len(set(i)) == 1:
        result.append(10000 + i[0] * 1000)
    elif len(set(i)) == 2:
        for j in i:
            if i.count(j) == 2:
                result.append(1000+j*100)
    else:
        result.append(max(i) * 100)

print(max(result))
