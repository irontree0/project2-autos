public class AutoPark {
    String color;
    String brand;
    public AutoPark() {
    }
    public AutoPark(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }
//    public static void main(String[] args) {
//        AutoPark auto1 = new AutoPark("grey", "Toyota");
//
//        AutoPark auto2 = new AutoPark();
//        auto2.color = "black";
//        auto2.brand = "BMW";
//
//        AutoPark auto3 = new AutoPark("white", "VW");
//
//        System.out.println("We have " + auto1.color + " " + auto1.brand + " in our Auto Park");
//        System.out.println("We have " + auto2.color + " " + auto2.brand + " in our Auto Park");
//        System.out.println("We have " + auto3.color + " " + auto3.brand + " in our Auto Park");
//
////        System.out.println(String.format("We have a %s %s in our Auto Park", auto2.color, auto2.brand));
////        System.out.println(String.format("We have a %s %s in our Auto Park", auto3.color, auto3.brand));
//    }

    public void printAvailability() {
        System.out.println(String.format("We have a %s %s in our Auto Park", color, brand));
    }
}