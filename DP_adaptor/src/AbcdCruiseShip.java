public class AbcdCruiseShip implements CruiseShip {

    public String destination;

    public AbcdCruiseShip(String destination){
        this.destination = destination;
    }

    @Override
    public void sail() {
        System.out.println(this.destination + "행 ABCD크루즈를 타고 바다를 항해하여 갑니다.");
    }
}
