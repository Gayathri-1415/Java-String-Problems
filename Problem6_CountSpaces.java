import java.util.*;
public class Problem6_CountSpaces
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String s=sc.nextLine();
        char[] arr=s.toCharArray();
        int count=0;
        for(char c: arr)
        {
            if(c==' ')
                count++;
        }
        System.out.println("No of spaces in "+s+" is "+count);
    }
}
