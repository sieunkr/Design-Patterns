public class AsianaAirLineAdapter extends KoreanAirLine{
    AsianaAirLine asianaAirLine;

    public AsianaAirLineAdapter(AsianaAirLine asianaAirLine){
        super(asianaAirLine.destination);
        this.asianaAirLine = asianaAirLine;
    }

    @Override
    public void fly() {
        //super.fly();
        System.out.println("대한항공에서 티켓팅을 하였지만, 항공사의 사정으로 비행기를 변경하여 쉐어 항공으로");
        asianaAirLine.fly();
    }
}
