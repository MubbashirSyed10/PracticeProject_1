import java.util.*;
public class Array_27
{
    public static void main(String []args)
    {
        Scanner input=new Scanner(System.in);
        int n;
        n=input.nextInt();
        int fact=1;

        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}