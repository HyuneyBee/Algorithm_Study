import sys
# sys.stdin = open("input.txt", "r")
n = int(input())
arr = list(map(int, sys.stdin.readline().split()))
res = 0
dp = [0] * n
dp[0] = 1

for i in range(1, n):
    max_v = 0
    for j in range(i-1, -1, -1):
        if arr[i] > arr[j]:
            if dp[j] > max_v:
                max_v = dp[j]
    dp[i] = max_v + 1

print(max(dp))
