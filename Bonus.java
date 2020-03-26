// package Blok_3_TipyDannyh.Z2_Bonus_100; //Заменить на свой (Для IDEA)

import java.util.Locale;  //Использовать точки, а не запятые
import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double cash = 101.56; //Баланс в рублях
        int re_cash = (int) cash * 100;//Перевод в копейки и целые числа
        System.out.println("Ведите сумму перевода");
        double transferAmount = scanner.nextDouble(); //Ввод суммы
        int re_transferAmount = (int) transferAmount * 100; //Перевод в копейки и целые числа
        int bonus = re_transferAmount / 100 / 100; // Делим на 100 - перевод в рубли и демим на 100 бонус за каждые 100 руб.
        if (transferAmount > 1000) { // Если клиент пополняет счёт более чем на 1000 рублей (Условие)
            System.out.println("Бонус за перевод составляет: " + bonus + " Руб.");
            System.out.println("Сумма на счету " + (cash + transferAmount + bonus) + " Руб.");
        } else {
            System.out.println("Бонусов нет. Сумма на счету: " + (cash + transferAmount) + " Рублей");
        }
    }
}
