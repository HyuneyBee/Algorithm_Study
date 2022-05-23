import sys
# sys.stdin = open("input.txt", "r")
n, m = map(int, sys.stdin.readline().split())
arr = [int(input()) for _ in range(n)]
left = 1
right = max(arr)
res = 0
while left <= right:
    mid = (left + right) // 2
    cnt = 0
    for i in arr:
        cnt += i // mid
    if cnt >=m:
        res = max(mid, res)
        left = mid + 1
    else:
        right = mid - 1

print(res)