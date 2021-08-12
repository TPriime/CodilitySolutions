// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int[] A, int K) {
        if(K==A.length || A.length==0) return A;
        for(int k=0; k<K; k++) {
            int prev = A[A.length-1]; // hold last/previous value
            int temp; // hold current value for switching

            for(int i=0; i<A.length; i++) {
                temp = A[i];
                A[i] = prev;
                prev = temp;
            }
        }
        return A;
    }
}
