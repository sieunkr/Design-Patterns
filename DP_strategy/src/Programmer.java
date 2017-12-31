public abstract class Programmer {
    ToolBehavior toolBehavior;

    public Programmer(){
    }

    //방법1
    public void setToolBehavior(ToolBehavior tb){
        toolBehavior = tb;
    }

    //방법2
    public void runProject(StrategyBehavior sb){
        sb.strategy();
    }


    public void programming(){
        System.out.println("모든 프로그래머는 개발(프로그래밍)을 합니다.");
        toolBehavior.use();
    }

    public abstract void display();
}
