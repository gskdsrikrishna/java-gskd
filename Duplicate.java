import java.util.Scanner;
public class Duplicate{
 public static void main(String[ ] args){
int a[]={0,0,0,0,0},t,i,j,s=0,r=0;
Scanner z=new Scanner(System.in);
System.out.println("Enter 5 unique values between 10 & 100 ");
for(j=0;j<5;j++)
{ 
t=z.nextInt();
if(t>=10&&t<=100)
{ 
for(i=0;i<r;i++)
{
if(a[i]==t) 
s++;
}
if(s>0)
{
System.out.println("Duplicate value found retry");
s--;
j--;
continue; 
}
else
{
a[j]=t;
r++;
}
}
else
{
System.out.println("value must be in between 10 & 100");
j--;
} 
}
System.out.print("The five unique values are ");
for(i=0;i<5;i++)
{
System.out.print(a[i]+" ");
} 
 }
}
