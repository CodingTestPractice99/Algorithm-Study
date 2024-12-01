# 내 풀이

num = int(input())
num_list = list(map(int, input().split()))
find_num = int(input())

count = 0
for _ in range(len(num_list)):
    if num_list[_] == find_num:
        count += 1
    else:
        continue

print(count)

################################################################

# 파이썬 리스트 활용(내장 함수 활용)
num = int(input())
num_list = list(map(int, input().split()))
find_num = int(input())

print(num_list.count(find_num))

################################################################

# Numpy 활용
import numpy as np

num = int(input())
num_list = np.array(list(map(int, input().split())))
find_num = int(input())

count = np.sum(num_list == find_num)
print(count)