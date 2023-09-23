import java.io.*; 
import java.util.Scanner; 
public class Split { 
public static void main(String args[]) { 
try{ 
// Reading file and getting no. of files to be generated 
String inputfile = "Gskd.txt"; // Source File Name. 
// No. of lines to be split and saved in each output file.
double nol = 5.0;
File file = new File(inputfile); 
Scanner scanner = new Scanner(file); 
int count = 0; 
while (scanner.hasNextLine())
{ 
scanner.nextLine(); 
count++; 
} 
// Displays no. of lines in the input file.
System.out.println("Lines in the file: " + count);
double temp = (count/nol); 
int temp1=(int)temp; 
int nof=0; 
if(temp1==temp) 
{ 
nof=temp1; 
} 
else 
{ 
nof=temp1+1; 
} 
System.out.println("No. of files to be generated :"+nof); 
// Actual splitting of file into smaller files 
BufferedReader br = new BufferedReader(new FileReader(inputfile)); 
String strLine; 
for (int j=1;j<=nof;j++) 
{ 
// Destination File Location 
FileWriter fw= new FileWriter("File"+j+".txt"); 
for (int i=1;i<=nol;i++) 
{ 
strLine = br.readLine(); 
if (strLine!= null) 
{
strLine=strLine+"\r\n";
fw.write(strLine); 
} 
} 
fw.close(); 
} 
br.close(); 
}
catch (Exception e) { 
System.err.println("Error: " + e.getMessage()); 
} 
} 
} 