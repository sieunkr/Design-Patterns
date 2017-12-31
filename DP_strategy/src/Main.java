public class Main {

    public static void main(String[] args) {

        Programmer webProgrammer = new WebProgrammer();
        webProgrammer.display();
        webProgrammer.programming();

        System.out.println("");

        Programmer appleProgrammer = new AppleProgrammer();
        appleProgrammer.display();
        appleProgrammer.programming();
        appleProgrammer.runProject(new Agile());

    }
}
