import java.util.*;
public class moveHash
{
   
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
	  String str1="";
	  String str2="";
        int len= a.length();

	for(int i=0;i<len;i++){
		if(a.charAt(i)=='#'){
			str1+=a.charAt(i);
		}
		else{
			str2+=a.charAt(i);
		}
	}
System.out.print(str1+""+str2);

    }
}