package ArraysPractice;

import java.util.Arrays;

public class SeperatingZeroes_Ones {
    public static void main(String[] args) {
        int[] list = {1,0,1,0,0,0,1,0,1,1,1,1,1};
        int left = 0;
        int right = list.length - 1;

        System.out.println("Original Array: " + Arrays.toString(list));

        while(left<right)
        {
            if(list[left] == 1 && left<right)
            {
                left++;
                //if the left index has a zero, we leave it as it is and increment to the next index
            }
            if(list[right] == 0 && left<right)
            {
                right--;
                //if the right index has a one, we leave it as it is and decrement to the next index
            }
            if(left<right)
            {
                list[left] = 1;
                list[right] = 0;
                left++;
                right--;
            }

        }
        System.out.println("Array after action: " + Arrays.toString(list));


    }
}
