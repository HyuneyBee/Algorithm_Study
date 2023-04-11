import sys

sys.stdin = open("input.txt", "r")

n, m = map(int, sys.stdin.readline().split())
A = list(map(int, sys.stdin.readline().split()))

start = max(A)
end = sum(A)

while start <= end:
    mid = (start + end) // 2
    count = 0
    sum = 0
    for i in range(n):
        if sum + A[i] > mid:
             count += 1
             sum = 0
        sum += A[i]

    if sum != 0:
        count += 1

    if count > m:
        start = mid + 1
    else:
        end = mid - 1


print(start)
