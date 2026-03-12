import java.util.*;
public class Search
{
int[] arr=new int[10];
int count;

public void get()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the count of array:");
this.count=sc.nextInt();
System.out.println("enter the array elements:");
for(int i=0;i<this.count;i++)
{
this.arr[i]=sc.nextInt();
}
}

public void itemSearch()
{
int n,flag=0,pos=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the element you want to search:");
n=sc.nextInt();
for(int i=0;i<this.count;i++)
{
if(this.arr[i]==n)
{
flag=1;
pos=i;
break;
}
}
if(flag==1)
{
System.out.println("element is found at position "+(pos+1));
}
else
{
System.out.println("element is not found");
}
}

public static void main(String[] args)
{
Search s1=new Search();
s1.get();
s1.itemSearch();
}
}

