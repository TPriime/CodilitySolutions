package com.prime.codility.lessons.maxcounters;

import java.util.Arrays;

public class MaxCounters {
    public int[] solution(int N, int[] A){
        int[] s = new int[N];
        int max = 0;
        for(int x=0; x<A.length; x++){
            if (A[x]<=N) s[A[x]-1] +=1;
            else{
                int[] c = s;
                Arrays.sort(c);
                max = c[c.length - 1];
                for(int i=0; i<N; i++) s[i] = max;
            }
        } return s;
    }
}
