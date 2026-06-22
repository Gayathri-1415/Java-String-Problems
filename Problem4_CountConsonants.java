import java.util.*;
public class Problem4_CountConsonants
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String s=sc.nextLine().toLowerCase().trim();
        char[] arr=s.toCharArray();
        int count=0;
        for(char c:arr)
        {
            if(!(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c==' ') && (c>='a' && c<='z'))
                count++;
        }
        System.out.println("Consonants count in "+s+" is "+count);
    }
}
