package Blok_3_TipyDannyh.Z2_Bonus_100;

import java.util.Locale;
import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double cash = 101.56; //Баланс в рублях
        int re_cash = (int) cash * 100;
        System.out.println("Ведите сумму перевода");
        double transferAmount = scanner.nextDouble(); //Ввод суммы
        int re_transferAmount = (int) transferAmount * 100;
        int bonus = re_transferAmount / 100 / 100; // Делим на 100 - перевод в рубли и демим на 100 бонус за каждые 100 руб.
        if (transferAmount > 1000) { // eсли клиент пополняет счёт более чем на 1000 рублей
            System.out.println("Бонус за перевод составляет: " + bonus + " Руб.");
            System.out.println("Сумма на счету " + (cash + transferAmount + bonus) + " Руб.");
        } else {
            System.out.println("Бонусов нет. Сумма на счету: " + (cash + transferAmount) + " Рублей");
        }
    }
}
