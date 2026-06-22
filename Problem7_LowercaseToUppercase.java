import java.util.*;
public class Problem7_LowercaseToUppercase
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String s=sc.nextLine();
        char[] arr=s.toCharArray();
        for(char c: arr)
        {
            if(c>='a' && c<='z')
                System.out.print((char)(c-32));
            else
                System.out.print(c);
        
        }

    }
}
