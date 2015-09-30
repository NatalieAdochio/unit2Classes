import java.util.Scanner;
public class Number
{
    public static void main (String[] args)
    {
        System.out.println("Choose a number between 1,000 and 999,999:");
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int index = str.indexOf(",");
        String sub = str.substring(0,index);
        int starting= index+1;
        String sub2 = str.substring(starting);
        System.out.println(sub+sub2);
    }
}