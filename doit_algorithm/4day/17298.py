import sys

# sys.stdin = open("input.txt", "r")
n = int(input())
ans = [0] * n
arr = list(map(int, sys.stdin.readline().split()))

stack = []

for i in range(n):
    while stack and arr[stack[-1]] < arr[i]:
        ans[stack.pop()] = arr[i]
    stack.append(i)

while stack:
    ans[stack.pop()] = -1

result = ""

for i in ans:
    print(i, end=" ")

print(result)
