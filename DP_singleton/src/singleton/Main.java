package singleton;

public class Main {

    public static void main(String[] args) {

        //싱글톤인 경우 해시코드 값이 같음 - 즉, Heap 메모리에 할당된 영역이 같다.
        Singleton singleton01 = Singleton.getInstance();
        Singleton singleton02 = Singleton.getInstance();

        System.out.println(singleton01.hashCode());
        System.out.println(singleton02.hashCode());

        //싱글톤 아닌 경우 해시코드 값이 다름
        NoneSingleton noneSingleton01 = new NoneSingleton();
        NoneSingleton noneSingleton02 = new NoneSingleton();

        System.out.println(noneSingleton01.hashCode());
        System.out.println(noneSingleton02.hashCode());

    }
}
