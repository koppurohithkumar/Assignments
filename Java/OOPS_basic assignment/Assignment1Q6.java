import java.util.*;
class Login{
	//static int k=0;
    String userId = "Ajay",password = "password";
   // Assingment1Q6 ob=new Assingment1Q6();
    public String loginUser(String user, String pass)
    {
    		if(userId.equals(user) && pass.equals(password))
    		{
    			return "welcome";
    		}
    	/*	else
    		{
    			k++;
    		}*/
    return "NOP";
    }

}
public class Assignment1Q6 
{
    public static void main(String args[]) 
    {
    	String a,b;
   	 int k=0;
    	Scanner sc=new Scanner(System.in);
    	while(true)
    	{
    		++k;
    	a=sc.nextLine();
    	b=sc.nextLine();
    	Login ib=new Login();
    	String s=ib.loginUser(a, b);
    	if(s.equals("welcome"))
    	{
    	System.out.println(s);
    	break;
    	}
    	if(k==3)
    	{
    		System.out.println("contact Admin ");
    		break;
    	}
    	}
    	

    }
}