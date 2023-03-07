import sys

# sys.stdin = open("input.txt", "r")
n = int(input())
str_list = list(input())

result = 0
for i in str_list:
    result += int(i)

print(result)
