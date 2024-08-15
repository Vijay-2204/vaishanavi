class Remove
{
public static int[] even(int []a)
{
int coun_odd=0;
for(int i=0;i<a.length;i++)
{
if(a[i]%2==0)
{
coun_odd=coun_odd+1;
}
}
int []res=new int[coun_odd];
int in=0;
for(int i=0;i<a.length;i++)
{
if(a[i]%2==0)
{
res[in]=a[i];
in++;
}
}
return res;
}
public static void main(String args[])
{
int []array1={1,2,3,4,9};
for(int i=0;i<array1.length;i++)
{
System.out.print(array1[i]+" ");
}
System.out.println();
int []res=even(array1);
for(int i=0;i< res.length;i++)
{
System.out.print(res[i]+" ");
}
}
}