public class ProxyConnection implements Connection {
    private RealConnection connection;
    private String address;

    public ProxyConnection(String address){
        this.address = address;
    }

    @Override
    public void connect(){
        if(connection == null){
            connection = new RealConnection(address);
        }
        connection.connect();
    }

    @Override
    public void close() {
        if(connection != null){
            connection.close();
        }
    }
}
