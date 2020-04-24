package com.prime.codility.lessons.frogriverone;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FrogRiverOne {

    @SuppressWarnings("unchecked")
    public int solution(int X, int[]A){
        Set<Integer> r = IntStream.rangeClosed(1,X).boxed().collect(Collectors.toSet());
        Set<Integer> a = IntStream.of(A).boxed().collect(Collectors.toSet());
        if(!a.containsAll(r)) return -1;
        Map<Integer, ArrayList<Integer>> times = new HashMap();
        for( int t =0; t<A.length; t++) {
            if (times.containsKey(A[t]) ) times.get(A[t]).add(t);
            else{
                times.put(A[t], new ArrayList<Integer>() );
                times.get(A[t]).add(t);
            }
        }//end for loop
        int[] fastestTime = new int[X+1];

        for(Integer t: a)
            fastestTime[t] = times.get(t).stream().mapToInt(Integer::new).min().getAsInt();
        Arrays.sort(fastestTime);
        return fastestTime[X]; //shortest period of cross
    }


    public static void main(String[] args){
        int X = 5;
        int[] A = {1, 2, 2, 3, 5, 4, 3};
        int N = 1; //not defined yet
        double t1 = System.currentTimeMillis();
        int time = new FrogRiverOne().solution(X, A);
        double t2 = System.currentTimeMillis();
        System.out.println(time + " in "+ (t2-t1));//63 shortest time
    }
}
