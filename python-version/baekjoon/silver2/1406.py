import sys
sys.stdin = open("input.txt", "r")
stack_1 = list(sys.stdin.readline().strip())
n = int(sys.stdin.readline().strip())
stack_2 = []
for _ in range(n):
    value = sys.stdin.readline().strip()
    if value[0] == "P":
        stack_1.append(value[2])
    elif value == "L":
        if not stack_1:
            pass
        else:
            stack_2.append(stack_1.pop())
    elif value == "D":
        if not stack_2:
            pass
        else:
            stack_1.append(stack_2.pop())
    elif value == "B":
        if not stack_1:
            pass
        else:
            stack_1.pop()
stack_1.extend(reversed(stack_2))
print("".join(stack_1))
