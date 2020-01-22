import java.util.Scanner;
class Password
{
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
 	int a[]=new int[5];
	int b[]=new int[50];
	int freq[]=new int[50];
	int i,j,k,num,r,sum=0,count=0,f,g=0,first,sums,sumu,flag=-1;
	for( i=0;i<5;i++)
	{
		a[i]=s.nextInt();
	}
	for( j=0;j<5;j++)
	{
		 num=a[j];
		for(i=0;num!=0;i++)
		{
			r=num%10;
			b[i]=r;
			count++;
			num=num/10;
		}
		for(i=0;i<count;i++)
		{	f=1;
			for(k=i+1;k<count;k++)
			{
				if(b[i]==b[k])
				{
					f++;
					freq[b[k]]=0;
	
				}
			}
			if(freq[b[i]]!=0)
			{
			freq[b[i]]=f;
			g++;
			}
		}
		for(i=0;i<g;i++)
		{
			first=freq[0];
			for(k=i+1;k<g;k++)
			{
				if(freq[k]!=first)
				{
					flag=0;
					break;
				}
				else
				flag=1;
			}
		}
		if(flag==0) {
		System.out.println(a[j]+" is Unstable");
		sumu=sumu+a[j]; }
		else {
		System.out.println(a[j]+" is Stable");
		sums=sums+a[j]; }
	}
 	int p=sums-sumu;
	System.out.println("Password = "+p);
}
}		
		
					
					













