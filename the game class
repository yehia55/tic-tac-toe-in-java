package xando;
import java.util.*;
public class TheGame {
   static Scanner in=new Scanner(System.in);
    final char x='x';
    final char o='o';
    final char n=' ';
  public static char gameboard[][]=new char [3][3];
  public static void display(char arr[][]){
    String s="|"+"  "+arr[0][0]+"  "+"|"+"  "+arr[0][1]+"  "+"|"+"  "+arr[0][2]+"  "+"|"+"\n";
    s=s+"\n";
    s=s+"|"+"  "+arr[1][0]+"  "+"|"+"  "+arr[1][1]+"  "+"|"+"  "+arr[1][2]+"  "+"|"+"\n";
    s=s+"\n";
    s=s+"|"+"  "+arr[2][0]+"  "+"|"+"  "+arr[2][1]+"  "+"|"+"  "+arr[2][2]+"  "+"|"+"\n";
    System.out.println(s);
    }
  public static boolean check(char arr[][],char c){
      boolean b=false;
    /*
    0 1 2
    3 4 5
    6 7 8
    */  
      int i=0;
     while (i<3){
      if(arr[i][0]==c&&arr[i][1]==c&&arr[i][2]==c)
         b=true;
      
     if(arr[0][i]==c&&arr[1][i]==c&&arr[2][i]==c)
         b=true;
     i+=1;
      }
     if (arr[0][0]==c&&arr[1][1]==c&&arr[2][2]==c)
         b=true;
     
     if (arr[0][2]==c&&arr[1][1]==c&&arr[2][1]==c)
         b=true;

     return b;
}
  public static boolean WhichTurn(char arr[][]){
      int xc=0;    //x counter
      int oc=0;    //o counter
  for(int i=0;i<3;i++)
      for(int j=0;j<3;j++){
      if (arr[i][j]=='x'||arr[i][j]=='X')
          xc++;
      else if (arr[i][j]=='y'||arr[i][j]=='Y')
          oc++;
      }
  if (xc>oc)
      return true;//true means x turn
  else if (oc>xc)
      return false;
  else
      return false;
  }
  public static void GitInput(char arr[][],boolean b){
      if(b==true){//if true x turn
          System.out.println("x turn");
  System.out.println("enter the row number and the colom number" );
 int row,col =0;
       row=in.nextInt();
       col=in.nextInt();
 if (arr[row][col]!='x'||arr[row][col]!='y')
     arr[row][col]='x';
 else
     System.out.println("invalid choice");
      }
      if(b==false){
          System.out.println("y turn");
  System.out.println("enter the row number and the colom number" );
 int row,col =0;
       row=in.nextInt();
       col=in.nextInt();
 if (arr[row][col]!='x'||arr[row][col]!='y')
     arr[row][col]='y';
 else
     System.out.println("invalid choice");
  }  
}
  public static boolean IsDraw(char arr[][]){
      boolean b=false;
      int c=-1;
  for(int i=0;i<3;i++)
      for(int j=0;j<3;j++)
          if(arr[i][j]!=' ')
             c++;
  if (c!=-1)
      b=false;
  else b=true;
  return b;
  }
            }

