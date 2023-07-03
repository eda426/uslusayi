import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Üssü alınacak sayıyı giriniz:");
        int a= input.nextInt();
        System.out.println("üssü giriniz:");
         int b= input.nextInt();

         int top=1;

         for(int i=1;i<=b;i++)
         {
             top*=a;
         }
System.out.println("cevap:"+top);

        }
    }
