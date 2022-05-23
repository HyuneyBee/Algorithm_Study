original_data = set(range(1, 10001))
generate_data = set()
for i in original_data:
    str_value = str(i)
    value = i
    for j in range(len(str_value)):
        value += int(str_value[j])
    generate_data.add(value)
res = list(original_data - generate_data)
res.sort()
for i in res:
    print(i)