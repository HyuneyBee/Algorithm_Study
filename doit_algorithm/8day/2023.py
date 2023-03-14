import math
import sys

# sys.stdin = open("input.txt", "r")
n = int(input())

result = []

def is_prime(num):
    for i in range(2, int(math.sqrt(num)) + 1):
        if num % i == 0:
            return False
    return True

def dfs(num, cnt):
    if cnt == n and is_prime(num):
        print(num)
        return

    if is_prime(num):
        for i in range(1, 10):
            v = (num * 10) + i
            dfs(v, cnt+1)

for i in range(2, 10):
    dfs(i, 1)

