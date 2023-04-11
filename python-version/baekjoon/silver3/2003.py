import sys
# sys.stdin = open("input.txt", "r")
n, m = map(int, input().split())
arr = list(map(int, sys.stdin.readline().split()))
left = 0
right = 0
cnt = 0
while left <= n and right <=n:
    total = sum(arr[left:right])
    if total == m:
        cnt +=1
        left +=1
    elif total > m:
        left += 1
    else:
        right +=1

print(cnt)
