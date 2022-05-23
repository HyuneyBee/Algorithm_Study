import sys
# sys.stdin = open("input.txt", "r")
n, m= map(int, input().split())
arr = list(map(int, input().split()))
left = 0
right = max(arr)
res = 0
while left <= right:
    mid = (left + right) // 2
    value = 0
    for i in arr:
        if i > mid:
            value += i - mid
        if value >= m:
            break
    if value >= m:
        res = max(res, mid)
        left = mid + 1
    else:
        right = mid -1
print(res)

