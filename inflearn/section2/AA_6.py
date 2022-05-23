import sys
sys.stdin = open("input.txt", "rt")
n = int(input())

a = [list(map(int, input().split())) for _ in range(n)]

res = 0
for i in range(n):
    garo = 0
    sero = 0
    for j in range(n):
        garo += a[i][j]
        sero += a[j][i]
    if garo >= res:
        res = garo
    if sero > res:
        res = sero

left = 0
right = 0
for i in range(n):
    left += a[i][i]
    right += a[i][n-1-i]
    if left > res:
        res = left
    if right > res:
        res = right

print(res)

