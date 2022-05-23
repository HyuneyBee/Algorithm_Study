import sys
# sys.stdin=open("input.txt", "r")
n, c=map(int, input().split)
a = [int(sys.stdin.readline()) for _ in range(n)]


lt = 1
rt = max(a)
a.sort()
res = 0
while lt <= rt:
    mid = (rt + lt) // 2
    cnt = 1
    first = a[0]
    for i in range(len(a)):
        if (a[i] - first) >= mid:
            first = a[i]
            cnt += 1
    if cnt >= c:
        lt = mid +1
        res = mid
    else:
        rt = mid -1


print(res)