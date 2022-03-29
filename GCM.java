import java.util.Scanner;
public class GCM{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;

        System.out.println("a‚Æb‚ð“ü—Í");

        System.out.print("a=");
        a = scanner.nextInt();
        System.out.print("b=");
        b = scanner.nextInt();

        
            int c;
            while((c = a%b)!=0) {
                a = b;
                b = c;
            }
            System.out.println("GCM="+b);
        }
        

    }
