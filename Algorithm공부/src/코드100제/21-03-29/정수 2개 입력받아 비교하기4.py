a,b = input().split()

#삼항연산자 =>  [true일 경우 값] if [조건] else [False일 경우 값]
result = True if int(a) != int(b) else False
print(result)