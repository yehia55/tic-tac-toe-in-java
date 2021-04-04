package xando;
import java.util.*;
import static xando.TheGame.*;
public class XandO {
    public static void main(String[] args) {
TheGame t=new TheGame();
char l;
boolean b=false;
for(int i=0;i<9;i++){
GitInput(gameboard,b);
display(gameboard);
l='y';
check(gameboard,l);
if(check(gameboard,l)==true||IsDraw(gameboard)==true)
    break;
b=true;
GitInput(gameboard,b);
display(gameboard);
IsDraw(gameboard);
l='x';
check(gameboard,l);
b=false;
if(check(gameboard,l)==true||IsDraw(gameboard)==true)
    break;
    }
    }
}
