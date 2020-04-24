package com.prime.codility.lessons.fish;

public class Fish {
    public int solution(int[] A, int[] B) {
        int y = 0,z = A.length, count=0;
        if(B[0]==0){
            y=1; count++;
        }
        if(B[B.length-1]==1){
            z=A.length-1; count++;
        }
        for(int x=y; x<z; x++){
            count++;
            if(B[x] ==0) {
                for(int u=x-1; u>=y; u--){
                    if((B[x]!=B[u]) & compare(A[x],A[u])==1 & A[u]!=0){
                        count--; A[u] = 0;
                    }
                    else if((B[x]!=B[u]) & compare(A[x],A[u])==-1 & A[u]!=0){
                        count--; break;
                    }
                }
            }
        }
        return count;
    }

    public int compare(int A, int B){ if(A>B) return 1; else return -1; }
}
