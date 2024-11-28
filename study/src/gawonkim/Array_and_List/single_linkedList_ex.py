# 단일 연결 리스트 예제 코드

# 노드 구현
class Node:
    def __init__(self, data):
        self.data = data    # 노드에 저장될 데이터
        self.next = None    # 다음 노드를 가리키는 포인터

# 단일 연결 리스트 클래스
class LinkedList:
    def __init__(self):
        self.head = None    # 연결 리스트의 첫 번째 노드

    # 리스트 끝에 새로운 노드를 추가
    def append(self, data):
        new_node = Node(data)
        if self.head is None:   # 리스트가 비어있는 경우
            self.head = new_node
            return
        
        current = self.head
        while current.next:    # 마지막 노드까지 이동
            current = current.next
        current.next = new_node    # 마지막 노드의 next를 새 노드로 지정

    # 리스트의 모든 노드 데이터를 출력
    def display(self):
        current = self.head
        while current:
            print(current.data, end = " -> ")
            current = current.next
        print("None")

    # 특정 값을 가진 노드를 삭제
    def delete(self, key):
        current = self.head

        # 삭제할 값이 첫 번째 노드인 경우
        if current and current.data == key:
            self.head = current.next
            current = None
            return
        
        # 삭제할 값을 찾기(삭제할 값이 첫번째 노드가 아닌 경우)
        prev = None
        while current and current.data != key:
            prev = current
            current = current.next

        # 값이 리스트에 없는 경우
        if current is None:
            print(f"{key}는 리스트에 없습니다.")
            return
        
        # 노드 삭제
        prev.next = current.next
        current = None

    # 특정 값을 가진 노드가 있는지 검색
    def search(self, key):
        current = self.head
        while current:
            if current.data == key:   # 특정 값을 가진 노드를 찾았을 때
                return True
            current = current.next   # 특정 값을 가진 노드를 찾지 못했을 때(계속 탐색)
        return False   # 특정 값을 가진 노드를 찾지 못했을 때(False 반환) -> 끝까지 찾지 못한 경우
    
# 단일 연결 리스트 실행 예시
# 프로그램 실행 예시

if __name__ == "__main__":
    linked_list = LinkedList()   # 연결 리스트 생성

    # 노드 추가
    linked_list.append(10)
    linked_list.append(20)
    linked_list.append(30)
    linked_list.append(50)
    linked_list.append(60)
    linked_list.append(70)
    linked_list.append(80)
    linked_list.append(90)
    linked_list.append(100)

    # 리스트 출력
    print("초기 리스트")
    linked_list.display()

    # 원하는 값 검색
    print("20 검색 : ", linked_list.search(20))   # 출력 : True
    print("123 검색 : ", linked_list.search(123))   # 출력 : False  

    # 값 삭제
    linked_list.delete(20)
    print("20 삭제 후")
    linked_list.display()

    # 리스트에 존재하지 않는 값 삭제
    linked_list.delete(120)