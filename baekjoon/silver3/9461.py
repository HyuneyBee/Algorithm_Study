import sys
# sys.stdin = open("input.txt", "r")
t = int(input())
for i in range(t):
    res = []
    n = int(input())
    res.append(1)
    res.append(1)
    res.append(1)
    for j in range(3, n):
        res.append(res[j-2] + res[j-3])
    print(res[n-1])