import java.util.*;
public class integerOcc
{
   
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
	  int[] arr=new int[n];
	for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
	}
int[] narr=new int[n];
int k=0;
for(int i=0;i<n;i++){
int c=0;
for(int j=0;j<=i;j++){
if(arr[i]==arr[j]){
c++;
}
}
if(c==1){
narr[k]=arr[i];
k++;
}

}

for(int i=0;i<k;i++){
int c=0;
for(int j=0;j<n;j++){
if(narr[i]==arr[j]){
c++;
}
}
System.out.println(narr[i]+"-"+c);
}


    }
}