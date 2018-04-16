/********************************************************************
// These are the notes for ch 3 used in hayes class


import
//******************************************************************* */


import javax.swing.*;
import java.util.*;

public class ch8starter
{



     // good to use constants to difine arrays
     final static int  MAX = 5000;
     //static int whatever = 0;

      public static void main (String[] args)
     {
         

         System.out.println(sum(5) + "-----");
         System.out.println(mult(2,3));
         System.out.println(mult(3,10));
         
         
         //numUp(10);
         System.out.println(stringer("wow",0));
         System.out.println(primer(7,6));
         
         System.out.println(fibbers(15));
         /*
         System.out.println( "is" + pow(3,3) );
         /**/
         //make int array of 100 and pop with 100 random int' 1-500
         
         int[] num = new int[MAX];
         Random gen = new Random();



         for ( int i = 0; i < MAX ; i++)
            num[i] = gen.nextInt(1000)+1;

         for (int j = 0 ; j<MAX; j++)
            System.out.print(num[j]+"\t");
            
        System.out.println("\n");
            RecursiveSorts.mergeSort(num);
        for (int z = 0 ; z<MAX; z++)
            System.out.print(num[z]+"\t");
            /*
         //Make an array or strings with 10 names
         String[] names = {"Mike", "Jon", "Amber", "Jane",
                          "James", "Homer", "Alex", "Nic",
                          "Emy", "Nolan", "Christine", "Dave"};

                          /*
                           * //System.out.println( pow (4,3) + "p");

                           * System.out.println(reverse("abcd");
                           * reverse("abcd");

            /**/
         //ei();
         /**/
         //infinite(5);
         /**/
      }// end of main
     public static int pow (int a, int b)
      {

        return 0;
     }
     public static double  btp(int a, int b)
     {
        return 0;
     }
     public static boolean primer(int n, int a)
     {
         if (a==1)
            return true;
        else if (n%a==0)
        {
            return false;
        }
        else
            return primer(n,a-1);
        }
     public static String stringer(String name, int count)
     {
         
           int len = name.length();
         if (count == name.length())
            return "";
         else{ 
             count++;
           char back =name.charAt(len-count);
           
           return back + stringer(name, count);
           
        }
     }
     public static void numDown (int num)
     {
         if (num==0)
             System.out.println(num);
         else
            {
             System.out.println(num);
             numDown(num-1);
            }
     }
     public static void numUp (int num)
     {
        
         if (num==0)
            System.out.println(num);
         else
        {
            numUp(num-1);
             System.out.println(num);
            
        }
     }
     public static int mult (int a, int b)
     {
         if (b==0)
            return 0;
         else
            return a+mult(a,b-1);

     }
     public static int sum(int num)
     {
        if (num ==0)
            return 0;
        else 
            return num+ sum(num-1);
     }
     public static int fibbers(int num)
     {
         if (num==0)
            return 0;
         else if(num==1)
            return 1;
         else 
         {
              return fibbers(num - 1) + fibbers(num - 2);
         }
         
         
         
     }
}//end of class















