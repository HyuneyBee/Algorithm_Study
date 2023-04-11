import sys

# sys.stdin = open("input.txt", "r")
n, m = map(int, sys.stdin.readline().split())
arr = list(map(int, sys.stdin.readline().split()))

temp = 0
sum_arr = []

for i in range(n):
    temp = temp + arr[i]
    sum_arr.append(temp % m)

cnt = [0 for _ in range(m)]

for i in sum_arr:
    cnt[i] += 1

result = cnt[0]

for i in range(m):
    result += cnt[i] * (cnt[i] - 1) // 2

print(result)


