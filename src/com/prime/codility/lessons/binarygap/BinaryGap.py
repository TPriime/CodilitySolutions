def solution(N):
    b = bin(N)[2:]
    count = 0;
    max = 0;

    for c in b:
        if c == '0':
            count += 1
        else:
            max = count if max < count else max
            count = 0
            
    return max
