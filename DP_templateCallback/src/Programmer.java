public abstract class Programmer {
    ToolBehavior toolBehavior;

    public Programmer(){
    }

    public void programming(){
        System.out.println("모든 프로그래머는 개발(프로그래밍)을 합니다.");
        use();
    }

    public abstract void use();

    public void runProject(){};

    public abstract void display();
}
