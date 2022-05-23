import sys
# sys.stdin = open("input.txt", "rt")
n, m = map(int, input().split())
a = list(map(int, input().split()))

lt = 0
rt = 1
tot = a[lt]
cnt = 0
while True:
    if tot<m:
        rt += 1
        if rt > n:
            break
        tot += a[rt-1]
    elif tot == m:
        cnt += 1
        tot -= a[lt]
        lt += 1
    else:
        tot -= a[lt]
        lt += 1

print(cnt)