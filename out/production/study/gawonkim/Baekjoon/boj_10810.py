N, M = map(int, input().split())
bucket = [0]*(N+1)

for a in range(M):
    i,j,k = map(int, input().split())
    for q in range(i, j+1):
        bucket[q] = k

for z in range(1,N+1):
    print(bucket[z], end = ' ')