package com.prime.codility.lessons;

import java.util.Scanner;

public class BinaryGap {

    public static int binaryGap(int n)
    {
        int count = 0;
        int counter = 0;
        int binaryGaps = 0;    //store number of gaps found
        String nn = Integer.toString(n,2);
        System.out.printf("%s%n",nn);
        int i = 0;
        boolean lastValueIsZero = false;	 //to keep track of last encounters

        /*the first value of a binary must be 1
         * unless it's a 0 number
         * so i  need to check for a 0 instead */
        while(i<=nn.length()-1)   //while loop was stagnant
        {
            //count++;  not useful here
            //sprintln(nn.charAt(i))....test//
            if(Integer.valueOf(nn.charAt(i)) == '0') // do something if a '0' is met
            {
                counter++; //count d zero
                System.out.printf("%d",counter);
                lastValueIsZero = true;
            }
            else if(lastValueIsZero)  //if a 1 is met and prev number is a 0
            {
                binaryGaps++; //increase no of binary gaps
                //validate highest number of zeros met
                if(counter > count)
                {
                    count = counter;
                }
                counter = 0;
            }
            i++;
        }
        return count;
    }


    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the positive integer N(from(1-2,147,483,647)) to be checked for binary gap: ");
        int n = input.nextInt();
        input.close();
        if (n>0 && n<=2147483647)
        {
            System.out.print("max 0s = " + binaryGap(n));
        }
        else
            System.out.printf("%nUnacceptable value entered");

    }
}
