import java.util.*;
public class Problem5_CountDigits
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String s=sc.nextLine();
        char[] arr=s.toCharArray();
        int count=0;
        for(char c:arr)
        {
            if(c>='0' && c<='9')
                count++;
        }
        System.out.println("No of digits in "+s+" is "+count);
    }
}
