public class RealConnection implements Connection {

    private String address;

    public RealConnection(String address){
        this.address = address;
    }

    @Override
    public void connect(){
        System.out.println("커넥션 연결 " + address);
    }

    @Override
    public void close() {
        System.out.println("커넥션 종료 " + address);
    }
}
