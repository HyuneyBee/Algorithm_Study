import sys
# sys.stdin = open("input.txt", "r")
n = int(input())
arr = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]
dp = [[0] * n for _ in range(n)]
dp[0][0] = 1

for i in range(n):
    for j in range(n):
        if dp[i][j] >= 1 and arr[i][j] != 0:
            nx = i + arr[i][j]
            ny = j + arr[i][j]
            if nx < n:
                dp[nx][j] += dp[i][j]
            if ny < n:
                dp[i][ny] += dp[i][j]

print(dp[n-1][n-1])
