import java.util.*;

class FrogRiverOne4 {
    public int solution(int X, int[] A) {
        int target = getTarget(X);
        Set<Integer> set = new HashSet<>();
        int currentSum = 0;

        for(int i=0; i<A.length; i++) {
            if(set.add(A[i])) {
                currentSum += A[i];
                if(currentSum==target) return i;
            }
        }
        return -1;
    }

    int getTarget(int X) {
        return (X + (X*X))/2;
    }
}
