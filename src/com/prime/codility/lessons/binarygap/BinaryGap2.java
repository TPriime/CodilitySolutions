package com.prime.codility.lessons.binarygap;

import java.util.Scanner;

public class BinaryGap2 {

    public static int binaryGap(int n)
    {
        int count = 0;
        int counter = 0;
        String nn = Integer.toString(n,2);
        System.out.printf("%s%n",nn);
        int i = 0;
        while(i < nn.length() )
        {

            if (nn.charAt(i) == '0')
            {
                count++;
            }

            else if(nn.charAt(i) == '1' && count > counter)
            {
                counter = count;
                //System.out.printf("%d%n",counter);
                count = 0;
            }
            else
                count = 0;


            //System.out.println(nn.charAt(i));
            //System.out.println(count);
            i++;
        }
        return counter;
    }


    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the positive integer N(from(1-2,147,483,647)) to be checked for binary gap: ");
        int n = input.nextInt();
        input.close();
        if (n>0 && n<=2147483647)
        {
            System.out.print(binaryGap(n));
        }
        else
            System.out.printf("%nUnacceptable value entered");

    }
}
