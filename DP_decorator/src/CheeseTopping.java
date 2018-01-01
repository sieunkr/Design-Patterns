public class CheeseTopping extends Topping {

    Pizza pizza;

    public CheeseTopping(Pizza pizza){
        this.pizza = pizza;
    }

    public String getName(){
        return pizza.getName() + ", 치즈 토핑 추가요!";
    }

    public double cost(){
        return 1000 + pizza.cost();
    }

}
