public class Main {

    public static void main(String[] args) {

        System.out.println("어댑터패턴 사용하지 않은 경우(1)----------------------------------------------------");
        AbcdCruiseShip abcdCruiseShip01 = new AbcdCruiseShip("런던");
        //testAirLineFly(abcdCruiseShip01); 오류
        abcdCruiseShip01.sail();
        System.out.println("");

        System.out.println("어댑터패턴 사용하지 않은 경우(2)----------------------------------------------------");
        AirLine koreanAirLine01 = new KoreanAirLine("런던");
        testAirLineFly(koreanAirLine01);
        System.out.println("");

        System.out.println("어댑터패턴 사용(1)----------------------------------------------------------------");
        AirLine koreanAirLine02 = new AsianaAirLineAdapter(new AsianaAirLine("런던"));
        testAirLineFly(koreanAirLine02);
        System.out.println("");

        System.out.println("어댑터패턴 사용(2)----------------------------------------------------------------");
        AirLine koreanAirLine03 = new AbcdCruiseShipAdapter(new AbcdCruiseShip("런던"));
        testAirLineFly(koreanAirLine03);

    }

    static void testAirLineFly(AirLine airLine){
        airLine.fly();
    }

}
