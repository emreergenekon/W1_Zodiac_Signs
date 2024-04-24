import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//to find the right zodiac sign we're adding 2 inputs as day/month
        int month, day;
        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz Ay: ");
        month = input.nextInt();

        System.out.print("Doğduğunuz Gün: ");
        day = input.nextInt();


        if ((month == 3 && day >= 21) || (month == 4 && day <= 20)) {
            System.out.print("Koç Burcu");
        } else if ((month == 4 && day >= 21) || (month == 5 && day <= 21)) {
            System.out.print("Boğa Burcu");
        } else if ((month == 5 && day >= 22) || (month == 6 && day <= 22)) {
            System.out.print("İkizler Burcu");
        } else if ((month == 6 && day >= 23) || (month == 7 && day <= 22)) {
            System.out.print("Yengeç Burcu");
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            System.out.print("Aslan Burcu");
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            System.out.print("Başak Burcu");
    } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            System.out.println("Terazi Burcu");
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            System.out.println("Akrep Burcu");
        } else if ((month == 11 && day >= 22) || (month == 12 && day <=21)) {
            System.out.println("Yay Burcu");
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 21)) {
            System.out.println("Oğlak Burcu");
        } else if ((month == 1 && day >= 22 ) || (month == 2 && day <= 19)) {
            System.out.println("Kova Burcu");
        }else if ((month == 2 && day >= 20) || (month == 3 && day <= 20)) {
            System.out.println("Balık Burcu");

            //if user add wrong text or wrong number between the exact days & months for signs error text will appear.
        } else
        System.out.println("Hata! Girdiğiniz tarihe göre bir burç belirlenemedi. Lütfen tekrar deneyin. ");
        }
}