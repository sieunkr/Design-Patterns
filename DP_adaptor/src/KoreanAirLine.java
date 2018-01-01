public class KoreanAirLine implements AirLine {

    public String destination;
    public int mileage;

    public KoreanAirLine(String destination){
        this.destination = destination;

    }

    @Override
    public void fly() {
        System.out.println(this.destination + "행 대한항공 비행기를 타고 갑니다.");
    }

}
