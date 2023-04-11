import sys
# sys.stdin = open("input.txt", "r")
n = int(input())
global min_v
min_v = 2147000

res = [0] * (n+1)
res[0] = 0
res[1] = 0
for i in range(2, n+1):
    a,b,c = 2174000,2174000,2174000
    if i % 2 == 0:
        a = res[i // 2]
    if i % 3 == 0:
        b = res[i // 3]
    c = res[i - 1]
    res[i] = min(a,b,c) + 1
print(res)
print(res[n])