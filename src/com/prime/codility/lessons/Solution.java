// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

enum Direction {
    Up, Down
}

class Solution {
    int alive = 0; // alive for sure
    Stack<Integer> forwardPotentials = new Stack<>();

    public int solution(int[] A, int[] B) {
        boolean hasGoneDown = false;
        
        for(int i=0; i<A.length; i++) {
            Direction newDirection = getDirection(i, B);
            if(newDirection==Direction.Down)
                    hasGoneDown = true;

            if(hasGoneDown) {
                if(newDirection==Direction.Down) {
                    forwardPotentials.push(A[i]);
                } else {
                    // kill or be killed
                    if(killBackwardsOrBeKilled(A[i])) {
                        alive++;
                    }
                }
            } else {
                alive++;
            }
        }
        return alive + forwardPotentials.size();
    }

    private Direction getDirection(int index, int[] directions) {
        return directions[index]==0 ? Direction.Up : Direction.Down;
    }

    private boolean killBackwardsOrBeKilled(int actor) {
        Object[] opponent = forwardPotentials.toArray();
        for(int op=opponent.length-1; op>=0; op--) {
            if(actor > (int) opponent[op]) {
                forwardPotentials.pop();
            } else {
                return false;
            }
        }

        // int size = forwardPotentials.size();

        return true;
    }
}
