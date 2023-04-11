import sys

# sys.stdin = open("input.txt", "r")
n, m = map(int, sys.stdin.readline().split())
str_arr = list(input())
check_list = list(map(int, sys.stdin.readline().split()))
check_secret = 0
check_password = [0 for _ in range(4)]
result = 0

start = 0
end = m - 1

def remove_dna(dna):
    global check_password, check_secret, check_list
    if dna == 'A':
        if check_password[0] == check_list[0]:
            check_secret -= 1
        check_password[0] -= 1
    elif dna == 'C':
        if check_password[1] == check_list[1]:
            check_secret -= 1
        check_password[1] -= 1
    elif dna == 'G':
        if check_password[2] == check_list[2]:
            check_secret -= 1
        check_password[2] -= 1
    elif dna == 'T':
        if check_password[3] == check_list[3]:
            check_secret -= 1
        check_password[3] -= 1


def add_dna(dna):
    global check_password, check_list, check_secret
    if dna == 'A':
        check_password[0] += 1
        if check_password[0] == check_list[0]:
            check_secret += 1
    elif dna == 'C':
        check_password[1] += 1
        if check_password[1] == check_list[1]:
            check_secret += 1
    elif dna == 'G':
        check_password[2] += 1
        if check_password[2] == check_list[2]:
            check_secret += 1
    elif dna == 'T':
        check_password[3] += 1
        if check_password[3] == check_list[3]:
            check_secret += 1

for i in range(m):
    add_dna(str_arr[i])

for i in range(4):
    if check_list[i] == 0:
        check_secret += 1

if check_secret == 4:
    result += 1

for _ in range(n-m):
    remove_dna(str_arr[start])
    start += 1
    end += 1
    add_dna(str_arr[end])
    if check_secret == 4:
        result += 1

print(result)