numbers = []	

for _ in range(28):
    student_number = int(input())
    numbers.append(student_number)
    
for num in range(1, 31) :	# 1부터 30까지의 숫자를 num에 넣음
    if num not in numbers :	# numbers 리스트에 해당 숫자가 없다면 다음행에서 숫자가 없다는 메시지 출력
        print("%d" %num)
