import java.util.*;
public class Charcount
{
   
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
   String uni = new String("");
int i=0,count=0,j=0;
        for(i=0; i<str.length(); i++)
        {
            count = 0;
            for(j=0; j<=i; j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    count++;
                }
            }
            if(count==1)
            {
                uni = uni + str.charAt(i);
            }
        }
 for(i=0; i<uni.length(); i++)
        {
            count = 0;
            for(j=0; j<str.length(); j++)
            {
                if(uni.charAt(i)==str.charAt(j))
                {
                    count++;
                }
            }
            
                System.out.printf("%c%d",uni.charAt(i),count);
            

}

    }
}