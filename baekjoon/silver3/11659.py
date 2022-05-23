import sys
# sys.stdin = open("input.txt", "r")
n,m = map(int, sys.stdin.readline().split())
arr = list(map(int, sys.stdin.readline().split()))
sum_arr= [0 for _ in range(n)]

for i in range(n):
    if i == 0:
        sum_arr[0] = arr[i]
    else:
        sum_arr[i] = sum_arr[i-1] + arr[i]

for i in range(m):
    s, e = map(int, sys.stdin.readline().split())
    if s == 1:
        print(sum_arr[e-1])
    else:
        print(sum_arr[e-1] - sum_arr[s-2])