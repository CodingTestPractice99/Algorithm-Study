# Numpy 를 이용한 배열
import numpy as np

# 1. 배열 생성
array = np.array([10, 21, 23, 654, 12])
print("Numpy 배열 : ", array)

# 2. 배열의 크기 확인
print("배열의 크기 : ", array.size)

# 3. 특정 인덱스 접근
print("2번째 요소:", array[1])

# 4. 배열 연산
array = array * 2  # 모든 요소에 2를 곱하기
print("모든 요소에 2를 곱한 결과:", array)

# 5. 배열의 슬라이싱
print("첫 3개의 요소 : ", array[:3])

# 6. 배열의 평균 및 합계 계산
print("배열의 합계:", np.sum(array))
print("배열의 평균:", np.mean(array))

# 7. 다차원 배열
matrix = np.array([[1, 2, 3], [4, 5, 6], [7, 8, 9]])
print("2차원 배열:")
print(matrix)

# 8. 특정 요소 접근
print("2x2 요소:", matrix[1][1])  # 5 출력