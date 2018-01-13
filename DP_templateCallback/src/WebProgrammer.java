public class WebProgrammer extends Programmer {

    public WebProgrammer(){
        //setToolBehavior(new ToolIntellij());
        //이렇게 사용하지 않고, 템플릿 콜백 패턴으로 구현한다.
    }

    @Override
    public void use() {
        executeTool().use();
    }

    public void display(){
        System.out.println("저는 웹프로그래머 입니다.");
    }

    private ToolBehavior executeTool(){
        return new ToolBehavior() {
            @Override
            public void use() {
                System.out.println("인텔리J 를 사용합니다.");
            }
        };
    }
}
