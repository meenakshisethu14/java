import java.util.Scanner;
class employee
{
int id;
String name;
int sal;
String address;
employee(int id,String name,int sal,String address)
{
this.id=id;
this.name=name;
this.sal=sal;
this.address=address;
}
public void display()
{
System.out.println("Employee id:"+this.id);
System.out.println("Employee name:"+this.name);
System.out.println("Employee salary:"+this.sal);
System.out.println("Employee address:"+this.address);
}
}
class teacher extends employee
{
String dept;
String sub;
teacher(int id,String name,int sal,String address,String dept,String sub)
{
super(id,name,sal,address);
this.dept=dept;
this.sub=sub;
}
public void display()
{
super.display();
System.out.println("Department:"+this.dept);
System.out.println("Subject:"+this.sub);
}
}
public class co3_2
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of teachers:");
int n=sc.nextInt();
sc.nextLine();
teacher[]t=new teacher[n];
for(int i=0;i<n;i++)
{
System.out.println("Enter details of teacher "+(i+1)+":");
System.out.println("ID:");
int id=sc.nextInt();
sc.nextLine();
System.out.println("Name:");
String name=sc.nextLine();
System.out.println("Salary:");
int sal=sc.nextInt();
sc.nextLine();
System.out.println("Address:");
String address=sc.nextLine();
System.out.println("Department:");
String dept=sc.nextLine();
System.out.println("Subject:");
String sub=sc.nextLine();
t[i]=new teacher(id,name,sal,address,dept,sub);
}
System.out.println("\nTeacher details:\n");
for(int i=0;i<n;i++)
{
t[i].display();
System.out.println();
}
sc.close();
}
}

