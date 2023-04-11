import sys

# sys.stdin = open("input.txt", "r")
n = int(input())

start = 1
end = 2
total = 3

result = 0

while start < n and end < n:
    if n > total:
        end += 1
        total += end
    elif n < total:
        total -= start
        start += 1
    else:
        result += 1
        total -= start
        start += 1

print(result + 1)
