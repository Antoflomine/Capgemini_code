import java.util.*;
public class dealerShip
{
   
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
int sum=0;
			int a=sc.nextInt();
			int b=sc.nextInt();
			sum=(a*4)+(b*2);
		System.out.println(sum);
		}

    }
}