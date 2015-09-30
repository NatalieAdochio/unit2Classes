import java.util.Scanner;
public class Phone
{
    public static void main(String[] args)
    {
     System.out.println("Put in your phone number:");
     Scanner scan = new Scanner(System.in);
     String para = "("+scan.substring(0,3+")");
     String thereLeft = scan.substring(3,6)+"-";
     String fourLeft = scan.substring(6);
     System.out.println(para+thereLeft+fourLeft);
    }

}
