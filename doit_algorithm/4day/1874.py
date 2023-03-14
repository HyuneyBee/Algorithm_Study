import sys

# sys.stdin = open("input.txt", "r")
n = int(input())
arr = [int(sys.stdin.readline()) for _ in range(n)]

stack = [1]
result = ["+"]
flag = True
count = 1

while arr:
    if count < arr[0]:
        count += 1
        stack.append(count)
        result.append("+")
    elif stack[-1] == arr[0]:
        stack.pop()
        result.append("-")
        arr.pop(0)
    else:
        flag = False
        break

if flag:
    for i in result:
        print(i)
else:
    print("NO")