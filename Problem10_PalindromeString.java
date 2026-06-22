import java.util.*;
public class Problem10_PalindromeString
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String s=sc.nextLine().toLowerCase();
        s=s.replaceAll("[^a-z]",""); // this line means anything that is not lowercase is replaced
        String s1="";
        for(int i=s.length()-1;i>=0;i--)
        {
            s1+=s.charAt(i);
        }
        System.out.println(s1.equals(s)?"Palindrome":"Not a Palindrome");
    }
    
}
