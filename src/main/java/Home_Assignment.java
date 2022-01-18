import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Home_Assignment {

    /**
     * Get a random integer in range
     * @param min - the min number in the range
     * @param max - the max number in the range
     * @return - a random integer number between the min number and max number inclusive.
     */

    public static int randomInRange(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }


    /*
    The space complexity is array from size max-min+1 and constant number of variables – O(n).
    In the worst case, the time complexity is not bounded because we are drawing random numbers until we
    get all the numbers in range. The expected time complexity is O(nlog(n)) – the expected number of draws
    until we draw all the elements.
     */

    public static void printRange (int min, int max) {
        int range = max-min+1;
        boolean [] arr = new boolean[range];
        int count = 0;
        while (count < range){
            int curr = randomInRange(min,max);
            if (!arr[curr-min]) {
                count++;
                arr[curr-min] = true;
                System.out.println(curr);
            }
        }
    }

    /*
    Alternative Solution:
    The space complexity is array from size max-min+1 and constant number of variables – O(n).
    The time complexity is O(n) – we have two iterations, the first one adds all the elements
     and the second one removes all of them.
     */

    public static void printRange2 (int min, int max){
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = min; i <= max; i++)
            nums.add(i);

        Random rand = new Random();
        while (!nums.isEmpty()) {
            int numsLen = nums.size();
            int index = rand.nextInt(numsLen);
            Collections.swap(nums, index, numsLen - 1);
            System.out.println(nums.remove(numsLen - 1));
        }
    }


}

