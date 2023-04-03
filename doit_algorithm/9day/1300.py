import sys

# sys.stdin = open("input.txt", "r")

n = int(input())
k = int(input())

start = 1
end = k

while start <= end:
    mid = (start + end) // 2

    cnt = 0
    for i in range(1, n+1):
        value = (mid // i)
        if value > n:
            value = n
        cnt += value

    if cnt < k:
        start = mid + 1
    else:
        end = mid - 1

print(start)