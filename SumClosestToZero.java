package ArraysPractice;

public class SumClosestToZero {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, -6, 6, 3, -5};

        if( numbers.length < 2)
        {
            System.out.println("Not enough numbers in array");
        }
        int minleft = 0, minright = 1, sum;
        int minsum = numbers[0] + numbers[1];

        for(int l = 0; l < numbers.length-1; l++)
        {
            for(int r = l+1; r <numbers.length; r ++)
            {
                sum = numbers[l] + numbers[r];

                if(Math.abs(minsum)> Math.abs(sum))
                {
                    minsum = sum;
                    minleft = l;
                    minright = r;
                    //these two are indexes not actual numbers
                }
            }
        }
        System.out.println("The numbers with the min sum are " + numbers[minleft] + " and " + numbers[minright]);



    }
}
