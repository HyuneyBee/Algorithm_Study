import sys
# sys.stdin=open("input.txt", "r")
num, m = map(int, sys.stdin.readline().split())
num = list(map(int, str(num)))
stack = []
for i in num:
    while stack and m > 0 and stack[-1] < i:
        stack.pop()
        m -= 1
    stack.append(i)

if m != 0:
    stack = stack[:-m]

res = ''.join(map(str, stack))
print(res)
