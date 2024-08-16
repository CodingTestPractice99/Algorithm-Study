arr = []

for i in range(10):
    num = int(input())
    arr.append(num % 42)

arr = set(arr)  
print(len(arr))

# 자료형을 set으로 바꿔주면 됨. 중복을 허용하지 않는 자료형태이기 때문에 중복 요소들이 제거된 상태가 됨
# 그 이후 다시 print(len)을 통해 출력해주면 됨