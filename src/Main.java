import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long currentAccount = 100;//текущий остаток
        long bonusLimit = 1000;//лимит бонусного поплнения
        long refill;// сумма пополнения

        Scanner scanner = new Scanner(System.in);// создаем объект утилиты сканера для считывания ввода пользователем числа

        System.out.print ( "У вас 100 рублей, при пополнении свыше 1000 руб. вы получите 1 рубль за каждые 100 рублей. На сколько поплнить счет? " );
        refill = scanner.nextInt();// ждем ввод числа
        if ( refill < bonusLimit ) {// если пополнение меньше лимита то бонуса нет
            currentAccount += refill;
        } else {
            currentAccount += refill + refill / 100;// иначе  добавляем сумму пополнения и по рублю на каждые 100 рублей целочисленным делением
        }
        System.out.print ( "Ваш счет успешно поплнен. Ваш баланс: " );
        System.out.println ( currentAccount );
    }
}
