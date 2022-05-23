import sys
sys.stdin = open("input.txt", "rt")
n = int(input())
a = [list(map(int, input().split())) for _ in range(n)]
start = n // 2
res = 0
lt = -1
rt = -1
for i in range(n):
    if i <= n//2:
        lt += 1
        rt += 1
        c = a[i][start - lt : start + rt + 1]
        res += sum(a[i][start - lt : start + rt + 1])
    else:
        lt -= 1
        rt -= 1
        d = a[i][start - lt: start + rt + 1]
        res += sum(a[i][start - lt: start + rt + 1])


print(res)