package CIE;
import java.util.Scanner;
public class Student
{
public String name;
public String usn;
public int sem;
public void display()
{
Scanner s=new Scanner(System.in);
System.out.println("Name:");
name=s.next();
System.out.println("USN:");
usn=s.next();
System.out.println("Semester:");
sem=s.nextInt();
}
}
package CIE;
import java.util.Scanner;
public class Internals extends Student
{
 public double ciem[];

 public void display()
 {
 ciem=new double[5];
 Scanner t=new Scanner(System.in);
 System.out.println("CIE Marks for 5 subjects(out of 50):");
 for(int i=0;i<5;i++)
 ciem[i]=t.nextDouble();
 }
}
