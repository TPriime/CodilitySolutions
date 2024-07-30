def solution(A, B, K):
    # get minimum number divisible by K
    f = A if A % K == 0 else (A + K - (A + K) % K)
    if f > B:
        return 0

    m = (B - f)
    return (m // K) + 1
