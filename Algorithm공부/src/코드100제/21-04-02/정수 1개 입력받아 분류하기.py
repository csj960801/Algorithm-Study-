n = int(input())
# 0이상의 자연수가 입력되었을 경우
if n < 0:
    if n % 2 ==0:
        print('A')
    else:
        print('B')
else:
    if n % 2 == 0:
        print('C')
    else:
        print('D')