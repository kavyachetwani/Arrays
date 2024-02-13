package ArraysPractice;

import java.util.Arrays;

public class LinearTimeSorting {
    public static void main(String[] args) {
        int[] list = {1,0,0,1,0,1,0,1,0,1};
        System.out.println("Orignal Array: " + Arrays.toString(list));
        System.out.println("Altered Array: " + Arrays.toString(sorted(list)));
    }
    public static int[] sorted(int[] list)
    {
        int k = 0;
        for(int i = 0; i < list.length; i++)
        {
            if(list[i] == 0)
            {
                list[k++] = 0;
            }
        }
        for(int i = k; i < list.length; i ++)
        {
            list[i] = 1;
            //can use k or i here, doesn't change outcome
        }

        return list;
    }
}
