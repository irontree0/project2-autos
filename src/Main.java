public class Main {
    public static void main(String[] args) {
        AutoPark auto1 = new AutoPark("grey", "Toyota");
        auto1.printAvailability();
        AutoPark auto2 = new AutoPark("black", "BMW");
        auto2.printAvailability();
        AutoPark auto3 = new AutoPark("white", "VW");
        auto3.printAvailability();
    }
}