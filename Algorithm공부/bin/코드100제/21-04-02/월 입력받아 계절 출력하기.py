n = int(input())
# 월 : 계절 이름
# 12, 1, 2 : winter
#  3, 4, 5 : spring
#  6, 7, 8 : summer
#  9, 10, 11 : fall
arr = list([{12,1,2},{3,4,5},{6,7,8},{9,10,11}])
if n in arr[0]:
    print("winter")
elif n in arr[1]:
    print("spring")
elif n in arr[2]:
    print("summer")
elif n in arr[3]:
    print("fall")
