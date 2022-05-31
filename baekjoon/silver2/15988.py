import sys

# sys.stdin = open("input.txt", "r")
t = int(input())
dp = [0] * 1000000
dp[0] = 1
dp[1] = 2
dp[2] = 4

def solution(n):
    for i in range(3, n):
        dp[i] = (dp[i - 1] + dp[i - 2] + dp[i - 3]) % 1000000009

solution(1000000)

for i in range(t):
    n = int(input())
    print(dp[n-1])


