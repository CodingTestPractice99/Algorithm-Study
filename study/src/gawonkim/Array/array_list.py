# Python 리스트 (동적 배열처럼 동작)
array = [71, 25, 13, 4, 5, 23, 12, 463, 15, 10]
print("배열:", array)

# 2. 특정 인덱스 접근
print("2번째 요소:", array[1])

# 3. 배열의 길이 확인
print("배열의 길이 : ", len(array))

# 4. 삽입 (중간에 추가)
array.insert(2, 300)  # 2번 인덱스에 25 추가
print("삽입 후 배열:", array)

# 5. 삭제
array.pop(3)  # 3번 인덱스 삭제
print("삭제 후 배열:", array)

# 6. 배열의 순회
print("배열 순회:")
for element in array:
    print(element)

# 7. 배열 정렬
array.sort()  # 오름차순 정렬
print("정렬된 배열:", array)