public class Main {
    public static void main(String[] args) {

        int amount = 100;
        int payment = 1100;

        int bonus = (payment >= 1000) ? (payment / 100) : 0;
        System.out.println(bonus);

        System.out.println("Итоговый счет: " + (amount + payment + bonus));
        
    }
}