class Node:
    def __init__(self, data):
        self.data = data
        self.prev = None  # 이전 노드를 가리키는 포인터
        self.next = None  # 다음 노드를 가리키는 포인터

class DoublyLinkedList:
    def __init__(self):
        self.head = None  # head : 리스트의 첫 번째 노드를 가리키는 포인터

    # 리스트의 끝에 노드 추가
    def append(self, data):
        new_node = Node(data)
        if self.head is None:  # 리스트가 비어있는 경우
            self.head = new_node
            return 
        
        last = self.head  # 마지막 노드에 헤드 추가
        while last.next:  # 마지막 노드까지 이동
            last = last.next
        last.next = new_node  # 마지막 노드의 next를 새 노드로 연결
        new_node.prev = last  # 새 노드의 prev 를 마지막 노드로 설정
        '''
        위에서 말하는 마지막 노드는 기존의 새 노드를 추가하기 이전의 마지막 노드를 의미함.
        '''
    
    # 리스트의 앞에 노드 추가
    def prepend(self, data):
        new_node = Node(data)
        if self.head is None:  # 리스트가 비어있는 경우
            self.head = new_node
            return

        new_node.next = self.head
        self.head.prev = new_node
        self.head = new_node

    # 특정 노드 삭제
    def delete(self, data):
        current = self.head
        while current:
            if current.data == data:
                # 삭제할 노드가 헤더일 경우
                # 삭제할 노드가 헤더일 경우의 처리
                if current.prev is None:
                    self.head = current.next
                    # 새 헤드가 존재하면 prev를 None로 설정
                    if self.head:
                        self.head.prev = None
                else:
                    current.prev.next = current.next 
                    if current.next: # 삭제할 노드의 다음 노드가 존재하면 prev를 갱신
                        current.next.prev = current.prev
                return
            current = current.next

    # 노드 출력
    def display(self):
        current = self.head
        while current:
            print(current.data, end = " <-> ")
            current = current.next
        print("None")

# 사용 예제
dll = DoublyLinkedList()
dll.append(10)
dll.append(20)
dll.append(30)
dll.display()  # 10 <-> 20 <-> 30 <-> None

dll.prepend(5)
dll.display()  # 5 <-> 10 <-> 20 <-> 30 <-> None

dll.delete(20)
dll.display()  # 5 <-> 10 <-> 30 <-> None