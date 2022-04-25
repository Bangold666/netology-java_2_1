public class Main {
    public static void main(String[] args) {

        int ticketPrice = 520; // Цена билета
        int milesperPrice = 1; // Мили за каждые 20 рублей
        int miles = 0;// Конечная ячейка для бонусной или


        milesperPrice = ticketPrice / 20;
        miles = miles + milesperPrice;


        System.out.println((miles) + " Миль ");//Вывод окончательных Миль
    }
}
