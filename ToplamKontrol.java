import java.util.Scanner;
public class ToplamKontrol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum =0;
        int number;
        
        System.out.println("Sayıları giriniz(Eğer -1 girerseniz toplama işlemi sona erecektir): ");
        do{
            System.out.print("Lütfen sayıyı tuşlayınız: ");
             number = scanner.nextInt();

            if (number != -1){
                sum +=number;
            }
        }while(number != -1);
        System.out.print("Sistem kapanana kadar giriş yapılan sayıların toplamı: "+sum);
        scanner.close();
    }
}