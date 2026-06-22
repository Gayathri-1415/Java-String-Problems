import java.util.*;
public class Problem3_CountVowels
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string: ");
        String s=sc.nextLine().toLowerCase();
        char[] arr=s.toCharArray();
        int count=0;
        for(char c: arr)
        {
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
                count++;
        }
        System.out.println("Vowels count in "+s+" is "+count);
    }
}
