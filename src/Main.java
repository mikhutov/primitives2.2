public class Main {
    public static void main(String[] args) {
        int account = 100; // Текущее состояние счета
        int topup = 500; // Сумма пополнения


        if (topup > 1000) {
            System.out.println(" Ваш баланс: " + ((topup/100) + topup + account));
            System.out.println(" Размер бонуса: " + topup/100);
        } else {
            System.out.println(" Ваш баланс: " + (topup + account));
            System.out.println(" Размер бонуса: " + 0);
        }



    }
}