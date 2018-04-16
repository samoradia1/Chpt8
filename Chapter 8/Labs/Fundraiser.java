class Fundraiser
{
 
    /**
     * Default constructor for objects of class Fundraiser
     */
    public static void main (String Args[])
    {
        System.out.print(Funds(1000));
    }

    
    public static int Funds(int moolahs)
    {
        int total = 1;
        if (moolahs ==0||moolahs==1)
        {
            return 1;
        }
        else 
        {
            for (int i=0;i<10;i++)
               {
                    total+=Funds(moolahs/10);
               }
            return total;
        }
    }

}
