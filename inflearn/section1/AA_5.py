import sys
# sys.stdin = open("input.txt", "rt")
n, k = map(int,input().split())
cnt = [0 for _ in range(n+k)]
for i in range(1,n):
    for j in range(1,k):
        cnt[i+j] += 1

for idx, x in enumerate(cnt):
    if x==max(cnt):
        print(idx+1, end=" ")