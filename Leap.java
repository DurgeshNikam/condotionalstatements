public class Leap
{
public static void main(String[]args)
{
int year=1992;
if(year%4==0)
{
if(year%100==0)
{
if (year%400==0)
{
System.out.println(year+" is a leap year");
}
else
{
System.out.println(year+" i is not leap year");
}
}
else
{
System.out.println(year+" is a leap year");
}
}
else
{
System.out.println(year+" is not a leap year");
}
}
}
