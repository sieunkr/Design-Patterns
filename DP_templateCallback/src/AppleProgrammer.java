public class AppleProgrammer extends Programmer {

    public AppleProgrammer(){
        //setToolBehavior(new ToolApple());
    }

    @Override
    public void use() {
        executeTool().use();
    }

    @Override
    public void runProject() {
        //super.runProject();
        executeStrategy().strategy();
    }

    public void display(){
        System.out.println("저는 아이폰 프로그래머입니다.");
    }



    private ToolBehavior executeTool(){
        return new ToolBehavior() {
            @Override
            public void use() {
                System.out.println("맥북,아이폰 등 애플 제품을 사용합니다.");
            }
        };
    }

    private StrategyBehavior executeStrategy(){
        return new StrategyBehavior() {
            @Override
            public void strategy() {
                System.out.println("애자일 방법론으로 프로젝트를 진행합니다.");
            }
        };
    }

}