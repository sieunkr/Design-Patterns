public class AsianaAirLine implements AirLine {

    public String destination;
    public int mileage;

    public AsianaAirLine(String destination){
        this.destination = destination;
    }

    @Override
    public void fly() {
        System.out.println(this.destination + "행 아시아나 비행기를 타고 갑니다.");
    }

}
