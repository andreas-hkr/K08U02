public class Main {
    static double addVAT(double price, double percent) {
        return price + price * (percent/100);
    }

    public static void main(String[] args) {
        // Skapa en metod som returnerar priset inklusive moms
        //   - Parameter 1: Priset utan moms
        //   - Parameter 2: Momssatsen i procent

        double pr = 100;
        double pe = 30;

        double priceWithVAT = addVAT(pr, pe);
        System.out.println("Med moms blir det: " + priceWithVAT);
    }
}