package ArraysPractice;

import java.util.Arrays;

public class Replacing {
    public static void main(String[] args) {
        int[] list = {2, 6, 54, 89, 53, 29, -7, 61, -12};
        System.out.println("Original array: " + Arrays.toString(list));
        System.out.println("Replaced array: " + Arrays.toString(largestNumArray(list)));

    }

    public static int[] largestNumArray(int[] list)
    {
        int size = list.length;

        int maxValueFromRight = list[size - 1];
        list[size - 1] = -1;


        for(int i = size -2 ; i >=0; i --)
        {
            int temp = list[i];
            list[i] = maxValueFromRight;

            if(maxValueFromRight< temp)
            {
                maxValueFromRight = temp;
                //list[i] = maxValueFromRight;
                //this step is to maintain the number itself if it is greater than any number on it's right
            }
        }
        return list;
    }
}
