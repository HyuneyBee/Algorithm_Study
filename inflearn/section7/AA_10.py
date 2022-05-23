import sys
sys.stdin = open("input.txt", "r")

n, m = map(int, sys.stdin.readline().split())
dy = [0] * (m + 1)
for i in range(n):
    v, t = map(int, sys.stdin.readline().split())
    for j in range(m, t-1, -1):
        dy[j] = max(dy[j], dy[j-t] + v)

print(dy[m])