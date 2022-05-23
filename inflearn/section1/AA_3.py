import sys
# sys.stdin = open("input.txt", "rt")
n, k = map(int, input().split())
a = list(map(int, input().split()))
a.sort(reverse=True)
cnt = 0
res = set()
for i in range(n):
    for j in range(i+1, n):
        for x in range(j+1, n):
                res.add(a[i] + a[j] +a[x])

r = list(res)
r.sort(reverse=True)
print(r[k-1])