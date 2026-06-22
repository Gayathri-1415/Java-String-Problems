import java.util.*;
public class Problem2_CountCharactersWithoutLength
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
            count++;
       }
       System.out.println("Length of word "+s+" is "+count);
    }
}
