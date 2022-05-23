import sys
# sys.stdin = open("input.txt", "r")
n = int(input())
arr = list(map(int, sys.stdin.readline().split()))
dp = [0] * n
dp[0] = 1
for i in range(n):
    max_v = 0
    for j in range(i-1, -1, -1):
        if arr[j] > arr[i]:
            if dp[j] > max_v:
                max_v = dp[j]
    dp[i] = max_v + 1

print(max(dp))
