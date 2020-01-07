import java.util.Scanner;
class Pattern2
{public static void main(String arr[])
{
int i,j;
for(i=1;i<=7;i++)
{for(j=1;j<=4;j++)
{if(j==4-i&&j==i-4)
System.out.print("");
else 
System.out.print("*");
}
System.out.println("\n");
}
}
}