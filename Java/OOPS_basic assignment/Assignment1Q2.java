import java.util.*;

class ArmstrongNumBetweenRange
{
    public void armstrongNumbersInRange(int min,int max)
    {
        int temp;
        temp = min;
        int sum = 0;
        while(temp!=0)
        {
          int r = temp%10;
          sum = sum+(int)Math.pow(r,3);
          temp = temp/10;
        }
        if(sum == min)
          System.out.println(sum);
      }
    }

  public class Assignment1Q2 {
    public static void main (String [] args)
    {
      ArmstrongNumBetweenRange ob = new ArmstrongNumBetweenRange();
      int min = 100;int max = 999;
      for(int i=min;i<=max;i++)
      {
        ob.armstrongNumbersInRange(i,max);
      }
    }
  }