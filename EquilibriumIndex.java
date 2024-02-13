package ArraysPractice;

import java.util.Arrays;

public class EquilibriumIndex {
    public static void main(String[] args)
    {
        int[] list = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println("Original array: " + Arrays.toString(list));
        findingEquilibrium(list);
    }
    public static void findingEquilibrium(int[] list)
    {
        int sum = 0;
        for(int a : list)
        {
            sum += a;
        }

        int runningSum = 0;

        for(int i = 0; i < list.length; i ++)
        {
            int n = list[i];

            if(sum - runningSum - n == runningSum)
            {
                System.out.println("Equilibrium indices found at: " + i);
            }

            runningSum += n;
            //update the running sum as we move through the array
        }
    }
}
