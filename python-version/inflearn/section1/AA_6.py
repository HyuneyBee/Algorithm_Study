import sys
# sys.stdin = open("input.txt", "rt")
n = int(input())
a = list(map(int, input().split()))
cnt = []

def digit_sum(x):
    tmp = 0
    while x > 0:
        tmp += x % 10
        x = x // 10
    return tmp

max = -21470000
for i in a:
    value = digit_sum(i)
    if value > max:
        res = i
        max = value

print(res)