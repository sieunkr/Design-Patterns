public class WebProgrammer extends Programmer {

    public WebProgrammer(){
        setToolBehavior(new ToolIntellij());
    }

    public void display(){
        System.out.println("저는 웹프로그래머 입니다.");
    }

}
