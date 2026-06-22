import java.util.*;
public class Problem1_PrintAllCharacters
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name: ");
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            System.out.print(s.charAt(i)+ " ");
        }
        sc.close();
    }
}
