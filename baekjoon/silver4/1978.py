import sys
# sys.stdin = open("input.txt", "r")

n = int(input())

def check(v):
    if v == 1 or v == 0:
        return False
    for i in range(2, v):
        if v % i == 0:
            return False
    return True

res = 0
value = list(map(int, sys.stdin.readline().split()))
for i in range(n):
    if check(value[i]):
        res += 1
print(res)