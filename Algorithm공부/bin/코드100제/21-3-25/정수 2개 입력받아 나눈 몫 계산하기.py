#python언어에서는 나눈 몫을 계산하는 연산자(//, floor division)를 제공한다.
#a//b 와 같이 작성하면, a를 b로 나눈 몫(quotient)을 계산해준다.
a,b = input().split()
c = int(a)//int(b)
print(c)