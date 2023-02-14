public class Largest
{
public static void main(String[]args)
{
int d1 = 250, d2 = 500, d3 = 400;

if (d1>=d2 && d1>=d3)
{
System.out.println(d1+"the number is largest");
}
else if(d2>=d1 && d2>=d3)
{
System.out.println(d2+" the number is largest");
}
else
{
System.out.println(d3+" the number is largest");
}
}
}