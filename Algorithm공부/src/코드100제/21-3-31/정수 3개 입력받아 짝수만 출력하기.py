a,b,c = input().split()
result = list({int(a), int(b), int(c)});

for i in result:
    if i % 2 == 0:
        print(i)