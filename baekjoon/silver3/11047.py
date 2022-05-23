import sys
# sys.stdin = open("input.txt", "r")
n, k = map(int, input().split())
arr = [int(input()) for _ in range(n)]
arr.sort(reverse=True)

cnt = 0
for i in arr:
    if k // i > 0:
        cnt += k // i
        k = k % i
print(cnt)
