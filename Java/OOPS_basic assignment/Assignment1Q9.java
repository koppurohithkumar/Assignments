import java.util.*;
class Students
{
	private int a,b,c;
	int p,q,r;
	Students(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public int totalmarks(Students s[])
	{
		for(int i=0;i<3;i++)
		{
			p=0;
			p=s[i].a+s[i].b+s[i].c;
			q=q+p;
		}

		
		return q;
	}
}
public class Assignment1Q9 {

	public static void main(String[] args) {
			
		Students ob[]=new Students[3];
	//	Students s=new Students();
		int a=0,b=0,c=0;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
			ob[i]=new Students(a,b,c);
		}
		int m=ob[1].totalmarks(ob);
		System.out.println(m);
	}

}