import java.util.*;
import java.text.*;
class Tokenizer{
 static int[] cal(String y) {
 String a,b,x=":";
 int i[] = {0,0};
 StringTokenizer st=new StringTokenizer(y,x);
 a=(String) st.nextElement();
 b=(String) st.nextElement();
 i[0]=Integer.parseInt(a);
 i[1]=Integer.parseInt(b); 
 return i;
 }
}
public class GetCurrentDateTime{
public static void main(String[] args){
SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
Calendar cal = Calendar.getInstance();
String y =dateFormat.format(cal.getTime()); 
while(true)
{ 
String x,t1,a,b;
int minute,hour;
int HH[]={0,0},MM[]={0,0};
t1=dateFormat.format(cal.getTime());
int time1[]=Tokenizer.cal(t1);
hour=time1[0];
minute=time1[1];
System.out.println("Enter the time intervels in HH MM fommat");
Scanner z=new Scanner(System.in);
String t2=z.next();
String t3=z.next();
int time2[]=Tokenizer.cal(t2);
HH[0]=time2[0];
MM[0]=time2[1];
int time3[]=Tokenizer.cal(t3);
HH[1]=time3[0];
MM[1]=time3[1];
if(HH[0]>HH[1])
{
int t=HH[0];
HH[0]=HH[1];
HH[1]=t;
}
if(HH[0]==HH[1]&&MM[0]>MM[1])
{
int t=MM[0];
MM[0]=MM[1];
MM[1]=t;
}
if((hour>=HH[0]&&hour<HH[1])||(hour==HH[0]&& hour==HH[1])&& 
(minute>=MM[0]&&minute<=MM[1]))
{
System.out.println("Current time is "+hour+" : "+minute);
break;
}
else
{
System.out.println("Try again");
}
}
}
}