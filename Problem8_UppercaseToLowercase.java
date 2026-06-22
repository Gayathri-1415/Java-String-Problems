import java.util.*;
public class Problem8_UppercaseToLowercase
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String s=sc.nextLine();
        char[] arr=s.toCharArray();
        for(char c: arr)
        {
            if(c>='A' && c<='Z')
                System.out.print((char)(c+32));
            else
                System.out.print(c);
        }
    }
}
