package ArraysPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class RotationsInSorted {
    //since the array was sorted and then rotated all we have to do is find the position of the smallest no.
    //and that gives us the number of rotations the array went through
    public static void main(String[] args) {
        int[] list = {12, 56, 788, 34, 345, 567, 349};
        Arrays.sort(list);

        //here i'm taking an array sorting it, the rotating it a certain number no. of times and then checking to see if
        // the program can find out the number of times a sorted array has been rotated
        for(int i = 0; i <4; i ++)
        {
            int a = list[list.length - 1];
            for(int j = list.length - 1; j > 0; j--)
            {
                list[j] = list[j - 1];
            }
            list[0] = a;
            System.out.println("Array after "+ (i +1) + " rotation " + Arrays.toString(list));
        }
        System.out.println("Rotated array " + Arrays.toString(list));
        int noOfRotations = countRotations(list);
        System.out.println("The sorted array has been rotated " + noOfRotations + " times");

    }
    public static int countRotations(int[] list)
    {
        int minindex = -1;
        //where the min value is located
        int minvalue = list[0];

        for(int i = 0; i < list.length; i ++)
        {
            if(minvalue > list[i])
            {
                minvalue = list[i];
                minindex = i;
            }
        }
        return minindex;
        //this is the position of the smallest number in the array
    }


}
