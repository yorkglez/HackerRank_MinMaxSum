package com.problemminmaxsum.app;
import java.lang.annotation.ElementType;
import java.util.Scanner;
public class Solution
{
    public static void main(String[] args)
    {
        //Const delclaration
        final int ELEMENTS = 5;
        //Object declaration
        Scanner in = new Scanner(System.in);
        //Array declaration
        int arrayNumbers[] = new int[ELEMENTS];

        //Input numbers
        for(int i = 0; i < ELEMENTS; i++)
        {
            arrayNumbers[i] = in.nextInt();
        }

        //Call function
        miniMaxSum(arrayNumbers);
        //Close input
        in.close();
    }

    static void miniMaxSum(int[] arr)
    {
        //Variables declaration
        long maxNumber = arr[0];
        long minNumber = arr[0];
        long sum = 0;

        //Sum process
        for(int i = 0; i < arr.length; i++)
        {
            //Validate max number
            if(maxNumber > arr[i])
            {
                maxNumber = arr[i];
            }
            //Validate min number
            if(minNumber < arr[i])
            {
                minNumber = arr[i];
            }
            //Sum numbers
            sum  += arr[i];
        }

        //Min number
        minNumber = sum - minNumber;
        //Max code
        maxNumber = sum - maxNumber;
        //Output
        System.out.println(minNumber +" "+ maxNumber);
    }
}