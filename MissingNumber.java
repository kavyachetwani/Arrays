package ArraysPractice;

public class MissingNumber {
    public static void main(String[] args) {
        int[] numlist = {1, 2, 3, 4, 6, 7};
        int totalnum = 7;

        //her we use arithematic sum method
        int arithematicSum = totalnum*((totalnum + 1)/2);
        int numSum = 0;
        for(int a : numlist)
        {
            numSum +=a;
        }
        int numMissing = arithematicSum - numSum;
        System.out.println("The missing number is " + numMissing);

    }
}
