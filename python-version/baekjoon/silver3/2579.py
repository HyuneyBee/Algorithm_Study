import sys
# sys.stdin = open("input.txt", "r")
n = int(input())

arr = [int(input()) for _ in range(n)]
dp = [0] * n
if n == 0:
    print(0)
elif n == 1:
    print(arr[0])
elif n == 2:
    print(arr[0] + arr[1])
elif n == 3:
    print(max(arr[1] + arr[2], arr[0] + arr[2]))
else:
    dp[0] = arr[0]
    dp[1] = arr[0] + arr[1]
    dp[2] = max(arr[1] + arr[2], arr[0] + arr[2])
    for i in range(3, n):
        dp[i] = max(arr[i] + arr[i-1] + dp[i-3], dp[i-2] + arr[i])
    print(dp[-1])