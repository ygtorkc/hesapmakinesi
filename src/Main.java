import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1. Toplama");
        System.out.println("2. Çıkarma");
        System.out.println("3. Çarpma");
        System.out.println("4. Bölme");
        System.out.println("Lütfen seçiminizi yapınız (1, 2, 3, veya 4):");

        int choice = input.nextInt();
        System.out.println("İlk sayıyı giriniz:");
        double num1 = input.nextDouble();
        System.out.println("İkinci sayıyı giriniz:");
        double num2 = input.nextDouble();

        switch (choice) {
            case 1:
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println(num1 - num2);
                break;
            case 3:
                System.out.println(num1 * num2);
                break;
            case 4:
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Hatalı seçim yaptınız.");
                break;
        }
    }
}
