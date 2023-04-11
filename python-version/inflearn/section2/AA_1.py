import sys
# sys.stdin = open("input.txt", "rt")
n = int(input())
for i in range(n):
    value = input().lower()
    length = len(value)
    for j in range(length // 2):
        if value[j] != value[-1-j]:
            print(f"#{i + 1} NO")
            break
    else:
        print(f"#{i + 1} YES")


# for i in range(n):
#     value = input().lower()
#     length = len(value)
#     for j in range(length):
#         if j == (length - 1) - j or j > (length - 1) - j:
#             print(f"#{i+1} YES")
#             break
#         if value[j] != value[length -1 -j]:
#             print(f"#{i+1} NO")
#             break

