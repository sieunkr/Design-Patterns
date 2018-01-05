public class Main {
    public static void main(String[] args) {

        Connection connection = new ProxyConnection("127.0.0.1");
        connection.connect();
        connection.close();
    }
}
