# 입력된 두 정수(a, b) 중 큰 값을 출력하는 프로그램을 작성해보자.
# 단, 3항 연산을 사용한다.
# 3개의 요소로 이루어지는 3항 연산은
# "x if C else y" 의 형태로 작성이 된다.
# - C : True 또는 False 를 평가할 조건식(conditional expression) 또는 값
# - x : C의 평가 결과가 True 일 때 사용할 값
# - y : C의 평가 결과가 True 가 아닐 때 사용할 값
a,b,c = input().split()
result = list({int(a),int(b),int(c)});

min=0;
result.sort()
#sortArr = sorted(result)

if int(a) == int(b) == int(c):
    print(int(a))
else:
    for i in result:
        #print(i)
        min = result[1]
        if min > i:
            min = i
            print(min)