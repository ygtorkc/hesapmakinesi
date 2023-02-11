import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("1. Toplama");
    System.out.println("2. Çıkarma");
    System.out.println("3. Çarpma");
    System.out.println("4. Bölme");
    System.out.println("5. Dikdörtgen Alanı");
    System.out.println("6. Dikdörtgen Çevresi");
    System.out.println("Lütfen seçiminizi yapınız (1, 2, 3, 4, 5 veya 6):");

    int choice = input.nextInt();
    if (choice >= 5) {
      System.out.println("En giriniz:");
      double num1 = input.nextDouble();
      System.out.println("Boy giriniz:");
      double num2 = input.nextDouble();
      if (choice == 5) {
        System.out.println("Dikdörtgenin alanı: " + rectangleArea(num1, num2));
      } else if (choice == 6) {
        System.out.println("Dikdörtgenin çevresi: " + rectanglePerimeter(num1, num2));
      }
    } else {
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

  public static double rectangleArea(double en, double boy) {
    return en * boy;
  }

  public static double rectanglePerimeter(double en, double boy) {
    return 2 * (en + boy);
  }
}
