import sys
# sys.stdin=open("input.txt", "r")
n = input()

stack = []
res = 0

for i in n:
    if i.isdecimal():
        stack.append(i)
    else:
        a = int(stack.pop())
        b = int(stack.pop())
        if i == '+':
            stack.append(b + a)
        elif i == '-':
            stack.append(b - a)
        elif i == '/':
            stack.append(b / a)
        elif i == '*':
            stack.append(b * a)

print(stack[0])





