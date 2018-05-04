public class PalindromeTester
{

    /**
     * Default constructor for objects of class PalindromeTester
     */
    public static void main(String Args[])
    {
        System.out.println(pal("Saagar"));
        System.out.println(pal("racecar"));
        
    }

    
    public static boolean pal(String ezpz)
    {

        if (ezpz.length()==1 || ezpz.length() ==2)
            {
                if (ezpz.length()==1)
                {
                    return true;
                }
                else
                {
                    if (ezpz.charAt(0)==ezpz.charAt(1))
                    {
                        return true; 
                    }
                    else 
                        return false;
                }
            }
        else
        {
                if (ezpz.charAt(0) == ezpz.charAt(ezpz.length()-1))
                {
                        
                            return pal(ezpz.substring(1,ezpz.length()-1));
                 }
                 return false;
        }
                
    }

}
