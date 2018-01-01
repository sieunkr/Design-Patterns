public class AbcdCruiseShipAdapter extends KoreanAirLine{
    AbcdCruiseShip abcdCruiseShip;

    public AbcdCruiseShipAdapter(AbcdCruiseShip abcdCruiseShip){
        super(abcdCruiseShip.destination);
        this.abcdCruiseShip = abcdCruiseShip;
    }

    @Override
    public void fly() {
        //super.fly();
        System.out.println("대한항공에서 티켓팅을 하였지만, 항공사의 사정으로 비행기를 못타게 되어서, 배를 타는 일정으로 변경되어...");
        abcdCruiseShip.sail();
    }
}
