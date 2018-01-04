public class Main {

    public static void main(String[] args) {

        Cafe24 cafe24 = new Cafe24();

        Coffee coffee = cafe24.orderCoffee("Latte");
        System.out.println("-" + coffee.getName());
        
        coffee = cafe24.orderCoffee("Mocha");
        System.out.println("-" + coffee.getName());
    }
}
