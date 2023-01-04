/* You are given an integer array nums... In one move, you can pick an index i where 0 <= i < nums.length and increment nums[i] by 1... Return the minimum number of moves to make every value in nums unique... The test cases are generated so that the answer fits in a 32-bit integer...
 * Eg 1: nums = [1, 2, 2]            Output = [1, 2, 3] = 1
 * Eg 2: nums = [3, 2, 1, 2, 1, 7]   Output = [3, 4, 1, 2, 5, 7] = 6
 */
import java.util.*;
public class Unique
{
    public int MinimumIncrement(int nums[])
    {
        Arrays.sort(nums);    // Sorting array...
        int result = 0, need = 0;
        for (int a : nums) {    // Using for loop...
            result += Math.max(need - a, 0);
            need = Math.max(a, need) + 1;
        }
        return result;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x, a;
        System.out.print("Enter the size of the array : ");
        x = sc.nextInt();
        int nums[] = new int[x];
        for(int i = 0; i < nums.length; i++)
        {
            System.out.print("Enter the "+(i+1)+" element : ");
            a = sc.nextInt();
            nums[i] = a;
        }
        Unique unique = new Unique();
        System.out.println("Minimum increment to make the array unique : "+unique.MinimumIncrement(nums));
        sc.close();
    }
}

// Time Complexity  - O(nlogn) time...
// Space Complexity - O(n) space...

/* DEDUCTIONS :-
 * 1. Since we do not know how many numbers and which number are repeated we sort them in ascending order...
 * 2. The simplest unique array will be the set of Natural numbers...
 */