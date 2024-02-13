package ArraysPractice;

import java.util.Arrays;

public class EvenOddSeperate {
    public static void main(String[] args) {
        int[] list = {23, 45, 56, 34, 7,9, 33, 44};
        int left = 0;
        int right = list.length -1;
        int temp = 0;
        System.out.println("Original Array: " + Arrays.toString(list));


        while(left<right)
        {
            if(left<right && ((list[left]%2)!=0))
            {
                left++;
                //here we're moving one postion to the right
                //if it's odd we let it be
            }
            else if(left<right && (list[right]%2 == 0))
            {
                right--;
            }
            else if(left<right)
            {
                temp = list[left];
                list[left] = list[right];
                list[right] = temp;
                left++;
                right--;
            }
        }

        System.out.println("Array after separation: " + Arrays.toString(list));
    }
}
