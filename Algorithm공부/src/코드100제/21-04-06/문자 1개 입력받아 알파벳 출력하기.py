# 참고
# 알파벳 문자 a의 정수값은 ord('a')로 알아낼 수 있다.
# chr(정수값)을 이용하면 유니코드 문자로 출력할 수 있다.
# print(..., end=' ') 와 같이 작성하면 값 출력 후 공백문자 ' '를 출력한다. 즉, 마지막에 줄을 바꾸지 않고 빈칸만 띄운다.
# (end='\n'로 작성하거나 생략하면, 값을 출력한 후 마지막(end)에 줄바꿈(newline)이 된다.)

char = ord(input())
word = ord('a')
while word<=char :
    print(chr(word), end=' ')
    word += 1