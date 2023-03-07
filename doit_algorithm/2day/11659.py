import sys

# sys.stdin = open("input.txt", "r")
n, m = map(int, sys.stdin.readline().split())
arr = list(map(int, sys.stdin.readline().split()))
sum_arr = [0 for _ in range(n+1)]
temp = 0

for i in range(n):
    temp = temp + arr[i]
    sum_arr[i+1] = temp

for i in range(m):
    start, end = map(int, sys.stdin.readline().split())
    print(sum_arr[end] - sum_arr[start-1])