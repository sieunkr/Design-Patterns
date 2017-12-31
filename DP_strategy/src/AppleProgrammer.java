public class AppleProgrammer extends Programmer {

    public AppleProgrammer(){
        setToolBehavior(new ToolApple());
    }

    public void display(){
        System.out.println("저는 아이폰 프로그래머 입니다.");
    }

}