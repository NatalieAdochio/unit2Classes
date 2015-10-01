import java.util.Scanner;
public class Phone
{
    public static void main(String[] args)
    {
     System.out.println("Put in your phone number:");
     Scanner scan = new Scanner(System.in);
     String number = scan.next();
     String para = number.substring(0,3);
     String thereLeft = number.substring(3,6);
     String fourLeft = number.substring(6);
     System.out.println("("+para+")"+thereLeft+"-"+fourLeft);
    }

}
