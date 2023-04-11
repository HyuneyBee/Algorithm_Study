import sys

# sys.stdin = open("input.txt", "r")
n = int(input())
m = int(input())
arr = list(map(int, sys.stdin.readline().split()))
arr.sort()

start = 0
end = n -1

result = 0

while start < end:
    if arr[start] + arr[end] == m:
        result += 1
        start += 1
        end -= 1
    elif arr[start] + arr[end] > m:
        end -= 1
    else:
        start += 1

print(result)