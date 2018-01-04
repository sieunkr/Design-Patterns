//Concrete Creator
public class Cafe24 extends Factory{

    //Factory Method
    public Coffee createCoffee(String item){
        if(item.equals("Mocha")){
            return new CafeMocha();
        }
        else if(item.equals("Latte")){
            return new CafeLatte();
        }
        else{
            return null;
        }
    }
}
