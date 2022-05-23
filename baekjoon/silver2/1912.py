import sys
# sys.stdin = open("input.txt", "r")
n = int(input())
arr = list(map(int, sys.stdin.readline().split()))
dp = [0] * n
dp[0] = arr[0]
for i in range(1, n):
    max_v = 0
    if dp[i-1] >= arr[i]:
        dp[i] = dp[i-1] + arr[i]
    else:
        if dp[i-1] >= 0:
            dp[i] = dp[i-1] + arr[i]
        else:
            dp[i] = arr[i]

print(max(dp))