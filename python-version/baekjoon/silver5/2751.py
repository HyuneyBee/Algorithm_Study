import sys
# sys.stdin = open("input.txt", "r")
n = int(input())

res = [int(sys.stdin.readline()) for _ in range(n)]
res.sort()
for i in res:
    print(i)