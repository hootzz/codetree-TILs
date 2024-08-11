a, b, c = map(int, input().split())

result = a

if result > b and result > c:
    if b > c:
        result = b
    else:
        result = c
elif result < b and result < c:
    if b > c:
        result = c
    else:
        result = b


print(result)