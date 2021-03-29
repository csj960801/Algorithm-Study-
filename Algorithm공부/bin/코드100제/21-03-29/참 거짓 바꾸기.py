# 참, 거짓의 논리값 인 불(boolean) 값을 다루어주는 예약어는 not, and, or 이 있고,
# 불 값들 사이의 논리(not, and, or) 연산 결과도 마찬가지로 True 또는 False 의 불 값으로 계산 된다.
#
# 정수값: 0은 False 이고, 나머지 정수 값들은 True 로 평가된다.
# 빈 문자열: "" 나 ''는 False 이고, 나머지 문자열들은 True 로 평가된다.
n = bool(int(input()))
print(not n)