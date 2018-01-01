public class Main {

    public static void main(String[] args) {

        Pizza newyorkPizza = new NewyorkPizza();
        System.out.println(newyorkPizza.getName());
        System.out.println(newyorkPizza.cost());

        System.out.println("------------------");

        Pizza napolitanaPizza = new NapolitanaPizza();
        napolitanaPizza = new CheeseTopping(napolitanaPizza);
        System.out.println(napolitanaPizza.getName());
        System.out.println(napolitanaPizza.cost());

        System.out.println("------------------");

        Pizza koreanPizza = new KoreanPizza();
        koreanPizza = new CheeseTopping(koreanPizza);
        koreanPizza = new PotatoTopping(koreanPizza);
        System.out.println(koreanPizza.getName());
        System.out.println(koreanPizza.cost());

    }
}
