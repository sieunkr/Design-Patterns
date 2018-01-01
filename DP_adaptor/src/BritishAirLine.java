public class BritishAirLine implements AirLine {

    public String destination;
    public int mileage;

    public BritishAirLine(String destination){
        this.destination = destination;
    }

    @Override
    public void fly() {
        System.out.println(this.destination + "행 영국항공 비행기를 타고 갑니다.");
    }

}
