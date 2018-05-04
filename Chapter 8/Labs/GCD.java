


public class GCD
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;
    public static void main(String Args[])
    {
       System.out.println(gcd(10,5));
       System.out.println(gcd(9,4));
    }
    public static int gcd(int num1, int num2)
    {
        if (num1>= num2 && num1%num2==0)
            return num2;
        else if( num2> num1)
            return gcd(num2,num1);
        else
            return gcd(num2, (num1%num2));
        
         
    
    }
}
