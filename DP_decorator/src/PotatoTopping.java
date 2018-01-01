public class PotatoTopping extends Topping {

    Pizza pizza;

    public PotatoTopping(Pizza pizza){
        this.pizza = pizza;
    }

    public String getName(){
        return pizza.getName() + ", 포테이토 토핑 추가요!";
    }

    public double cost(){
        return 3000 + pizza.cost();
    }

}
