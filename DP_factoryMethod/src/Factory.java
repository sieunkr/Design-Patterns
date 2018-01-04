public abstract class Factory {

    abstract Coffee createCoffee(String item);

    public Coffee orderCoffee(String type){
        Coffee coffee = createCoffee(type);
        coffee.Take();
        return coffee;
    }
}
