public class WebProgrammer extends Programmer {

    public WebProgrammer(){
        //setToolBehavior(new ToolIntellij());
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
