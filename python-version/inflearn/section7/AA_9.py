import sys
sys.stdin = open("input.txt", "r")

n = int(input())
a = list(map(int, sys.stdin.readline().split()))
m = int(input())
a.sort(reverse=True)
dy = [101] * (m + 1)
dy[0] = 0
for i in a:
    for j in range(i, m+1):
        dy[j] = min(dy[j], dy[j-i] + 1)

print(dy[m])