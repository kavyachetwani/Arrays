package ArraysPractice;

import java.util.Arrays;

public class FindPairSum {
    public static void main(String[] args) {
        int[] numbers = {8, 7, 2, 5, 3, 6};
        int target = 10;
        //going to use sort to find pair
        Arrays.sort(numbers);
        int count = 0;
        int low = 0;
        int high = (numbers.length - 1);
        while(low<high)
        {
            if(numbers[low] + numbers[high] == target)
            {
                System.out.printf("Pair found at (%d , %d) %n", numbers[low], numbers[high]);
                count++;
                low++;
                high--;
            }
            else if(numbers[low] + numbers[high] < target)
            {
                low++;
            }
            else
            {
                high--;
            }
        }
        if(count == 0)
        {
            System.out.println("Pair is not found");
        }

        anotherWay(numbers, 11);


    }

    public static void anotherWay(int[] numbers, int target)
    {
        for(int i = 0; i < numbers.length - 1; i++)
        {
            for(int j = i + 1; j < numbers.length; j ++)
            {
                if(numbers[i] + numbers[j] == target)
                {
                    System.out.printf("Pair found at (%d, %d) %n", numbers[i], numbers[j]);
                }
            }
        }
    }
}
