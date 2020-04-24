package com.prime.codility.lessons.frogriverone;

import java.util.*;

class FrogRiverOne3 {

    @SuppressWarnings("unchecked")
    public int solution(int X, int[]A, int N){
        Map<Integer, Integer> times = new HashMap<Integer, Integer>();

        for( int t =0; t<A.length; t++) {
            if (times.containsKey(A[t]) ){
                if(times.get(A[t])>t)
                    times.put(A[t], t);
            }
            else times.put(A[t], t);
        }//end for loop

        if(times.size() != X) return -1;
        int time = Collections.max(times.values());
        return time; //shortest period of cross
    }


    public static void main(String[] args){
        int X = 5;
        int[] A = {1, 2, 2, 3, 5, 4, 3};
        int N = 1; //not defined yet
        double t1 = System.currentTimeMillis();
        int time = new FrogRiverOne3().solution(X, A, N);
        double t2 = System.currentTimeMillis();
        System.out.println(time + " in "+ (t2-t1));//63 shortest time
    }
}

