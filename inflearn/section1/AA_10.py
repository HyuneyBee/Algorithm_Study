import sys
# sys.stdin = open("input.txt", "rt")
n = int(input())
a = list(map(int, input().split()))
res = 0
cnt = 0

for i in a:
    if i == 1:
        cnt += 1
        res += cnt
    elif i == 0:
        cnt = 0

print(res)