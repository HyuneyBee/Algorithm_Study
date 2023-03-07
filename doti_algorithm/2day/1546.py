import sys

# sys.stdin = open("input.txt", "r")
n = int(input())
score_list = list(map(int, sys.stdin.readline().split()))
max_score = max(score_list)

result = 0

for i in score_list:
    result += i / max_score * 100

print(result / n)