import sys
# sys.stdin = open("input.txt", "r")
n = int(input())
res = 0
arr = list(map(int, sys.stdin.readline().split()))
arr.sort()
for inedx, i in enumerate(arr):
    res += sum(arr[:inedx]) + i

print(res)