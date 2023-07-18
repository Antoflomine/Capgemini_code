import java.util.*;
public class Main
{
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();//5
  int b=sc.nextInt();//4
 
  // 1 2 3 4
  // 5 6 7 8  1 1
  // 9 10 11 12 2 0
  // 13 14 15 16 3 0
  // 17 18 19 20 4 3
 
 
  int[][] arr=new int[a][b];
  for(int i=0;i<a;i++){
      for(int j=0;j<b;j++){
          arr[i][j]=sc.nextInt();
      }
  }
  int row=0,column=0;
  int k=0,count=0;
  while(count<(a*b)){
     
     
      while(column<b-k){
           count++;
      System.out.print(arr[row][column++]+" ");
     
     
     
      }
      column--;
      row++;
      while(row<a-k){
           count++;
          System.out.print(arr[row++][column]+" ");
        
      }
      row--;
      column--;
     
      while(column>=0+k){
           count++;
          System.out.print(arr[row][column--]+" ");
         
      }
      column++;
      row--;
      while(row>0+k){
           count++;
          System.out.print(arr[row--][column]+" ");
          
         
      }
     
      row++;
      k++;
      column++;
     
  }
}
}
