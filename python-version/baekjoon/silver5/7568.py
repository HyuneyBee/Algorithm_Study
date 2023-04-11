import sys
# sys.stdin = open("input.txt", "r")
n = int(input())
res = []
p_list = []
for i in range(n):
    a, b = map(int, sys.stdin.readline().split())
    p_list.append((a,b))

for i in range(n):
    value = 1
    for j in range(n):
        if p_list[j][1] > p_list[i][1] and p_list[j][0] > p_list[i][0]:
            value += 1
    res.append(value)

for i in res:
    print(i, end=" ")