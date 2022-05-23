n = int(input())
res = 0

for i in range(n):
    value = input()
    save_list = [""] * len(value)
    save_list[0] = value[0]
    for j in range(1, len(value)):
        if save_list[j-1] != value[j]:
            if value[j] in save_list:
                break
        save_list[j] = value[j]
    else:
        res += 1

print(res)