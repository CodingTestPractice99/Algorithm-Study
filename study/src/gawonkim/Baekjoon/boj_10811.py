N, M = map(int, input().split())

arr = []
for _ in range(1, N+1):
    arr.append(_)

for i in range(M):
    i, j = map(int, input().split())
    arr[i - 1:j] = arr[i - 1:j][::-1]

print(' '.join(map(str, arr)))