import sys

# sys.stdin = open("input.txt", "r")

n, m = map(int, sys.stdin.readline().split())

arr = [int(input()) for _ in range(n)]

arr.sort(reverse=True)

ans = 0
for i in arr:
    if m // i != 0:
        ans += m // i
        m = m % i

print(ans)