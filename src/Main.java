import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long current_account = 100;//текущий остаток
        long bonus_limit = 1000;//лимит бонусного поплнения
        long refill;// сумма пополнения

        Scanner scanner = new Scanner(System.in);// создаем объект утилиты сканера для считывания ввода пользователем числа

        System.out.print ( "У вас 100 рублей, при пополнении свыше 1000 руб. вы получите 1 рубль за каждые 100 рублей. На сколько поплнить счет? " );
        refill = scanner.nextInt();// ждем ввод числа
        if ( refill < bonus_limit ) {// если пополнение меньше лимита то бонуса нет
            current_account += refill;
        } else {
            current_account += refill + refill / 100;// иначе  добавляем сумму пополнения и по рублю на каждые 100 рублей целочисленным делением
        }
        System.out.print ( "Ваш счет успешно поплнен. Ваш баланс: " );
        System.out.println ( current_account );
    }
}
